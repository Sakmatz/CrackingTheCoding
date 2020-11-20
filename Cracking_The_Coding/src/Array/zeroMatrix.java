package Array;

import java.util.Arrays;

public class zeroMatrix {
public static void main(String args[]) {
	int [][] matrix = {{2,0,1},{6,5,8},{2,0,0}};
	printMatrix(matrix);
	convertZero(matrix);
	for (var r: matrix) {
		System.out.println(Arrays.toString(r));
	}
}
public static void printMatrix(int[][] matrix) {
	
	for(int row=0;row<matrix.length;row++) {
		for(int col=0;col<matrix[row].length;col++) {
			System.out.print(" "+matrix[row][col]);
		}
		System.out.println();
	}
}
public static void convertZero(int[][] matrix) {
	System.out.println();
	System.out.println();
	
	//System.out.println("for loop ke upar matrix[2][2]"+matrix[2][2]);
	
	int totalRows = matrix.length;
	int totalCols = matrix[0].length;
	for(int row=0;row<matrix.length;row++) {
		for(int col=0;col<matrix[row].length;col++) {
					
			if(matrix[row][col]==0) {
				
				System.out.println("matrix["+row+"]" +"["+ col+"]");
				System.out.println();
			/*for(int i=0;i<totalRows;i++) {
				for(int j=0;j<totalCols;j++) {
				matrix[row][i]=0;
				matrix[j][col]=0;
				
			}}*/
			changeRowCol(totalRows,totalCols,row,col,matrix);
			}
		}
	}
	for (int i = 0; i < totalRows; i++) {
		for (int j = 0; j < totalCols; j++) {
			if (matrix[i][j] == -1) {
				matrix[i][j] = 0;
			}
		}
	}
}
public static void changeRowCol(int totalRows, int totalCols, int row, int col,int[][] matrix) {
	for(int j=0;j<totalCols;j++) {
		if (matrix[row][j] != 0) {
			matrix[row][j] = -1;
		}
	}
	for(int i=0;i<totalRows;i++) {
		if (matrix[i][col] != 0) {
			matrix[i][col] = -1;
		}
	}
}
}
