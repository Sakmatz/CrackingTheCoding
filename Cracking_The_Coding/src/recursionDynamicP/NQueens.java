package recursionDynamicP;

public class NQueens {
	final int N=8;
	public void printSolution(int board[][]) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<board[i].length;j++) {
				System.out.print(" "+board[i][j]);
			}
			System.out.println();
		}
	}
	public boolean isSafe(int[][] board,int row,int col) {
		int i,j;
		for(i=0;i<col;i++) { // check given for col 0,1,2,3 sedha seedha check
			if(board[row][i]==1) {
           return false;
		}}
		for(i=row,j=col;i>=0 && j>=0;i--,j--) { //i=row to 0 && j=col to 0 upper diagonal
			if(board[i][j]==1) {
				return false;
			}
		}
		for(i=row,j=col;i<N && j>=0;i++,j--) {//i=row to N && j=col to 0 lower diagonal
			if(board[i][j]==1) {
				return false;
			}
		}
			return true;
			
	}
	public boolean NQueenUtil(int[][] board, int col) {
		if(col>=N) 
			return true;
		
		for(int i=0;i<N;i++) {
			if(isSafe(board,i,col)) { 
				board[i][col]=1;
			
			if(NQueenUtil(board,col+1)==true)  
				return true;
			board[i][col]=0;
		}
		}
		return false;
	}
	public boolean solve() {
		int[][] board= {
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0 },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0  },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0  },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0  },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0 },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0  },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0  },
				{ 0, 0 , 0 , 0 , 0 , 0 , 0 , 0  }
		};
		if(NQueenUtil(board,0)==false) {
			System.out.println("No solution");
			return false;
		}
		printSolution(board);
		return true;
	}
public static void main(String args[]) {
	NQueens Nq = new NQueens();
	Nq.solve();
}
}
