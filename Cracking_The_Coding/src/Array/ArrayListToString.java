package Array;

import java.util.*;

public class ArrayListToString {
public static void main(String args[]) {
	ArrayList<String> arrList = new ArrayList<String>();
	arrList.add("sakshi");
	arrList.add("sameer");
	arrList.add("piyush");
	String[] Stringarr = new String[arrList.size()];
	for(int i =0;i<arrList.size();i++) {
		Stringarr[i]= arrList.get(i);
	}
	for(int i=0;i<Stringarr.length;i++) {
		System.out.println(Stringarr[i]);
		}
	
}
}
