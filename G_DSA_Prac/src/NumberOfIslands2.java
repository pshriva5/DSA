import java.util.ArrayList;
import java.util.List;

public class NumberOfIslands2 {

	public static void main(String[] args) {
		int[][] arr = {{0,0,0,0},
						{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0}};
		int[][] dir = {{1,1},{1,2}};
		
		List result = numIslands2(arr, dir);
		System.out.println(result);

	}

	private static List numIslands2(int[][] arr, int[][] dir) {
		List<Integer> result = new ArrayList<Integer>();
		if(arr.length==0 || arr==null) return result;
		int res=0;
		for(int i=0;i<dir.length;i++) {

			
//			if((dir[i][0]-1)>=0 && (dir[i][1]-1)>=0 && (dir[i][1]+1)<arr.length && (dir[i][0]+1)<arr.length ){
				
			if(arr[dir[i][0]][dir[i][1]]==0 && arr[dir[i][0]-1][dir[i][1]]==0 && arr[dir[i][0]][dir[i][1]-1]==0 && arr[dir[i][0]][dir[i][1]+1]==0 && arr[dir[i][0]+1][dir[i][1]]==0){
				System.out.println("inide "+arr[dir[i][0]][dir[i][1]-1]);
				System.out.println("arr 11 "+ arr[1][1]);
				res++;			
			}
			result.add(res);
			arr[dir[i][0]][dir[i][1]]=1;

			}

			
			
		return result;
		}
		
	}

	
