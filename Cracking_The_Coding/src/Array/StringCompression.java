package Array;

public class StringCompression {
public static void main(String args[]) {
	String str = "aabccccc";
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(str.length()-1));
	compression(str);
}
public static void compression(String str) {
	int count =1;
	StringBuilder sb = new StringBuilder();
	for(int i=1;i<str.length()-1;i++){	
	if(str.charAt(i)==str.charAt(i-1)) {
		count++;
		
	}else {
		sb.append(str.charAt(i-1));
		sb.append(count);
		count = 1;
	}
	}
	if(str.length()>1) {
		if(str.charAt(str.length()-2)==str.charAt(str.length()-1)){
		count++;	
		}
		else {
			sb.append(str.charAt(str.length()-2));
			sb.append(count);
			
		}
	}
	str = sb.toString();
	System.out.println(str);
	
}
}
