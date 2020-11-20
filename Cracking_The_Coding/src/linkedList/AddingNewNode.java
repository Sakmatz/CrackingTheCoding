package linkedList;

import java.util.Scanner;

public class AddingNewNode {
public static void main(String args[]) {
	stringNode front = null;
	System.out.println(front);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter movie name: ");
	String movie = sc.nextLine();
	front = addNode(front,movie);
	System.out.println(front);
}
public static stringNode addNode(stringNode front,String movie) {
	stringNode temp = new stringNode(movie,null);
	temp.next= front;
	return temp;
}
}
