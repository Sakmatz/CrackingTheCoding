package Array;

public class CheckUniqueCharacterInString {
public static void main(String args[]) {
	String testString = "sakshi";
	char[] stringTocharArray = testString.toCharArray();
	for(int i = 0 ; i<stringTocharArray.length;i++) {
		System.out.println(stringTocharArray[i]);
		for(int j=0;j<stringTocharArray.length;j++){
			for(int k= j+1; k<stringTocharArray.length;k++){
			if(stringTocharArray[j]==stringTocharArray[k]) {
				System.out.println("This string has duplicate character and that character is: "+ stringTocharArray[j] );
			}
		}}
	}
}
}
