public class SentenceScreenFitting {
	public static void main(String[] args) {
		String[] Sen = {"I", "had", "apple", "pie"};
		int row = 4;
		int col = 5;
		System.out.println("ANS " + sentenceScreenFit(Sen,row,col));

	}

	private static int sentenceScreenFit(String[] sen, int row, int col) {
		int screenLen = row*col;
		StringBuilder sb = new StringBuilder();
		int Count=col;
		int result = 0;
		int i = 0;
		while(screenLen>0) {
		for( i = 0; i<=sen.length-1; i++) {
			if(screenLen<=0) { //20   I
				break;
			}
			if(Count==0) { //5
				Count=col;
			}
			if(Count>sen[i].length()) {
				sb.append(sen[i]);
				sb.append("-");
				Count = Count-sen[i].length()-1; 
				screenLen = screenLen - sen[i].length()-1;
				continue;
			} 
			if (Count==sen[i].length()){
				sb.append(sen[i]);
				Count = Count-sen[i].length();
				screenLen = screenLen - sen[i].length();
				continue;
			}
			if(Count<sen[i].length()) {
				sb.append("-");
				Count--;
				screenLen--;
			}
		}
		}
		System.out.println(sb.toString());
		String res = sb.toString();
		for(int j = 0; j<res.length(); j++){
			String[] res1 = res.split(sen[sen.length-1]);
			result = res1.length;
		}
		return --result;
	}
}