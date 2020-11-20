package recursionDynamicP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parens {
	public static void paren(int n,int open,int close,ArrayList<String> str,String s) {
		if(str.size()==n*2) {
			str.add(s);
			return ;
		}
		if(open<n) {
			paren(n,open+1,close,str,s+"(");
		}
		if(close<open) {
			paren(n,open,close+1,str,s+")");
		}
		
	}
public static void main(String args[]) {
	ArrayList<String> str = new ArrayList<>();
	int n=2;
	int open =0;
	int close =0;
	String s="";
	
    paren(n,open,close,str,s);
    System.out.println(Arrays.toString(str.toArray()));
}
}
