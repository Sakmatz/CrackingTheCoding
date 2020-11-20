package Array;

public class RepeatingNumber {
public static void main(String args[]) {
	int min = 0;
	int[] array = {1,2,3,4,5,4};
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
				System.out.println("repeated value is: "+ array[i]);
			}
		}
		
	}
}
}
