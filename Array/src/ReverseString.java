import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {
	public static void main(String argss[]) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	        String text = "";  
	        String rev = "";
	        do
	        {
	            System.out.println("Please enter a string: ");
	            text = br.readLine(); 
	            rev = reverseString(text);
	            System.out.println("Reverse of the string is "+ rev);
	        }
	        while (!text.equals("stop"));
	}

	private static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i>=0;i--) {
			sb.append(s.charAt(i));
			
		}

		return sb.toString();
		
	}

}
