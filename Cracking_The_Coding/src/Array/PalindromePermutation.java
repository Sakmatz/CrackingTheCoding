package Array;

import java.util.*;

public class PalindromePermutation {
public static void main(String args[]) {
	String original,reverse="";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number/String");
	original = in.nextLine();
	int length = original.length();
	for(int i=length-1;i>=0;i--) {
		
		reverse = reverse + original.charAt(i);
		
	}
	if(original.equals(reverse)) {
		System.out.println("yes palindrome");
	}
	else {
		System.out.println("this is not palindrome");
	}
}
}
