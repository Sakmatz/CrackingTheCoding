package linkedList;

public class Palindrome {
static Node head;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public static Palindrome printList(Palindrome list) {
	Node temp = list.head;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp = temp.next;
	}
	return list;
}
public static Palindrome reverseList(Palindrome list) {
	Node preNode = null;
	Node nextNode = head;
	Node currNode = head;
	while(nextNode!=null) {
		nextNode = nextNode.next;
		currNode.next = preNode;
		preNode = currNode;
		currNode = nextNode;
	}
	head = preNode;
	System.out.println();
	System.out.println("this is the reversed list");
	return list;
}
public static void compareData(Node head1,Node head2) {
	Node temp1 = head1;
	Node temp2 = head2;
	while(temp1!=null && temp2!=null) {
		if(temp1.data == temp2.data) {
			temp1 = temp1.next;
			temp2 = temp2.next;
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
			break;
		}
	}

}
public static void main(String args[]) {
	Palindrome list = new Palindrome();
	list.head = new Node(1);
	list.head.next = new Node(1);
	list.head.next.next = new Node(3);
	list.head.next.next.next = new Node(5);
	list.head.next.next.next.next = new Node(1);
	System.out.println("this is the original list");
	Palindrome list1 = new Palindrome();   
	list1 = list.printList(list);
	Node head1 = list.head;
	System.out.println(head1.data);
	list.reverseList(list);
	System.out.println();
	Palindrome list2 = new Palindrome(); 
	list2 = list.printList(list);
	Node head2 = list2.head;
	System.out.println(head2.data);
	compareData(head1,head2);
}
}

