package Array;

public class Min_max {
public static void main(String args[]) {
	int[] array = {0,4,7,8,10,12,14};
	int largest = findLarge(array);
	int smallest = findSmall(array);
	System.out.println("Largest number is: "+largest);
	System.out.println("Smallest number is: "+smallest);
}
public static int findLarge(int[] array) {
	int large = array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]>large) {
			large = array[i];
		}
		}
	return large;
	}
	

public static int findSmall(int[] array) {
	int small=array[0];
	for(int i=0;i<array.length;i++) {
	if(array[i]<small) {
		small = array[i];
	}
}
	return small;
}}
