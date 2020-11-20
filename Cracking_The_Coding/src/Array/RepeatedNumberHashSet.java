package Array;

import java.util.*;

public class RepeatedNumberHashSet {
public static void main(String args[]) {
	int[] array = new int[] {1,2,3,4,5,4};
	findRepeatedValue(array);
	
}
public static void findRepeatedValue(int[] array) {
	int min = -1;
	HashSet set = new HashSet();
	for(int i= array.length-1;i>=0;i--) {
		if(set.contains(array[i])) {
			min = i;
		}
		else {
			set.add(array[i]);
		}
	}
	if(min!=-1) {
	System.out.println(array[min]);
	}
}
}
