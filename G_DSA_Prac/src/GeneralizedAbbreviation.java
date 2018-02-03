import java.util.ArrayList;

public class GeneralizedAbbreviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "word";
		ArrayList<String> ga = getGenralizedAbbreviation(str);
		System.out.println(ga);
	

	}

	private static ArrayList<String> getGenralizedAbbreviation(String str) {

		ArrayList<String> res = new ArrayList<String>();
		int counter = 0;
		if(str==null || str.length()==0) {
			return res;
		}
	
		for(int i=0; i<str.length();i++) {
			if(counter==0) {
				res.add(str);
				counter++;
			}
			for(int j=0; j<str.length();j++) {
				if(j+counter<=str.length()) {
				String abbr = str.substring(0, j) + counter+ str.substring(j+counter);
				res.add(abbr);}
				
			}
			counter++;
		}
	 return res;
	}

}
