package Trees;

import java.util.Scanner;

public class implementUsingRecursion {
static class Node{
	int data;
	Node right;
	Node left;
	Node( int data){
		this.data=data;
	}
}
public static Node create() {
	Node new_node;
    System.out.println("enter the value of x: ");
    System.out.println("enter x=-1 to terminate: ");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if(x==-1) {
		return null;
	}
	new_node = new Node(x);
	System.out.println("please enter left child of: "+x);
	new_node.left = create();
	System.out.println("please neter right child of: "+x);
	new_node.right = create();
	return new_node;
	}
public static void main(String args[]) {
	Node root;
	root= null;
	root = create();
}
}
