package Array;
/*first we are doing for 1 to 10, we will calculate the sum of 1 to 10 and 
 * we will sum the given arrays elements 
and then subtract these two sums and we will get the missing number*/
public class FindMissingNumber1to100 {
public static void main(String args[]) {
	int[] givenArray = {1,2,3,4,5,7}; 
	
	int n = givenArray.length+1;
	int sumOfgivenArray = sumOfgivenArray(givenArray);
	int sumOfNnumbers = sumOfNnumbers(n);
	System.out.println("n is "+ n );
	System.out.println("sum of given array is "+ sumOfgivenArray );
	System.out.println("sum of n number is "+ sumOfNnumbers);
	int missing = sumOfNnumbers-sumOfgivenArray;
	System.out.println("missing number is "+ missing );
}
public static int sumOfgivenArray(int[] givenArray) {
	int sumGA=0;
	for(int i=0;i<givenArray.length;i++) {
		sumGA = sumGA + givenArray[i];
		System.out.println("sumGA "+sumGA);
	}
	return sumGA;
	
}
public static int sumOfNnumbers(int n) {
	int sumN= (n*(n+1))/2;
	return sumN;
}
}
