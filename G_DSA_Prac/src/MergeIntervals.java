
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

//public List<Interval> merge(List<Interval> intervals) {
//	// sort start&end
//	int n = intervals.size();
//	int[] starts = new int[n];
//	int[] ends = new int[n];
//	for (int i = 0; i < n; i++) {
//		starts[i] = intervals.get(i).start;
//		ends[i] = intervals.get(i).end;
//	}
//	Arrays.sort(starts);
//	Arrays.sort(ends);
//	// loop through
//	List<Interval> res = new ArrayList<Interval>();
//	for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
//		if (i == n - 1 || starts[i + 1] > ends[i]) {
//			res.add(new Interval(starts[j], ends[i]));
//			j = i + 1;
//		}
//	}
//	return res;
//}

	
