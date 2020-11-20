package recursionDynamicP;

public class FibonacciNumber {
	public static int count;
	public static int fibonacii(int n) {
		
		if(n==0) {
			count = count+1;
			return 0;
			
		}
		else if(n==1) {
			
			return 1;
		}
		else {
			int sum = 0;
			sum = fibonacii(n-1)+fibonacii(n-2);
			
			return sum;
		}
	}
public static void main(String args[]) {
	int n=6;
	int sum = fibonacii(n);
	System.out.println("count is:" +count);
	System.out.println("fibonacci is: "+sum);
	
}
}
