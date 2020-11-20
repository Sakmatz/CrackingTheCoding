package Array;

import java.util.Arrays;

public class TwoDArray_Define {
public static void main(String args[]) {
	int[][] array = {{2,3,4},{3,5}};
	for(int i=0;i<=array.length-1;i++) {
		for(int j=0;j<array[i].length;j++) {
			System.out.println(array[i][j]);
		}
	}
	usingarraylist(array);
	usingRowCol(array);
}
public static void usingarraylist(int[][] array) {
	System.out.println("now using arraylist");
	for(int[] innerarray : array ) {
		for(int data: innerarray) {
			System.out.println(data);
		}
	}
}
public static void usingRowCol(int[][] array) {
	 int[][] values = {
	         { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },
	         { 11, 21, 31 }
	      };
	System.out.println("using row col");
	for(int row = 0;row<4;row++){
		for(int col = 0; col<3;col++) {
			System.out.print(" "+values[row][col]);
		}
		System.out.println();
	}
}
}
