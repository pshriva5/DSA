package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root=null;
	}
	
	 	public void insert(int data) {
	 		Node n = new Node(data);
	 		if (root==null) {
	 			root = n;
	 			return;
	 		}
	 		Node current = root;
			Node parent = null;
			while(true){
				parent = current;
				if(data<current.value){
					current = current.left;
					if(current == null){
						parent.left = n;
						return;
					}
				}if(data>= current.value){
					current = current.right;
					if(current == null){
						parent.right = n;
						return;
	 	}
				}
			}
			}
	 	
//	 	public void insert(int i) {
//			// TODO Auto-generated method stub
//			root = insert(root, i);
//		}
//
//
//		private Node insert(Node root, int i) {
//			// TODO Auto-generated method stub
//			if(root == null){
//				root = new Node(i);
//			}else if(i<=root.data){
//				root.left = insert(root.left,i);
//			}else if(i>root.data){
//				root.right = insert(root.right,i);
//			}
//			return root;
//		}
//			
			public void print() {
				// TODO Auto-generated method stub
				if(root == null){
					System.out.println("Tree is empty");
				}
				Queue<Node> queue = new LinkedList<Node>();
				queue.add(root);
				while(!queue.isEmpty()){
					Node n = queue.poll();
					System.out.println(n.value);
					if(n.left != null)queue.add(n.left);
					if(n.right != null)queue.add(n.right);
				}
	 	}

			public void getBFS() {
				if(root == null){
					System.out.println("Tree is empty");
					return;
				}
				System.out.println("BFS is: ");
				Queue<Node> bfs = new LinkedList<>();
				bfs.add(root);
				while(!bfs.isEmpty()) {
					Node r = bfs.poll();
					System.out.println(r.value);
					if(r.left!= null) {
						bfs.add(r.left);
					}
					if(r.right!=null) {
						bfs.add(r.right);
					}
				}
				
			}

			public void getDFS() {
				if(root == null){
					System.out.println("Tree is empty");
					return;
				}
				System.out.println("DFS is: ");
				Stack<Node> dfs = new Stack<>();
				dfs.add(root);
				while(!dfs.isEmpty()) {
					Node r = dfs.pop();
					System.out.println(r.value);
					if(r.left!= null) {
						dfs.add(r.left);
					}
					if(r.right!=null) {
						dfs.add(r.right);
					}
				}
				
			}

			public void getBFSList() {
				ArrayList<ArrayList> bfsList = new ArrayList<ArrayList>();
				if(root == null){
					System.out.println("Tree is empty");
					return;
				}
				System.out.println("BFS List is ");
				Queue<Node> bfs = new LinkedList<>();
				bfs.add(root);
				while(!bfs.isEmpty()) {
					int count = bfs.size();
					ArrayList<Integer> temp = new ArrayList<Integer>();
					for(int i = 0; i<count;i++) {
						Node n = bfs.remove();
						if(n.left!= null) {
							bfs.add(n.left);
						}
						if(n.right!=null) {
							bfs.add(n.right);
						}
						temp.add(n.value);
					}
					bfsList.add(temp);
				}			
				for(ArrayList i:bfsList) System.out.println(i);
			}
}
