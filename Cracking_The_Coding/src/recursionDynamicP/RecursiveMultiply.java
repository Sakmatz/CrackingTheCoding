package recursionDynamicP;

public class RecursiveMultiply {
	public static int multiply(int a, int b) {
		if(a==1) {
			return b;
		}
		if(b==1){
			return a;
		}
		if(a==0 || b==0) {
			return 0;
		}
		return multiply(a-1,b)+b;
	}
public static void main(String args[]) {
	int a = 8;
	int b = 9;
	int product = multiply(a,b);
	System.out.println(product);
}
}
