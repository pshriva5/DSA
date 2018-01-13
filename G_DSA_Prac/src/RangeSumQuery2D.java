
public class RangeSumQuery2D {

	public static void main(String[] args) {
		int[][] arr = {{3, 0, 1, 4, 2},
				  {5, 6, 3, 2, 1},
				  {1, 2, 0, 1, 5},
				  {4, 1, 0, 1, 7},
				  {1, 0, 3, 0, 5}};
		System.out.println(sumRegion(2, 1, 4, 3, arr));
		update(3, 2, 2, arr);
		System.out.println(sumRegion(2, 1, 4, 3, arr));

}

	private static void update(int i, int j, int k, int[][] arr) {
		arr[i][j]=k;	
	}

	private static int sumRegion(int i, int j, int k, int l, int[][] arr) {
		int sum =0;
	
		for(int x = i; x<=k;x++) {
			for(int y = j;y<=l;y++) {
				sum += arr[x][y];
			}
		}
		return sum;
			
		}
		
	}
