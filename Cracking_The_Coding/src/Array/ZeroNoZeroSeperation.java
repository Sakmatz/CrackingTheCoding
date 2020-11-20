package Array;

import java.util.Arrays;

public class ZeroNoZeroSeperation {
public static void main(String args[]) {
	int[] array = {0,5,4,3,0,4,0};
	seperation(array);
	System.out.println(Arrays.toString(array));
}
public static void seperation(int[] array) {
	int counter = 0;
	for(int i = 0; i<array.length;i++) {
		if(array[i]!=0) {
			array[counter]= array[i];
			counter++;
			//counter ki value me array ki value jaati 
			//jaaegi jab tak non zero aata jaaega
			System.out.println(counter);
			System.out.println("array before settig zeros "+Arrays.toString(array));
		}		
	}
	//counters values will be increased to set zeros at the end
	while(counter<array.length) {
		System.out.println(counter);
		array[counter]=0;
		counter++;
	}
}

}
