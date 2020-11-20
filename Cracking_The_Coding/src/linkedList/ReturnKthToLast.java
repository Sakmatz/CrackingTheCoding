package linkedList;

public class ReturnKthToLast {
static Node head;
static class Node{
	int data;
	Node next;
Node(int data){
	this.data = data;
}
}
public static void printList() {
    Node temp;
    temp = head;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp = temp.next;
	}
}
public static void returnKth(ReturnKthToLast list) {
	int k = 2;
	int length = 0;
	Node temp = head;
	while(temp!= null) {
		length = length+1;
		System.out.println();
		System.out.print(" "+temp.data+" element No. "+length);
		temp = temp.next;
	}
	System.out.println();
    System.out.println("Length of the linked list is: "+length);
 
    NewHead(length,head, list,k); 
	
	
}
public static void NewHead(int length, Node head, ReturnKthToLast list,int k) {
	Node temp = head;
	// 20 30 40 50 60----30 40 50 60
	System.out.println();
	
}
public static void main(String[] args) {
	ReturnKthToLast list = new ReturnKthToLast();
	list.head = new Node(20);	
	list.head.next = new Node(30);
	list.head.next.next = new Node(40);
	list.head.next.next.next = new Node(50);
	list.head.next.next.next.next = new Node(60);
	
	list.printList();
	returnKth(list);
}
}