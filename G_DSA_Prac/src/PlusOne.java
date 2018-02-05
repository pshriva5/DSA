import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no = new int[] {9};
		int[] res = plusOne(no);
		for(int i:res) {
			System.out.println(i);
		}
	}


	
	
	public static int[] plusOne(int[] digits) {
        
		for (int i = digits.length - 1; i >=0; i--) {
	        if (digits[i] != 9) {
	            digits[i]++;
	            break;
	        } else {
	            digits[i] = 0;
	        }
	    }
	    if (digits[0] == 0) {
	        int[] res = new int[digits.length+1];
	        res[0] = 1;
	        return res;
	    }
	    return digits;
	}
	
	
	
	
	
	
//	public static int[] plusOne(int[] digits) {
//        
//	      String d = "";
//			for(int i=0;i<digits.length;i++) {
//				d = ""+d+digits[i];
//			}
//			
//			BigInteger dig = new BigInteger(d);
//			BigInteger o = new BigInteger("1");
//			dig= dig.add(o);
//			d=dig+"";
//			int[] res = new int[d.length()];
//			for(int j=0; j<d.length();j++) {
//				res[j]=Character.getNumericValue(d.charAt(j));
//			}
//			
//			return res;
//	}
	}

