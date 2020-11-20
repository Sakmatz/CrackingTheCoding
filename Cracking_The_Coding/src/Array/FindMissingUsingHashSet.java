package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindMissingUsingHashSet {
public static void main(String args[]) {
	Integer[] givenArray = {1,1,2,3,4,5}; 
	List arrList = Arrays.asList(givenArray);
	
	HashSet<Integer> givenSet = new HashSet<Integer>(arrList);
	int n = givenSet.size() + 1;
	int sum = sumOfall(n);
	int givensum = sumOfgivenHash(givenSet);
	int missing = sum - givensum ; 
	System.out.println("missing number is "+ missing);
}
public static int sumOfall(int n) {
	int sumOfAll = (n*(n+1))/2;
	return sumOfAll;
}
public static int sumOfgivenHash(HashSet<Integer>givenSet) {
	int sumgiven = 0;
	for(Integer obj: givenSet) {
		sumgiven = sumgiven +obj;
	}
	return sumgiven;
}
}
