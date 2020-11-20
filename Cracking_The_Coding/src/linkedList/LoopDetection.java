package linkedList;

public class LoopDetection {
static Node head;
//static Node tail;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data; 
	}
}
public static void printList() {
	Node start = head;
	while(head.next!=null) {
		head = head.next;
		head.next = start;
	}
	System.out.println(head.next.data);
}
public static void main(String args[]) {
	LoopDetection list = new LoopDetection();
	list.head = new Node(2);
	list.head.next = new Node(3);
	list.head.next.next = new Node(4);
	list.head.next.next.next = new Node(5);
	list.head.next.next.next.next= new Node(6);
	list.printList();
}
}
