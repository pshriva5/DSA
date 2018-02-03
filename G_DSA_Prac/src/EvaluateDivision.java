import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EvaluateDivision {

	public static void main(String[] args) {
		String[][] eqn =  { {"a", "b"}, {"b", "c"} };
		double[] values = {2.0, 3.0};
		String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
		
		double [] res = calcEquation(eqn, values, queries);
		
		for(double d: res) System.out.println(d);

	}

	private static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		double[] res = new double[queries.length];
		HashMap<String, Double> hm = new HashMap<String, Double>();
		for(int i=0; i<equations.length; i++) {
			String eNumerator = equations[i][0];
			String eDeno = equations[i][1];
			double num = values[i];
			double deno = 1;
			hm.put(eNumerator, num);
			hm.put(eDeno, deno);
	
		}
		for (Entry<String, Double> e : hm.entrySet()) {
		    System.out.println("Key "+e.getKey()+" Val "+  e.getValue());
		}
		
		
		for(int i=0; i<queries.length; i++) {
						
			String qNumerator = queries[i][0];
			String qDeno = queries[i][1];
			if(qNumerator.equals(qDeno) && (hm.containsKey(qNumerator) && hm.containsKey(qDeno) )) res[i] = 1.0;
			if(!hm.containsKey(qNumerator) || !hm.containsKey(qDeno)) res[i]=-1;
			
		}
		
		return res;
	}

}
