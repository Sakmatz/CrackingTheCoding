package Array;

public class OneAway {
public static void main(String args[]) {
	String str1 = "pale";
	String str2 = "pales";
	checkEditorNoedit(str1,str2);
}
public static void checkEditorNoedit(String str1, String str2) {
	int samecount = 0;
	for(int i=0;i<=str1.length()-1;i++)
	for(int j=0;j<=str2.length()-1;j++){{
		if(str1.charAt(i)==str2.charAt(j)) {
		samecount=samecount+1;	
		}
	}}
	System.out.println("The count is "+samecount);
	if(samecount<str1.length()-1) {
		System.out.println("More than 1 edits ");
	}
}
}
