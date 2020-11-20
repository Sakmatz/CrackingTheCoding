package linkedList;



public class StackUsingLinkedList {
static Node top=null;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public static void push(int data) {
	Node new_node = new Node(data);
	new_node.next = top;
	top = new_node;
	
}
public static void printList() {
	Node temp = top;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp=temp.next;
	}
}
public static void pop() {
	Node temp = top;
	if(temp==null) {
		System.out.println("underflow condition");
	}else {
		System.out.println("popped data would be: "+temp.data);
		top = top.next;
		System.gc();
	}
	
	
}
public static void peek() {
	System.out.println();
	if(top==null) {
		System.out.println("stack is empty");
	}else {
		System.out.println(top.data);
	}
	
}
public static void main(String[] args) {
	StackUsingLinkedList Slist = new StackUsingLinkedList();
	Slist.peek();
	Slist.push(2);
	Slist.push(3);
	Slist.push(4);
	Slist.printList();
	Slist.peek();
	
	System.out.println("after popping");
    Slist.pop();
    Slist.printList();
}
}
