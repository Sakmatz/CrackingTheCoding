package Array;

import java.util.*;

public class LargestElement {
public static void main(String args[]) {
	int[] array = {10,43,27,98,75,59,191};
	Arrays.sort(array);
	int largest = 0;
	for(int i = 0; i <array.length;i++) {
		if(array[i]>largest) {
			largest = array[i];
		}
		
	}
	System.out.println(largest);
	System.out.println(array[array.length-2]);
}
}
