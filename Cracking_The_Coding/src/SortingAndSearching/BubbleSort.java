package SortingAndSearching;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int flag = 0;
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = 1;
				}	
			}
			if(flag==0) {
				break;
			}
			
		}
		return array;
	}
public static void main(String args[]) {
	int[] array = {14,16,5,8,6};
	System.out.println("Before sorting:  "+Arrays.toString(array));
    int[] sortedArray = bSort(array);
    System.out.println("After sorting:  "+Arrays.toString(sortedArray));
}
}
