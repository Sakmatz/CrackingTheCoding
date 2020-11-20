package linkedList;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
static Node head;
static class Node{
	int data;
	Node next;
	Node(int data){
	 this.data=data;
	}
}
public static void printList() {
	Node temp = head;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp = temp.next;
	}
}
public static Node intersectNode(Node head1,Node head2) {
	Set<Node> visited = new HashSet<Intersection.Node>();
	while(head1!=null) {
		visited.add(head1);
		head1= head.next;
	}
	
	while(head2!=null) {
		if(visited.contains(head2)) {
			return head2;
		}else 
			head2 = head2.next;
	}
	return null;
}
public static void main(String args[]) {
	Intersection list1 = new Intersection();
	list1.head = new Node(3);
	list1.head.next = new Node(6);
	list1.head.next.next = new Node(9);
	list1.head.next.next.next = new Node(15);
	list1.head.next.next.next.next = new Node(30);
	list1.printList();
	
	System.out.println();
	Intersection list2 = new Intersection();
	list2.head = new Node(10);
	list2.head.next = new Node(15);
	list2.head.next.next = new Node(30);
	list2.printList();
	Node head1= list1.head;
	Node head2= list2.head;
	
	intersectNode(head1, head2);
}
}
