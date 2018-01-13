import java.util.Stack;

public class LongestAbsolutePath {

	public static void main(String[] args) {
		String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		
		String[] token = path.split("\n");
		Stack <Integer> St = new Stack<Integer>();
		int len = 0;
		int currLen = 0;
		int maxLength = 0;
		
		for (String str: token) {
			int level = str.length() - str.replaceAll("\t", "").length();
			if (St.size()>level) {
				int l = St.pop();
				currLen -= l;
			}
			
			len = str.replaceAll("\t","").length() + 1;
			currLen += len;
			
			if (str.contains(".")) {
				maxLength = Math.max(maxLength, currLen - 1);
			}
			 
			St.push(len);
		}
		System.out.println("Maximum Length is: "+ maxLength);
	}

}
