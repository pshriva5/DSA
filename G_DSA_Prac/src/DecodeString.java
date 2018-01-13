import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		String s = "3[a2[c]]";
		decodeString(s);
	}


	//3[a12[cb]]
	
	private static void decodeString(String s) {
		Stack<String> st = new Stack<String>();
		String res = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			res = "";
			char ch = s.charAt(i);
			if (ch != ']') {
				st.push(Character.toString(ch));
				continue;
			}
			String str = "";
			while (!st.peek().equals("[")) {
				str = st.pop() + str;
			}
			String open = st.pop();
			String c = "";
			int count = 0;
			while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
				String r = st.pop();
				c = r + c;
			}
			count = Integer.parseInt(c);
			for (int j = 0; j <= count - 1; j++) {
				res = res + str;
			}
			st.push(res);
		}
		String result = st.pop();
		System.out.println("Final result is  " + result);
}
}
