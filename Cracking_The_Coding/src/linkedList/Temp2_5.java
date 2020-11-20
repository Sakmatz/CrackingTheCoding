package linkedList;

public class Temp2_5 {
static Node head;
static class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public static void printList() {
	Node temp = head;
	while(temp!= null) {
		System.out.print(" "+ temp.data);
		temp = temp.next;
	}
}
public static void sumReverse(Node head1,Node head2,Temp2_5 list1, Temp2_5 list2) {
	int sum;
	int carry=0;
	Temp2_5 newList = new Temp2_5();
	Node temp = newList.head;
	
	while(head1!=null || head2!=null) {
	sum = head1.data+head2.data+ carry;
	carry = sum/10;
	sum = sum%10;
	System.out.println();
	System.out.println("Now sum and carry are: ");
	
	System.out.println(""+sum);
	System.out.println(""+carry);
	temp.data = sum; 
	head1 = head1.next;
	head2 = head2.next;
	temp = temp.next;
	}
	newList.printList();
	reverseList(newList);
}
public static void reverseList(Temp2_5 newList ) {
	Node preNode = null;
	Node currNode = newList.head;
	Node nextNode = newList.head;
	while(nextNode!=null) {
		nextNode = nextNode.next;
		currNode.next = preNode;
		preNode = currNode;
		currNode = nextNode;
	}
	newList.head=preNode;
	System.out.println();
	System.out.println(newList.head.data);
	newList.printList();
}
public static void main(String[] args) {
	Temp2_5 list1 = new Temp2_5();
	list1.head = new Node(7);
	list1.head.next = new Node(1);
	list1.head.next.next = new Node(6);
	list1.printList();
	Node head1 = list1.head;
	
	System.out.println();
	Temp2_5 list2 = new Temp2_5();
	list2.head = new Node(5);
	list2.head.next = new Node(9);
	list2.head.next.next = new Node(2);
	list2.printList();
	Node head2 = list2.head;
	
	sumReverse(head1,head2,list1, list2);
}
}
