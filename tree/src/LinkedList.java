
// O[n^2] and in place
public class LinkedList {
	Node first;
	public LinkedList(){
		first = null;
	}
	static class Node{
		int data;
		Node next;
		public Node(int element, Node next){
			data = element;
			this.next = next;
		}
	}
	void add(int element) {
		
		Node n = new Node(element, null);
		Node temp = first;
				if(first == null){
					first = n;
					return;
				}
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next = n;
	}
	
	void display(){
		Node temp = first;
		while(temp.next != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String args[]){
		LinkedList llist = new LinkedList();
		llist.add(2);
		llist.add(3);
		llist.add(6);
		llist.add(43);
		llist.add(2);
		llist.add(3);
		llist.add(9);
		llist.add(2);
		llist.add(43);
		llist.display();
		//removing duplicates
		llist.removeDuplicates();
		System.out.println("After removing duplicates ");
		llist.display();
		
	}
	
	
	
	/*void removeDuplicates(){ // the code commented below also works the same, only with more calculations but same time complexity
		Node current = first;
		while(current!= null){
			Node runner = current;
			while(runner.link != null){
				if(runner.link.data == current.data){
					runner.link = runner.link.link;
				}else{
					runner = runner.link;
				}
			}
			current = current.link;
		}
		
	}*/
	void removeDuplicates() {
		// TODO Auto-generated method stub
		if(first != null){
			Node temp = first;
			temp = first;
			while(temp != null){ //comparing each element with all other elements in the linked list and removing the 2nd occurance
				Node temp1 = temp.next;
				Node previous = temp;
				while(temp1 != null){
					if(temp.data == temp1.data){
						previous.next = temp1.next;
						temp1 = temp1.next;
					}
					else{
						previous = temp1;
						temp1 = temp1.next;
					}
				}
				temp = temp.next;
			}
		}else{
			System.out.println("There are no elements in linked list");
		}
	}
	
}
