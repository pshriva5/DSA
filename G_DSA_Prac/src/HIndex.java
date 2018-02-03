
public class HIndex {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		int res = getHIndex(citations);
		System.out.println(res);

	}

	private static int getHIndex(int[] citations) {
		int[] bucket = new int[citations.length + 1];
		for(int i=0; i<bucket.length; i++) {
			
		}
		return 0;
	}

}
