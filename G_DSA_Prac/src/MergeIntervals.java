
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
	int start;
	int end;

	MergeIntervals() {
		start = 0;
		end = 0;
	}

	MergeIntervals(int s, int e) {
		start = s;
		end = e;
	}

	public static void main(String[] args) {
		List<MergeIntervals> intervals = new ArrayList<MergeIntervals>();
		MergeIntervals inp = new MergeIntervals();
		inp.start = 1;
		inp.end = 3;
		intervals.add(inp);
		MergeIntervals inp1 = new MergeIntervals();
		inp1.start = 2;
		inp1.end = 6;
		intervals.add(inp);
		inp.start = 8;
		inp.end = 10;
		intervals.add(inp);
		inp.start = 15;
		inp.end = 18;
		intervals.add(inp);

		List<MergeIntervals> res = merge(intervals);
	}


	private static List<MergeIntervals> merge(List<MergeIntervals> intervals) {
		  List<MergeIntervals> result = new ArrayList<MergeIntervals>();
	       
//	        Collections.sort(intervals, new Comparator<MergeIntervals>());
	        for(MergeIntervals i: intervals) {
	            System.out.println(i.start+ " "+ i.end);
	                
	            }
	        return result;
	        }
}

	
