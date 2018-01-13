import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

	public static void main(String[] args) {
		String Str = "aabacbebebe";
		int K = 3;
		System.out.println(Solution(Str,K));
	

	}

	private  static int Solution(String str, int K) {
		Map <Character, Integer> hm = new HashMap <Character, Integer>();
		int maxLen = 0;
		int left = 0;
		for(int i =0; i<= str.length()-1; i++) {
			char c = str.charAt(i);
			if(hm.containsKey(c)) {
			hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
			if(hm.size()>K) {
				maxLen = Math.max(maxLen, (i-left));
				while(hm.size()>K) {
					char ch = str.charAt(left);
					if(hm.get(ch)==1){
						hm.remove(ch);
					} else {
					hm.put(ch, hm.get(ch)-1);
					}
					left++;
					
				}
				
			}
			
		}
				
		maxLen = Math.max(maxLen, str.length()-left);
		return maxLen;
	}

}
