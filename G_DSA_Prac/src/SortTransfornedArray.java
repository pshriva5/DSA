import java.util.PriorityQueue;
import java.util.Queue;

public class SortTransfornedArray {
	
	
	
	public static void main(String[] args) {
		int[] arr = {-4,-2, 2, 4};
		int a = 1;
		int b = 3;
		int c = 5;
		int[] res = SortTransArr(arr, a,b,c);
		for(int i: res) {
			System.out.println(i);
		}
	}

	private static int[] SortTransArr(int[] arr2, int a2, int b2, int c2) {
		int[] res = new int[arr2.clone().length];
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0;i<arr2.length;i++) {
			int k = a2*(arr2[i]*arr2[i]) + b2*(arr2[i]) + c2;
			queue.add(k);
		}
		for(int i=0; i<arr2.length;i++) {
			res[i]=queue.poll();
		}
		return res;
	}

}
