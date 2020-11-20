package recursionDynamicP;

public class RobotInAGrid {
	public static void ways(int[][] grid, int obstacle) {
		int[][] grid1 = new int[4][5];
		int n =1;
		int m=0;
		for(int i=0;i<grid1.length;i++) {
			for(int j=0;j<grid1[i].length;j++) {
				
				
					grid1[i][0]=1;
					grid1[0][j] =1;
				
			}
		}
		grid1[n][m]=0;
		print(grid1);
		/*grid1[0][0] =1;
		grid1[1][0] =1;
		grid1[2][0] =1;
		grid1[3][0] =1;
		grid1[0][1] =1;
		grid1[0][2] =1;
		grid1[0][3] =1;
		grid1[0][4] =1; */
		
		for(int i=1;i<grid1.length;i++) {
			for(int j=1;j<grid1[i].length;j++){
				grid1[i][j]=grid1[i][j-1]+grid1[i-1][j];
			}
		}
		System.out.println("number of ways with obstacle: ");
		print(grid1);
	}
	public static void print(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++){
				System.out.print(" "+grid[i][j]);
			}
			System.out.println();
		}
	} 
public static void main(String args[]) {
	int [][] grid = new int [4][5];
	int obstacle = grid[3][2];
	ways(grid, obstacle);
}
}
