package src;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	Node first;
	public LinkedList() {
		first = null;
	}
	public void Insert(int i) {
		Node n = new Node(i);
		Node temp = first;
		if (first==null) {
			first = n;
			return;
		}
		
		while(temp.next!= null){
			temp=temp.next;
		}
		temp.next = n;
	}
	public void printAll() {
		Node temp = first;
		while(temp!= null){
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
		
	}
	public void removeDuplicates() {
		Set<Integer> hs = new HashSet<Integer>();
		
	}

}
