package ReplaceCharacterinAString;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
		String LongestStr = longestSubstrin(s);
		System.out.println(LongestStr);

	}

	private static String longestSubstrin(String s) {
		StringBuilder str = new StringBuilder();
		
		int count= 0;
		for (int i = 0; i<s.length();i=i+2) {
			str.append(s.charAt(i));
			if(s.charAt(i)!=s.charAt(i+1)){
				str.append(s.charAt(i+1));
				
			}
			
		}
		
		
		return str.toString();
	}

}
