package Array;

public class SearchSpecific {
public static void main(String args[]) {
	int[] array = {1,2,3,4};
	int element = 3;
	for(int i= 0; i<array.length;i++) {
		if (array[i]== element) {
			System.out.println("element found at "+ i);
		}
		
	}
}
} 
