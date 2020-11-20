package Array;
import java.util.Arrays;

public class SumAllValues {
public static void main(String args[]) {
	int[] array = {1,2,3,4,10};
	System.out.println("given array is: "+ Arrays.toString(array));
	sumArray(array);
}
public static void sumArray(int[] array) {
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum = sum+array[i];
	}
	System.out.println("Sum of the given array is: "+sum);
} 
}
