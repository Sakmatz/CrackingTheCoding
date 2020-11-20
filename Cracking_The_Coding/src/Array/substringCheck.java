package Array;

public class substringCheck {
public static void main(String args[]) {
	String str= "waterbottle";
	checkSub(str);
}
public static void checkSub(String str) {
	String substr="erbottlewat";
	if(str.length()==substr.length()) {
		System.out.println("lengths are same for string and substring");
	}else {
		System.out.println("two different strings");
	}
	checkrotation(str,substr);
	}
public static void checkrotation(String str,String substr) {
	String str3 = str+str;
	System.out.println(str3);
	if(str3.contains(substr)) {
		System.out.println("yes this rotation of str");
	}
}
}

