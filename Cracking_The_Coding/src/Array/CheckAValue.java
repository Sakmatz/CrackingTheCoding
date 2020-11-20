package Array;

import java.util.*;

public class CheckAValue {
public static void main(String args[]) {
	int[] array = {2,3,4,5,6,7};
	String[] arrayString = {"sakshi","mathur","graduate"};
	System.out.println("String array is: "+Arrays.toString(arrayString));
	stringcheck(arrayString);
	System.out.println("given array is: "+Arrays.toString(array));
	int value = 5;
	
	System.out.println("Int value is: "+value);
	for(int i=0;i<array.length;i++) {
		if(array[i]==value) {
			System.out.println("Value Found at: "+i);
		}
		
	}
}
public static void stringcheck(String[] arrayString) {
	String value = "sakshi";
	System.out.println("String value is: "+value);
	for(int i = 0;i<arrayString.length;i++) {
		if(value.equalsIgnoreCase(arrayString[i])) {
			System.out.println("Value Found at: "+i);
		}
	}
}
}
