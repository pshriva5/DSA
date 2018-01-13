
public class WiggleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5,9,8,10,13,11};
		wiggleSort(arr);
	}

	private static void wiggleSort(int[] arr) {
		if(arr.length<=1 || arr==null) {
			return;
		}
				
		for(int i=0; i<=arr.length-2;i++) {
			if(i%2==0) {
				if(arr[i]>arr[i+1])
					swap(i, arr);
			}else {
				if(arr[i]<arr[i+1])
					swap(i, arr);
			}
		}
		for(int i: arr) {
		System.out.println(i);
		}
	}

	private static void swap(int i, int[] arr) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
		
	}

	

}
