package SortingAndSearching;

import java.util.Arrays;

public class SelectionSort {
	public static int[] sSort(int[] array) {
		int n = array.length;
		
		for(int i=0;i<n-1;i++) {
			int min =i;//need to initialize after pass loop
			for(int j=i+1;j<n;j++) {
				
				if(array[min]>array[j]) {
					min = j;
				}
			}
			if(min!=i) {
				//swap(array[min],array[i]);
				int temp = array[min];
				array[min]=array[i];
				array[i]=temp;
			}
		}
		return array;
	}
public static void main(String args[]) {
	int[] array = {7,4,8,3,1};
   int[] sortedArray=sSort(array);
   System.out.println(Arrays.toString(sortedArray));
}
}
