import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String s = "[]";
		boolean res = isValid(s);
		System.out.println(res);
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++) {
            // Push any open parentheses onto stack
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            
            // Check stack for corresponding closing parentheses, false if not valid
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        // return true if no open parentheses left in stack
        return stack.isEmpty();
		
	}

}
