package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayString {
public static void main(String args[]) {
	String[] array= {"sakshi","sameer","piyush","shuchi"};
	System.out.println("given string array is "+ Arrays.toString(array));
	StringReverse(array);
}
public static void StringReverse(String[] array) {
	List<String> listArray = Arrays.asList(array);
	Collections.reverse(listArray);
	
	for(String val: listArray) {
		System.out.print("  "+ (val));
	}
}

}
