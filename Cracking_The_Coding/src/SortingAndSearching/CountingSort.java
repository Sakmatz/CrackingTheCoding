package SortingAndSearching;

import java.util.Arrays;

public class CountingSort {
	public static void sort(int[] array,int k) {
		int n=array.length;
		int[] countArray = new int[k+1];
		Arrays.fill(countArray, 0);
		//array[0]=2,increase countArray[2] by 1
		for(int i=0;i<n;i++) {
			countArray[array[i]]= countArray[array[i]]+1;
		}
		System.out.println("countArray:  "+Arrays.toString(countArray));
		//countArray = [3, 3, 4, 0, 1, 1, 0, 2, 1, 2]
		//update this count to have sorted array index to fill 
		for(int i=1;i<=k;i++) {
			countArray[i]=countArray[i]+countArray[i-1];
		}
		System.out.println("countArray after updating according to the indexes:  "+Arrays.toString(countArray));
		//start filling the values in a new array which will be sorted
		int[] temp = new int[array.length];
		//first decrement and store
		for(int i=temp.length-1;i>=0;i--) {
			   temp[--countArray[array[i]]]=array[i];//value of array[i] is copied in temp me for which we try to check array[i] in count 
			   //and decrement the count value by 1 for index and store in temp[--[countArray[array[i]]]]
		}
		System.out.println("temp array which is sorted: "+Arrays.toString(temp));
		for(int i=0;i<array.length;i++) {
			array[i] = temp[i];
		}
		System.out.println("final array which is sorted: "+Arrays.toString(array));
	}
public static void main(String args[]) {
	int[] array= {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
	int k = 9;
	sort(array,k);
}
}
