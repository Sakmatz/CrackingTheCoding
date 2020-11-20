package linkedList;

public class DeleteLastNode {
static Node head ;
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
public static void deleteLast(DeleteLastNode list) {
	Node prev=null;
	Node temp;
	temp = head;
	while(temp.next!=null) {
		prev = temp;
		temp = temp.next;
	}
	System.out.println();
	System.out.println("Previous node is: "+prev.data);
	prev.next = null;
	System.gc();
}
public static void main(String[] args) {
	DeleteLastNode list = new DeleteLastNode();
	list.head = new Node(10);
	list.head.next = new Node(20);
	list.head.next.next=new Node(30);
	list.printList();
	list.deleteLast(list);
	list.printList();
}
}
