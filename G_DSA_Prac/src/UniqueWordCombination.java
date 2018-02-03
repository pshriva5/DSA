import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCombination {

	public static void main(String[] args) {
		ArrayList <String> Dict = new ArrayList<String>(Arrays.asList("deer","door", "cake", "card"));
		System.out.println(isUnique("door", Dict));
	}

	private static Boolean isUnique(String string, ArrayList<String> dict) {
		StringBuilder s1 = new StringBuilder();
		s1.append(string.charAt(0));
		s1.append(string.length()-2);
		s1.append(string.charAt(string.length()-1));
		Boolean flag = false;
	
		Map<String,String> hm = new HashMap<String, String>();
		for(int i=0;i<dict.size();i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(dict.get(i).charAt(0));
			sb.append((dict.get(i).length())-2);
			sb.append(dict.get(i).charAt(dict.get(i).length()-1));
			hm.put(dict.get(i),sb.toString());
			
		}
		if(hm.containsValue(s1.toString())){
			if(hm.containsKey(string)) {
				flag=true;
			}
		}
		
		return flag;
	}
}

//	private static Boolean isUnique(String string, ArrayList<String> dict) {
//		StringBuilder s1 = new StringBuilder();
//		s1.append(string.charAt(0));
//		s1.append(string.length()-2);
//		s1.append(string.charAt(string.length()-1));
//		for(int i=0;i<dict.size();i++) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(dict.get(i).charAt(0));
//			sb.append((dict.get(i).length())-2);
//			sb.append(dict.get(i).charAt(dict.get(i).length()-1));
//			System.out.println("A "+s1.toString()+" B "+sb.toString());
//			if(s1.toString().equals(sb.toString())) {
//				return false;
//			}
//		}
//		return true;
//		
//	}
//}
	
