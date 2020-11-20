package Array;

import java.util.HashSet;

public class FirstNonRepeatingNumber {
public static void main(String args[]) {
	int[] array = {1,1,2,3,4,4,5,5}; 
	System.out.println(FindNonRepeating(array,array.length));
}
public static int FindNonRepeating(int[] array, int length) {
	int j;
	for(int i=0;i<length;i++) {
		for(j=0; j<length;j++) {
			if(array[i]==array[j] && i!=j) {
				break;
			}
          }
//agar j length tak chal gaya h to array[i] return krdo kyuki humne last 
//tak check krna h na ki element repeat to nai ho raha
		if(j==length) {
			return array[i];
		}
}
	return -1;
}
}
