import java.util.Arrays;

public class ThreeSumSmaller {

	public static void main(String[] args) {
		int[] arr = {-2,0,1,3};
		int target = 2;
		int res = threeSumSmaller(arr, target);
		System.out.println(res);

	}

	private static int threeSumSmaller(int[] arr, int t) {
		if(arr==null || arr.length<3) {
			return 0;
		}
		int res =0;
		Arrays.sort(arr);
		for(int i = 0; i<arr.length-2;i++) {
			int j=i+1;
			int k = arr.length-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>t) {
				k--;
			}else{
				j++;
				res++;
				}
				}
			}
		return res;
	}

}
