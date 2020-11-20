package Array;

import java.util.Arrays;

public class ReplaceWithChar {
public static void main(String args[]) {
	String statement = "Mr John Smith";
	String[] statementArray = null;
	//words = blogName.split(" "); 
	statementArray = statement.split("");
	
	System.out.println(Arrays.toString(statementArray));
	String[] newStringStatement = new String [statementArray.length];
	for(int i = 0;i<statementArray.length;i++) {
		if((statementArray[i]).equals(" ")) {
			newStringStatement[i]= "%20";
			
	}else {
		newStringStatement[i]=statementArray[i];
	}
		}
	System.out.println("this new statement string array"+Arrays.toString(newStringStatement));
    
	//we use string buffer to save the elements of the string array
	StringBuffer sb = new StringBuffer();
    for(int i = 0; i<newStringStatement.length;i++) {
    	sb.append(newStringStatement[i]);
    }
    System.out.println(sb);
}
}
