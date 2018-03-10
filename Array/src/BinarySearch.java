
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2,8,9,10,13,18};
		int val = 18;
		System.out.println(binarySearch(arr, val));

	}

	private static int binarySearch(int[] arr, int val) {
		int l = 0;
		int r = arr.length-1;
		int mid = 0;
		while(l<=r) {
			mid = l + (r-l)/2;
			if(arr[mid]==val) {
				System.out.println("Value found at index: "+ mid);
				return mid;
			}
			else if(arr[mid]>val) {
				r = mid-1;
			}
			else {
				l = mid+1;
				
			}		
		}
		return -1;
		
	}
}
