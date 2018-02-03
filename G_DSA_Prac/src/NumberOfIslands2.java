import java.util.ArrayList;
import java.util.List;

public class NumberOfIslands2 {

	public static void main(String[] args) {
		int[][] arr = {{0,0,0,0},
						{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0}};
		int[][] dir = {{0,1},{1,2},{1,3}};
		
		List result = numIslands2(arr, dir);
		System.out.println(result);

	}
	
	
	

	private static List numIslands2(int[][] arr, int[][] dir) {
		List<Integer> result = new ArrayList<Integer>();
		if(arr.length==0 || arr==null) return result;
		int res=0;	
		for(int i=0;i<dir.length;i++) {
			if(arr[dir[i][0]][dir[i][1]]==1) continue;
			boolean hasIsland = getIslandAround(arr, dir[i]);
			if(!hasIsland) res++;
			result.add(res);
			arr[dir[i][0]][dir[i][1]]=1;
		}
		return result;
	}


	private static boolean getIslandAround(int[][] arr, int[] is) {
		int x = is[0];
		int y = is[1];
		if(x>=0 && x<arr.length && y>=0 && y<arr.length) {
			if(x-1>=0 && arr[x-1][y] == 1) return true;
			if(y-1>=0 && arr[x][y-1] == 1) return true;
			if(x+1<arr.length && arr[x+1][y] == 1) return true;
			if(y+1<arr[0].length && arr[x][y+1] == 1) return true;		
		}
		return false;
	}
}




//	private static List numIslands2(int[][] arr, int[][] dir) {
//		List<Integer> result = new ArrayList<Integer>();
//		if(arr.length==0 || arr==null) return result;
//		int res=0;
//		for(int i=0;i<dir.length;i++) {
//
//			int x = dir[i][0];
//			int y = dir[i][1];
////			if((dir[i][0]-1)>=0 && (dir[i][1]-1)>=0 && (dir[i][1]+1)<arr.length && (dir[i][0]+1)<arr.length ){
//				
//			if(arr[x][y]==0 && (x-1>=0 && arr[x-1][y]==0) && (arr[x][y-1]==0) && arr[dir[i][0]][dir[i][1]+1]==0 && arr[dir[i][0]+1][dir[i][1]]==0){
//				System.out.println("inside "+arr[dir[i][0]][dir[i][1]-1]);
//				System.out.println("arr 11 "+ arr[1][1]);
//				res++;			
//			}
//			result.add(res);
//			arr[dir[i][0]][dir[i][1]]=1;
//
//			}	
//			
//		return result;
//		}
//		
//	}

	
