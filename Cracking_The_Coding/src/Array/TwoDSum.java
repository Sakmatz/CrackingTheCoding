package Array;

public class TwoDSum {
public static void main(String args[]) {
	int[][] array = {{2,3,4},{5,6,7}};
	printArray(array);
	sumArray(array);
}
public static void printArray(int[][] array) {
	System.out.println("matrix is: ");
	for(int row=0;row<=array.length-1;row++) {
		for(int col = 0;col<array[row].length;col++) {
			System.out.print(" "+array[row][col]);
		}
		System.out.println(" ");
	}
}
public static void sumArray(int[][] array) {
	System.out.println("Sum of the given array is: ");
	int sum=0;
	for(int row=0;row<=array.length-1;row++) {
		for(int col = 0; col<=array[row].length-1;col++) {
			sum = sum + array[row][col];
		}
	}
	System.out.println(sum);
}
}
