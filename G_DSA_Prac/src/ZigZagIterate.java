import java.util.Vector;

public class ZigZagIterate {

	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<Integer>(); 
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		Vector<Integer> v2= new Vector<Integer>(); 
		v2.add(1);
		v2.add(2);
		zigzagIterate(v1,v2);

	}

	private static void zigzagIterate(Vector<Integer> v1, Vector<Integer> v2) {
		int l = v1.size()+v2.size();
		int c1=0;
		int c2=0;
		for(int i = 0; i<l; i++) {
			if(i%2==0 || v2.size()<=c2) {
				System.out.println("v1 " + v1.get(c1));
				c1++;
			} else if (i%2!=0 || v1.size()<=c1){
				System.out.println("v2 " + v2.get(c2));
				c2++;
			}
		}
		
	}

}
