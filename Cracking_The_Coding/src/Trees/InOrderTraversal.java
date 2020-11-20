package Trees;

import java.util.Scanner;

public class InOrderTraversal {
static int Tree[] = new int[14];

static class Node{
	Node left;
	Node right;
	int data;
	Node(int data) {
		this.data=data;
		left = right = null;
	}
}
public static Node create() {
	Node new_node;
	System.out.println(" enter -1 to null value ");
	System.out.println(" enter the value of x: ");
	Scanner sc =new Scanner(System.in);
	int x = sc.nextInt();
	if(x==-1) {
		return null;
	}
		new_node = new Node(x);
		System.out.println("please enter left of: "+x);
		new_node.left=create();
		System.out.println("please enter right of: "+x);
		new_node.right=create();
	treeArray(new_node);
	return new_node;
}
public static void treeArray(Node new_node) {
	System.out.println(" data is: "+new_node.data);
}
public static void main(String args[]) {
	Node root = create();
	
	System.out.println("Tree Array is: ");

}
}
