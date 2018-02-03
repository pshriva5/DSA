import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		List<String> res = missingRanges(nums);
		
		System.out.println(res);

	}

	private static List<String> missingRanges(int[] nums) {	
	    ArrayList<String> list = new ArrayList<String>();
	    if(nums.length==1) {
			list.add(nums[0]+"");
			return list;
					}
	    for(int i = 0; i<nums.length; i++) {
	    	StringBuilder sb = new StringBuilder();
	    	int start = nums[i];		    	
	    	while((i < nums.length-1) && (nums[i]+1)==nums[i+1]) {	 
	    		i++;
	    	}
	    	if(start!=nums[i]) {
	    		sb.append(start);
	    		sb.append("->");
	    		sb.append(nums[i]);
	    	}else {
	    		sb.append(start);
	    	}
	    	    	
	    	list.add(sb.toString());
	    }
	    
		return list;
		
	}


}
