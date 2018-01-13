
public class StrobogramaticNo {

	public static void main(String[] args) {
		String st = "639";
		boolean res = isStrobogramatic(st);
		System.out.println(res);

	}

	private static boolean isStrobogramatic(String st) {
		int l = 0;
		int r = st.length()-1;
		while(l!=r) {
			if(!(st.charAt(l)=='6')||!(st.charAt(l)=='9')|| !(st.charAt(l)=='8') || !(st.charAt(l)=='1') || !(st.charAt(l)=='0')) {
				return false;
		}
			if(st.charAt(l)!=st.charAt(r)) {
				return false;
			}
			l++;
			r--;
	}
		return true;

//	private static boolean isStrobogramatic(String num) {
//		for (int i=0, j=num.length()-1; i <= j; i++, j--)
//	        if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
//	            return false;
//	    return true;
		
	}

}
