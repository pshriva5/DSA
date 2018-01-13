import java.util.Arrays;
import java.util.Vector;

public class EncodeNDecodeString {

	public static void main(String[] args) {
		String[] arr= {"The", "Name", "Is", "33k","", "4"};
		Vector<String> strs = new Vector<String>(Arrays.asList(arr)) ;
		String encoded_string = encode(strs);
		System.out.println(encoded_string);
		Vector<String> strs2 = decode(encoded_string);
		for(String i: strs2) {
			System.out.println(i);
		}
		

	}

	private static Vector<String> decode(String encoded_string) {
		String[] str = encoded_string.split("#");
		Vector<String> strs = new Vector<String>();
		for(int i=0; i<=str.length-1;i+=2) {
		strs.add(str[i]);
		}
		return strs;
	}

	private static String encode(Vector<String> strs) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=strs.size()-1;i++) {
			int c =0;
			c = strs.get(i).length();
			sb.append("#");
			sb.append(c);
			sb.append("#");
			sb.append(strs.get(i));
		}
		return sb.toString();
	}

}
