package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseUsingCollectionClass {
public static void main(String args[]) throws java.lang.Exception {
	Integer[] array = {5,2,1};
	//convering the array into string
	System.out.println("array which is now converted into string "+ Arrays.toString(array));
	reverseArray(array);
}
public static void reverseArray(Integer[] array) {
	//converting the array into list bcz we want to use collection class. 
	//this class will revese the arraylist 
	List<Integer> ListArray= Arrays.asList(array);
	Collections.reverse(ListArray);
	System.out.println("reverse array is: ");
	for(Integer val: ListArray) {
		System.out.println(" "+val);
	}
}
}
