package Trees;

public class implementation {

static class Node{
	int data;
	static Node left;
	static Node right;
	Node(int data){
		this.data=data;
		left=right=null;
		}
}
static class BinaryTree{
	Node root;
	BinaryTree(int data){
		root = new Node(data);
	}
	BinaryTree(){
		root=null;
	}
}
public static void main(String args[]) {
	BinaryTree bTree = new BinaryTree();
	bTree.root = new Node(1);
	bTree.root.left = new Node(2); 
	bTree.root.right = new Node(3);
}
public static void display(Node new_node) {
	
}
}
