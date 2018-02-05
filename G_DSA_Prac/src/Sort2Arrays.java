import java.util.Arrays;

public class Sort2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,7,4,3,18,9};
		int[] arr2 = {22,4,6,24,50};
		int[] res = sortTwoArrays(arr1, arr2);
		for(int i: res) System.out.println(i);
	}

	private static int[] sortTwoArrays(int[] arr1, int[] arr2) {
		Arrays.sort(arr1); // 1,3,4,7,9,18
		Arrays.sort(arr2); // 4,6, 22, 24,50
		int len = arr1.length+arr2.length;
		int[] res = new int[len];
		int i=0;
		int l = 0;
		int r = 0;
		while(l<arr1.length && r<arr2.length) {
			if(arr1[l]<arr2[r]) {
				res[i++]=arr1[l];
				l++;
			}
			else {
				res[i++]=arr2[r];
				r++;
			}
		}
		while(r<arr2.length) {
			res[i++] = arr2[r++];
		}
		while(l<arr1.length) {
			res[i++] = arr1[r++];
		}
		return res;
	}

}
