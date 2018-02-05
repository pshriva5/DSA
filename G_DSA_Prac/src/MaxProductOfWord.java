
public class MaxProductOfWord {

	public static void main(String[] args) {
		String[] words = {"ab","abc","d","cd","bcd","abcd"};
		int res = findMaxProdOdWords(words);
		System.out.println(res);
		

	}

	private static int findMaxProdOdWords(String[] words) {
		int res = 0;
		int i =0;
		while(i<=words.length-1) {
			int comp = i+1;
			for(int j=0;j<words[i].length();j++) {
				char ch = words[i].charAt(j);
				if(comp<words.length && !words[comp].contains(ch+"")) {
					System.out.println("Comparision false for: "+ words[comp] + " and "+ ch);
					res = words[comp].length()*words[i].length();
					Math.max(res, words[comp].length()*words[i].length());
				}
				else if(comp<words.length) {
					System.out.println("Comparision True for: "+ words[comp] + " and "+ ch);
				}
				comp++;
				
			}
			i++;
		}
		return res;
	}

}
