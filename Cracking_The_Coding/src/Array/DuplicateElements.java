package Array;

public class DuplicateElements {
public static void main(String args[]) {
	int[] array = {1,3,2,3,4};
	for(int i = 0;i < array.length; i++) {
		for(int j = i+1; j< array.length;j++) {
		if(array[i]==array[j]) {
			System.out.println("duplicate values");
			System.out.println(array[j]);
		}
	}}
}
}
