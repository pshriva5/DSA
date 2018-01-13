package ReplaceCharacterinAString;

public class Main {
	public static void main(String args[]) {
		String str = "Pranjali";
		char c = 'r';
		int pos = 3;
		str = replace(str, pos, c);
		System.out.println("Replaced string : " +str);
	}

	private static String replace(String str, int index, char c) {
		String s = "";
		s = str.substring(0, index-1) + c + str.substring(index+1, str.length());
		return s;
	}
}
