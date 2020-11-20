package Array;

public class ReverseArray {
public static void main(String args[]) {
	int[] array= {1,2,3,4};
	reverse(array);
}
public static void reverse(int[] array) {
	for(int i = 0;i<array.length;i++) {
		for(int j=array.length-1;j>i;j--) {
		int temp= array[i];
	        array[i]=array[j];
		    array[j]=temp;
		}
		 
	}
	System.out.println("Reverse of the input array");
	for(int i = 0; i<array.length;i++) {
		System.out.println(" "+array[i]);
	}
}
}
