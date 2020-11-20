package Array;
/*HashSet does not allow duplicate elements. 
 * You can traverse the array and insert each element into the HashSet. 
 * Add elements using add() method. 
 * If it returns true then continue to traverse the array. 
 * Otherwise if false then print out the duplicate value.*/
import java.util.HashSet;

public class DuplicateUsingHashSet {
public static void main(String args[]) {
  String[] array = {"sakshi","sakshi","sameer"};
  HashSet<String> set = new HashSet<String>();
  for(String val: array) {
	  if(set.add(val)==false) {
		  System.out.println(val); 
	  }
  }
  
}
}
