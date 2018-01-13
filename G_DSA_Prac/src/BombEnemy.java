public class BombEnemy {
	public static void main(String args[]){
		char[][] grid = {{'0', 'E', '0', '0'},
				         {'E', '0', 'W', 'E'},
				         {'0', 'E', '0', '0'}};
		int result = maxKilledEnemies(grid);
		System.out.println("Maximum number enemies that could be killed is " + result);
	}

	private static int maxKilledEnemies(char[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int result=0;
		int maxResult = 0;
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(grid[i][j] != '0')
					continue;
				result=0;
				
				for(int k=0;k<cols;k++) {
					if(grid[i][k]=='E'){
						result++;
			
					}
					if(grid[i][k]=='W') {
						break;
					}
					
				}	
				
							
				for(int l=0;l<rows;l++) {
					if(grid[l][j]=='E'){
						result++;	
					}
					if(grid[l][j]=='W') {
						break;				
					}
					
				}
				
				maxResult = Math.max(result,maxResult);
				
		}
		}
	
		return maxResult;
	}
}