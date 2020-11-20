package Array;

import java.util.Arrays;

public class CheckPermutations {
public static void main(String args[]) {
	String str1 = "tact cao";
	String str2 = "taco cat";
	checkPermutations(str1, str2);
}
public static void checkPermutations(String str1, String str2) {
	int str1Length = str1.length();
	int str2Length = str2.length();
	if(str1Length!=str2Length) {
		System.out.println("This is not the permutation of tact cao");
	}
	else {
		checkfurther(str1,str2);
	}}
public static void checkfurther(String str1, String str2) {
	int str1Length = str1.length();
	int str2Length = str2.length();
	char[] char1 = str1.toCharArray();
	char[] char2 = str2.toCharArray();
	Arrays.sort(char1);
	System.out.println(char1);
	Arrays.sort(char2);
	System.out.println(char2);
	for(int i=0;i<=str1Length-1;i++) {
	if(char1[i]!=char2[i]) {
		System.out.println("Not the permutation");
	}
	else {
		System.out.println("permutation");
	}}
}
}
