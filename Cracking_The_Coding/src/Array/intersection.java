package Array;

import java.util.HashSet;

public class intersection {
public static void main(String args[]) {
	int[] array1 = {1,2,2,3,4};
	int[] array2 = {2,3,4};
	HashSet<Integer> set = new HashSet<Integer>();
	for(int i=0;i<array1.length;i++){
		for(int j=0;j<array2.length;j++) {
			if(array1[i]==array2[j]) {
				set.add(array2[j]);
			}
		}
	}System.out.println("Set: " + set);
}

}
