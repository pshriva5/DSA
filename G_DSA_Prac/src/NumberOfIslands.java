
public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] arr = {{'0','1','1'},
						{'1','0','0'},
						{'0','0','1'}};
		int res = numIslands(arr);
		System.out.println(res);

	}

	private static int numIslands(char[][] grid) {
		int res = 0;
		if(grid.length==0 || grid ==null) {
			return res;
		}
		int rows = grid.length;
		int cols = grid[0].length;
		for(int i =0;i<rows;i++) {
		for (int j = 0; j<cols;j++) {
			if(grid[i][j]=='0') continue;
			res++;
			coverIslands(i,j,grid);
			
		}
		}
		
		return res;
	}

	private static void coverIslands(int i, int j, char[][] grid) {	
		if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1 ||grid[i][j]=='0') {
			return;
		}
		grid[i][j]='0';	
		coverIslands(i+1,j,grid);
		coverIslands(i,j+1,grid);
		coverIslands(i-1,j,grid);
		coverIslands(i,j-1,grid);
		
	}

}
