package Array;

public class zeroforRowCol {
	public static void main(String args[]) {
		int [][] matrix = {{0,2,1},{6,5,8},{2,4,4}};
		printMatrix(matrix);
		convertZero(matrix);
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
		int zeroRows = matrix.length;
		int zeroCols = matrix[0].length;
		int[][] newZeroMatrix = new int[zeroRows][zeroCols];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j =0;j<matrix[0].length;j++){
				if(matrix[i][j]==0) {
					newZeroMatrix[0][0]=0;
					newZeroMatrix[0][1]=0;
					newZeroMatrix[0][2]=0;
					/*for(int rowZero=0;rowZero<newZeroMatrix.length;rowZero++) {
						for(int colZero=0;colZero<newZeroMatrix[0].length;colZero++) {
							newZeroMatrix[0][0]=0;
							newZeroMatrix[0][1]=0;
							
							newZeroMatrix[0][2]=0;
						}
					}*/
					
				}else {
					newZeroMatrix[i][j]=matrix[i][j];
				}
		
			}
		}
		for(int i=0;i<newZeroMatrix.length;i++) {
			for(int j=0;j<newZeroMatrix[0].length;j++) {
				System.out.print(" "+newZeroMatrix[i][j]);
			}
			System.out.println();
		}
	
	}
}
