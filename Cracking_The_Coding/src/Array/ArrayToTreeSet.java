package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToTreeSet {
public static void main(String args[]) {
	Integer[] array = {1,2,3,4};
	List<Integer> listArray=Arrays.asList(array);
	Set<Integer> set = new TreeSet<Integer>(listArray);
	for(int val:set ) {
		System.out.println("Converted into treeSet "+val);
	}
}
}
