package Array;

public class Palindrome {
public static void main(String args[]) {
String str = "taco cat";
//char[] char1 = str.toCharArray();
String newstr=str.replace(" ", "");

System.out.println(newstr);
checkPalindrome(newstr);
}
public static void checkPalindrome(String newstr) {
    String reverse = "";
    for(int i = newstr.length()-1;i>=0;i--) {
    	reverse = reverse + newstr.charAt(i);
    }
    System.out.println(reverse);
    if(newstr.contentEquals(reverse)) {
    	System.out.println("palindrome");
    }
    else {
    	System.out.println("not palindrome");
    }
	}

}
