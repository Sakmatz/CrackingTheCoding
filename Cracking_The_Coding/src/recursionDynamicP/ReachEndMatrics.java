package recursionDynamicP;


public class ReachEndMatrics {
	public static void numberOfWays(int[][] grid) {
		
		//setting 0th row and column to 1
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid.length;j++) {
				grid[0][j]=1;
				grid[i][0]=1;
			}
		}

		for(int i=1;i<grid.length;i++) {
			for(int j=1;j<grid[i].length;j++){
				grid[i][j]=grid[i-1][j]+grid[i][j-1];
			}
		}
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++){
				System.out.print(" "+grid[i][j]);
			}
			System.out.println();
		}
		
		}
public static void main(String args[]) {
	int m = 4;
	int n =4;
	int[][] grid = new int[m][n];
	numberOfWays(grid);
}
}
