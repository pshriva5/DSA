
public class FibonacciNumber {
	static int a = 0;
	static int b = 1;
	static int n = 7;
	static int c = 0;
	public static void main(String[] args) {
	
		fib(n-2);
		System.out.println(c);

	}
//	private static void printFib(int n) {
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		for(int i = 2; i<=n;i++) {	
//			c = a+b;
//			a = b;
//			b = c;
//		}
//		System.out.println("Fibonacci number is " +c);
//	}

	
private static void fib(int count) {
	if(count>0){    
        c = a + b;    
        a = b;    
        b = c;       
        fib(count-1);
}

}
}
