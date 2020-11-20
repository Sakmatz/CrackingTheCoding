package Array;

import java.util.Arrays;

public class ImageRotation90Degree {
public static void main(String args[]) {
	int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
	
	printArray(array);
	rotation(array);
}
public static void printArray(int[][] array) {
	for(int row =0;row<=array.length-1;row++) {
		for(int col=0;col<array[row].length;col++) {
			System.out.print(" "+array[row][col]);
		}
		System.out.println();
	}
}
public static void rotation(int[][] array) {
	System.out.println("Num of rows in rotation matrix: "+ array.length + " and columns: "+array[0].length);

	int totalRowsRotationMatrix = array[0].length;
	int totalColsRotationMatrix = array.length;
	System.out.println("Num of rows in rotation matrix: "+ totalRowsRotationMatrix + " and columns: "+totalColsRotationMatrix);
	int[][] rotatedMatrix = new int[totalRowsRotationMatrix][totalColsRotationMatrix];
	for(int row=0;row<totalRowsRotationMatrix;row++) {
		for(int col=0;col<totalColsRotationMatrix;col++) {
			rotatedMatrix[col][(totalColsRotationMatrix-1)-row] = array[row][col];//column rows ki jagah aaega and new columns me se rows minus honge
		}
	}
	for(int i=0;i<=rotatedMatrix.length-1;i++) {
		for(int j=0;j<rotatedMatrix[0].length;j++) {
			System.out.print(" "+rotatedMatrix[i][j]);
		}
		System.out.println();
	}
	
}
}
