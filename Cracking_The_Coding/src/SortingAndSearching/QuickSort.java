package SortingAndSearching;

import java.util.Arrays;

public class QuickSort {
	public void sort(int[] array,int lb, int ub) {
		
		int loc = -1;
		if(lb<ub) {
			//getting the appropriate location for pivot
			loc = partition(array,lb,ub);
			System.out.println(loc);
			sort(array,lb,loc-1);
			sort(array,loc+1,ub);
		}
	}
	public int partition(int[] array, int lb, int ub) {
		int pivot = array[lb];
		int start = lb;
		int end = ub;
		
		/*check from the left side or from start for any bigger element thn pivot,
		if we find any element which is bigger thn pivot we stop */
		while(start<end) {
			
			//if(a[start]<=pivot && start<ub) and iterate till just the end of array.
			//start<=ub not needed since it will again go over if it's correct
			while(array[start]<=pivot  && start<ub) {
				System.out.println("array[start] is:  "+array[start]);
				System.out.println("pivot is:  "+pivot);
				start++;
			}
			while(array[end]>pivot) {
				end--;
			}
			if(start<end) {
				//swap(array[start],array[end]);
				int temp = array[start];
				array[start]=array[end];
				array[end]=temp;
			}
		}
		//swap(array[lb],array[end]);
		int temp = array[lb];
		array[lb]=array[end];
		array[end]=temp;
		return end;
	}
	
public static void main(String args[]) {
	QuickSort qs = new QuickSort();
	int[] array = {7,6,10,5,9,2,1,15,7};
	int lb = 0;
	int ub = 8;
	qs.sort(array,lb,ub);
	System.out.println(Arrays.toString(array));
}
}
