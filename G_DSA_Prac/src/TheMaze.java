class TheMaze{
	   public boolean hasPath(int[][] maze, int[] start, int[] destination) {
	        int m=maze.length;
	        int n=maze[0].length;
	        boolean[][] visited = new boolean[m][n];
	        visited[start[0]][start[1]]=true;
	        return dfs(maze,visited,start,destination);
	    }
	    
	    public boolean dfs(int[][] maze, boolean[][] visited, int[] pos , int[] dest )
	    {
	        int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
	        for(int[] dir : dirs)
	        {
	            int x=pos[0]+dir[0];
	            int y=pos[1]+dir[1];
	            while(x>=0 && x<maze.length && y>=0 && y<maze[0].length && maze[x][y]==0)
	            {
	                x+=dir[0];
	                y+=dir[1];
	            }
	            x-=dir[0];
	            y-=dir[1];
	            if(dest[0]==x && dest[1]==y) return true; 
	            if(visited[x][y]) continue;
	            visited[x][y]=true;
	            boolean nextRound =dfs(maze,visited,new int[]{x,y},dest);
	            if(nextRound) return true;
	        }
	        return false;
	    }
}