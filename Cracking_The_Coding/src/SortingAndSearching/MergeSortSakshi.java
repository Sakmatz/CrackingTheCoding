package SortingAndSearching;

import java.util.Arrays;

public class MergeSortSakshi {
	public void sort(int[] array,int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(array,l,m);
			sort(array,m+1,r);
			merge(array,l,m,r);
		}
	}
	public void merge(int[] array, int l,int m,int r) {
		int n1= m-l+1;
		int n2= r-m;
		int[] Left = new int[n1];
		int[] Right = new int[n2];
		for(int i=0;i<n1;i++) {
			Left[i]=array[l+i];
		}
		for(int j=0;j<n2;j++) {
			Right[j]=array[m+1+j];
		}
		int i=0;int j=0;
		int k = l;
		while(i<n1 && j<n2) {
			if(Left[i]<Right[j]) {
				array[k]=Left[i];
				i++;
				k++;
			}
			else {
				array[k]=Right[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			array[k]=Left[i];
			k++;
			i++;
		}
		while(j<n2) {
			array[k]=Right[j];
			j++;
			k++;
		}
	}
public static void main(String args[]) {
	int[] array = {12, 11, 13, 5, 6, 7};
	System.out.println(Arrays.toString(array));
	MergeSortSakshi ob = new MergeSortSakshi();
	ob.sort(array,0,array.length-1);
	System.out.println(Arrays.toString(array));
}
}
