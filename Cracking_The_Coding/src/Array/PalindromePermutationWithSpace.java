package Array;

import java.util.*;

public class PalindromePermutationWithSpace {
public static void main(String args[]) {
	String str1 = "tact cao";
	String str2 = "atco cta";
	String strWithoutSpcae_1= str1.replace(" ", "");
	String strWithoutSpcae_2= str2.replace(" ", "");
	System.out.println("This is string without space: "+ strWithoutSpcae_1);
	permutations(strWithoutSpcae_1,strWithoutSpcae_2);
	//palindrome();
}
public static void permutations( String strWithoutSpcae_1,String strWithoutSpcae_2) {
	int str1Length = strWithoutSpcae_1.length();
	int str2Length = strWithoutSpcae_2.length();
	if(str1Length!=str2Length) {
		System.out.println("not a permutation of tact cao");
	}
	else {
		char[] char1 = strWithoutSpcae_1.toCharArray();
		char[] char2 = strWithoutSpcae_2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i = 0;i<char1.length-1;i++) {
		if(char1[i]==char2[i]) {
			System.out.println("yes this is the permutation of tact cao");
		}
		else {
			System.out.println("yes this is not the permutation of tact cao");
		}
		}
		palindrome(strWithoutSpcae_2);
	}
}
public static void palindrome(String strWithoutSpcae_2) {
	String reverse = "";
	for(int i=strWithoutSpcae_2.length()-1;i>=0;i--) {
		reverse = reverse + strWithoutSpcae_2.charAt(i);
	}
	System.out.println("This is reverse of the given string"+ reverse);
	if(strWithoutSpcae_2.equalsIgnoreCase(reverse)) {
		System.out.println("Yes this is palindrome");
	}
	else {
		System.out.println("Yes this is not palindrome");
	}
}
}