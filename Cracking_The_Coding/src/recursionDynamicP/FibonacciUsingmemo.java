package recursionDynamicP;

import java.util.Arrays;

public class FibonacciUsingmemo {
	public static int count;
	static int n;
	
	public static int fibonacii(int n,int[] memo) {
		
		System.out.println(n);
		if(n==0) {
			memo[0]=0;
			return 0;
		}
		if(n==1) {
			memo[1]=1;
			return 1;
		}
		if(memo[n]==0) {
			memo[n]= fibonacii(n-1,memo)+fibonacii(n-2,memo);
			
		}
		System.out.println(Arrays.toString(memo));
		return memo[n];
	}
public static void main(String args[]) {
	int n=6;
	int[] memo = new int[n+1];
	int sum = fibonacii(n,memo);

	System.out.println("fibonacci is: "+sum);
	
}
}
