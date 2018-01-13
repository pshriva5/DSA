public class LongestConsecutiveSequenceBT {
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int val){
			this.data = val;
		}
	}
	

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left =  new Node(3);
		root.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.right.left = new Node(7);
		root.right.right.left.left = new Node(8);
		root.right.right.left.left.right = new Node(9);
		int res = getLongestConcSeqBT(root);
		System.out.println(res);
	}


	private static int getLongestConcSeqBT(Node root) {
		return getMaxLen(root, 0, 1);	
	}
	private static int getMaxLen(Node root, int parent, int length){
		if(root == null) {
			return length-1;
		}
		length = (root.data - parent == 1)?length:1;
		int lCount = getMaxLen(root.left, root.data, length+1);
		int rCount = getMaxLen(root.right, root.data, length+1);
		return Math.max(length, Math.max(lCount, rCount));
	
	}

}