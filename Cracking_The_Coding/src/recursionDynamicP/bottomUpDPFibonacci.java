package recursionDynamicP;

import java.util.Arrays;

public class bottomUpDPFibonacci {
	public static int[] fibo(int n) {
		int[] array = new int[n+1];
		array[0]=0;
		array[1]=1;
		for(int i =2;i<array.length;i++) {
			array[i]=array[i-1]+array[i-2];
		}
		return array;
	}
public static void main(String args[]) {
	int n = 25;
	int[] array = fibo(n);
	System.out.println(Arrays.toString(array));
	System.out.println(array[n]);
}
}
