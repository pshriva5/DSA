package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(18);
		bst.insert(5);
		bst.insert(4);
		bst.insert(7);
		bst.insert(23);
		bst.print();
		bst.getBFS();
		bst.getDFS();
		bst.getBFSList();

	}

}
