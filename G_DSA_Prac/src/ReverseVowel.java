
public class ReverseVowel {

	public static void main(String[] args) {
		String str = "Hello World";
		reverseVowel(str);
	}

	static boolean isVowel(char c)
	{
	    return (c=='a' || c=='A' || c=='e' ||
	            c=='E' || c=='i' || c=='I' ||
	            c=='o' || c=='O' || c=='u' ||
	            c=='U');
	}
	private static void reverseVowel(String str) {
		int l = 0;
		int r =str.length()-1;
		char[] s = str.toCharArray();
		
		while(l<r) {
			if(!isVowel(s[l])) {
				l++;
				continue;
			}
			if(!isVowel(s[r])) {
				r--;
				continue;
			}	
			swap(s,l,r);
			l++;
			r--;				
			}

		System.out.println(s);
		}

	private static void swap(char[] str1, int l, int r) {
		char temp;
		temp = str1[l];
		str1[l] = str1[r];
		str1[r] = temp;
	}
		
		
	}


