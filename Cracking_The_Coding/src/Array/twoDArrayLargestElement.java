package Array;

public class twoDArrayLargestElement {
public static void main(String args[]) {
	int[][] array = {{2,3,4},{5,6,7}};
	ptintArray(array);
	findLargest(array);
}
public static void ptintArray(int[][] array) {
	System.out.println("Given matrix is as follows: ");
	for(int row=0;row<=array.length-1;row++) {
		for(int col=0;col<array[row].length;col++) {
			System.out.print(" "+array[row][col]);
		}
		System.out.println("");
		}
}
public static void findLargest(int[][] array){
	int largest;
	for(int row=0;row<array.length-1;row++) {
		 largest =array[row][0];
		for(int col=1;col<array[row].length;col++) {
			if(array[row][col]>largest) {
				largest = array[row][col];
			}
			
		}
		//System.out.println("largest number is: "+largest);
		System.out.println("The largest element of row " + (row + 1)
                + " = " + largest);
	}

}
}
