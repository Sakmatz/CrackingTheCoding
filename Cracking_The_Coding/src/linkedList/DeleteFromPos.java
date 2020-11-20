package linkedList;

public class DeleteFromPos {
static Node head;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data= data;
	}
}
public static void printList() {
	Node temp = head;
	while(temp!=null){
		System.out.print(" "+temp.data);
		temp = temp.next;
	} 
}
public static void deleteGivenPos(DeleteFromPos list) {
	int pos=3;
	Node temp=head;
	Node NextNode=null;
	int i=1;
	while(i<pos-1) {
		temp = temp.next;
		i++;
	}
	NextNode = temp.next;
	temp.next = NextNode.next;
	System.out.println();
	System.gc();
}
public static void main(String[] args) {
	DeleteFromPos list = new DeleteFromPos();
	list.head = new Node(10);
	list.head.next = new Node(20);
	list.head.next.next = new Node(30);
	list.head.next.next.next = new Node(40);
	list.head.next.next.next.next = new Node(50);
	list.head.next.next.next.next.next = new Node(60);
	list.head.next.next.next.next.next.next = new Node(70);
	list.printList();
	list.deleteGivenPos(list);
	list.printList();
	}
}
