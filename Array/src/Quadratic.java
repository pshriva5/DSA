import java.util.ArrayList;
import java.util.Collections;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,-2 , 2 ,4};
		
		int a=1;
		int b=3;
		int c = 5;
		ArrayList<Integer> nums = quadratic(arr,a,b,c);
		for(int i: nums) {System.out.println(i);}
	}

	private static ArrayList<Integer> quadratic(int[] arr, int a, int b, int c) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			
			nums.add(quad(arr[i],a,b,c));
		}
		Collections.sort(nums);
		return nums;
	}

	private static int quad(int i, int a, int b, int c) {
		// TODO Auto-generated method stub
		int x = a *(i*i)+b*i + c;
		return x;
	}

}
