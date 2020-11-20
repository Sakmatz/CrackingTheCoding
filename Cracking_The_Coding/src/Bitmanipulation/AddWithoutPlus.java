package Bitmanipulation;

public class AddWithoutPlus {
	public static void add(int a,int b) {

		while(b!=0) {
			int carry = a&b;
			a=a^b;
			b=carry<<1;
		}
		System.out.println(a);
	}
public static void main(String args[]) {
	int a = 15;
	int b = 20;
	add(a,b);
}
}
