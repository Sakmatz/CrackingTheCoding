package linkedList;

public class SortingLinkedList {
static Node head;
static class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
void printList(Node node) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head = head.next;
	}
}
void sorting(SortingLinkedList list) {
	//we need to sort here
}
public static void main(String[] args) {
	SortingLinkedList list = new SortingLinkedList();
	list.head = new Node(10);
	list.head.next = new Node(5);
	list.head.next.next = new Node(20);
	list.head.next.next.next = new Node(30);
	list.head.next.next.next.next = new Node(25);
	list.head.next.next.next.next.next = new Node(60);
	list.head.next.next.next.next.next.next = new Node(1);
	
	System.out.println("list is: ");
	list.printList(head);
}
}
