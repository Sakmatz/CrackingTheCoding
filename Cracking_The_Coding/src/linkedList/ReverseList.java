package linkedList;

public class ReverseList {
static Node head;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public static void printList() {
	Node temp = head;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp = temp.next;
	}
}
public static void revese(ReverseList list) {
	Node prevNode = null;
	Node currNode = head;
	Node nextNode = head;
	while(nextNode!=null) {
		nextNode = nextNode.next;
		currNode.next = prevNode;
		prevNode = currNode;
		currNode = nextNode;
	}
	head = prevNode;
}
public static void main(String[] args) {
	ReverseList list = new ReverseList();
	list.head = new Node(10);
	list.head.next = new Node(20);
	list.head.next.next = new Node(30);
	list.head.next.next.next = new Node(40);
	list.head.next.next.next.next = new Node(50);
	list.head.next.next.next.next.next = new Node(60);
	list.head.next.next.next.next.next.next = new Node(70);
	list.printList();
	list.revese(list);
	System.out.println();
	list.printList();
}
}
