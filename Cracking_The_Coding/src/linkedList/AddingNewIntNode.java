package linkedList;

import java.util.Scanner;

public class AddingNewIntNode {
public static void main(String args[]) {
	intNode front=null;

	System.out.println(front);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to add at the front node: ");
	String number = sc.nextLine();
	front= addTofront(front, number);
	
	System.out.println(front);
	
}
public static intNode addTofront(intNode front, String number) {
	int num = Integer.parseInt(number);//coverting string to int
	intNode temp = new intNode(num,null);
	temp.next=front;
	return temp;
} 
}
