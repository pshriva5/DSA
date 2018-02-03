
public class FindTheDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		char res = findTheDifference(s,t);
		System.out.println("Result is " + res);

	}

	private static char findTheDifference(String s, String t) {
		char res = '\0';
		int[] arr = new int[26];
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch - 'a']++;
		}
		for(int i =0; i<t.length(); i++) {
			char ch = t.charAt(i);
			arr[ch-'a']--;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==-1) {
				return (char) ('a'+ i);
			}
		}
		
		return res;
}
}
