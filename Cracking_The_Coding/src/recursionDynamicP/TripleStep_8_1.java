package recursionDynamicP;

import java.util.Arrays;

public class TripleStep_8_1 {
	public static int maxSteps(int n, int[] memo) {
		if(n==0) {
		    memo[0]=1;
			return 1;	
		}
		if(n==1) {
			memo[1]=1;
			return 1;
		}
		if(n==2) {
			memo[2]=2;
		}
		if(memo[n]==0) {
	     memo[n]=maxSteps(n-1,memo)+maxSteps(n-2,memo)+maxSteps(n-3,memo);		
		}
		System.out.println(Arrays.toString(memo));
		return memo[n];
	}
public static void main(String args[]) {
	int n=4;//number of steps
	// number of ways
	int[] memo = new int[n+1];
	int steps= maxSteps(n,memo);
	System.out.println(steps);
}
}
