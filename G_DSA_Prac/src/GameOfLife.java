//n<2 1->0
//n=2/3 --
//n>3 1->0
//n=3 0->1
public class GameOfLife {

	public static void main(String[] args) {
		int [][] board = {{1,1,0,1},
				{0,0,1,0},
				{1,0,0,0},
				{1,0,0,1}};
		gameOfLife(board);
		int row = board.length;
		int cols = board[0].length;
		 for (int i = 0; i < row; i++) {
		        for (int j = 0; j < cols; j++) {
		            System.out.println(board[i][j]);
		        }
		    }
	}

	private static void gameOfLife(int[][] board) {
		if(board==null || board.length==0) {
			return;
		}
		int row = board.length;
		int cols = board[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				 int neighbors = getNeighbour(board, i, j);
                 if(board[i][j]==1){
                     if(neighbors==2 || neighbors==3)
                         board[i][j]=3;
                 }else{
                     if(neighbors==3)
                         board[i][j]=2;
                 }
             }
         }    
         for(int i=0;i<row;++i){
             for(int j=0;j<cols;++j){
                 board[i][j]>>=1;
             }
         }
     }
	public static int getNeighbour(int[][] board, int row, int col){
        int cnt=0;
        for(int i=row-1;i<=row+1;++i){
            for(int j=col-1;j<=col+1;++j){
                if(i>=0 && i<board.length && j>=0 && j<board[0].length &&(board[i][j]==1 || board[i][j]==3)){
               	 cnt++;
                }
            }
        }
        if(board[row][col]==1||board[row][col]==3) cnt--;
        return cnt;
    }

 }