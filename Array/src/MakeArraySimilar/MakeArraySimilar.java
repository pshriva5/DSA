package MakeArraySimilar;

public class MakeArraySimilar {

	public static void main(String[] args) {
		int[] A = {3291, 300};
		int[] B = {4321, 321};
		int diff = getDiff(A, B);
		System.out.println(diff);
		}

	private static int getDiff(int[] a, int[] b) {
		int count = 0;
		for (int i=0;i<a.length;i++) {
			int num1 = a[i];
			int num2 = b[i];
			while(a[i] > 0) {
				int temp = a[i]%10 - b[i]%10;
				temp = Math.abs(temp);
				count = count +temp;
				a[i]=a[i]/10;
				b[i]=b[i]/10;
			}
		//String sb = ""+a[i];
		
		/*for(int j=0; j<sb.length(); j++) {
			int temp = a[i]%10 - b[i]%10;
			temp = Math.abs(temp);
			count = count +temp;
			a[i]=a[i]/10;
			b[i]=b[i]/10;
			
		}*/
		
		
		}
		
		return count;
	}
	}


