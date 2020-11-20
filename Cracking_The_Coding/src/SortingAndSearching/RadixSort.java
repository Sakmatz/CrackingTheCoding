package SortingAndSearching;

import java.util.Arrays;

public class RadixSort {
	public static void radSort(int[] A,int max) {
		int n= A.length;
		for(int pos = 1; max/pos >0; pos*=10) {
			countSort(A,n,pos);
		}
		System.out.println(Arrays.toString(A));
	}
	public static void countSort(int[] A, int n,int pos) {
		int[] count = new int[10];
		Arrays.fill(count, 0);
		//array me values fill krri hu
		for(int i=0;i<n;i++) {
			++count[(A[i]/pos)%10];	
		}
		//updating count array
		for(int i=1;i<10;i++) {
			count[i]=count[i]+count[i-1];
		}
		int[] temp = new int[A.length];
		for(int i=n-1;i>=0;i--) {
			temp[--count[(A[i]/pos)%10]]  =A[i];
		}
		for(int i=0;i<temp.length;i++) {
			A[i]=temp[i];
		}
	}
public static void main(String args[]) {
	int[] A = {432,8,530,90,88,231,11,45,677,199};
	int max = 677;
	radSort(A,max);
}
}
