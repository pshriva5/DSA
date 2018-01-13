import java.util.HashSet;

public class MinDistinct {

	public static void main(String[] args) {
		int[] A = {3,4,8,2,2,8,1,3,4,2};;
		int subArrLen = subArrayLen(A);
		System.out.println(subArrLen);

	}

	private static int subArrayLen(int[] a) {
		int length = Integer.MAX_VALUE;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i=0; i <a.length;i++) {
			hs.add(a[i]);
			
			
		}
		
		
		
		for (int j=0; j<a.length;j++) {	
			int ctr =0;
			HashSet<Integer> hs1 = new HashSet<Integer>();
			for (int k=j; k<a.length;k++){
				//System.out.println("I am on element " + a[k]);
				hs1.add(a[k]);
				ctr++;
				//System.out.println("Count increased to " + ctr);
				if(hs1.size()==5) {
					//System.out.println("C "+ctr);
					length=Math.min(length, ctr);
					break;
				
			}
				

			
		}
		
		
		
		
	}
		return length;
	}
}

