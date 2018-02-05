import java.util.ArrayList;
import java.util.Collections;

public class MissingRanges {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(1);
		l1.add(3);
		l1.add(50);
		l1.add(75);
		missingRanges(l1);

	}

	private static void missingRanges(ArrayList<Integer> l1) {
		StringBuilder sb = new StringBuilder();
		int i=0;
			if(l1.get(i)>0) {
				if(l1.get(i)==1) {
					sb.append("0");
					sb.append(" ");
				}
				else if(l1.get(i)>1) {
					sb.append(0);
					sb.append("->");
					sb.append(l1.get(i+1)-1);
					sb.append(" ");
				}
		}
		
		
		for(i = 1; i<=l1.size()-2;i++) {
			if(l1.get(i+1)-l1.get(i)>1) {
				if(l1.get(i+1)-l1.get(i)==2) {
					sb.append(l1.get(i)+1);
					sb.append(" ");
				}
				else if(l1.get(i+1)-l1.get(i)>2) {
					sb.append(l1.get(i)+1);
					sb.append("->");
					sb.append(l1.get(i+1)-1);
					sb.append(" ");
				}
				
			}
			
		}
		if(l1.get(l1.size()-1)<99) {
			sb.append(l1.get(l1.size()-1)+1);
			sb.append("->");
			sb.append(99);
		}
		
	    String[] s1 = sb.toString().split(" ");
	    ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, s1);
		System.out.println(list);
	}


}

/*public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        for(int i : nums) {
            if(i > lower) res.add(lower+((i-1 > lower)?"->"+(i-1):""));
            if(i == upper) return res; // Avoid overflow
            lower = i+1;
        }
        if(lower <= upper) res.add(lower + ((upper > lower)?"->"+(upper):""));
        return res;
    }
}*/
