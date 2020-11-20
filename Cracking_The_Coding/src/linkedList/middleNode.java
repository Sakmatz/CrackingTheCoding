package linkedList;

public class middleNode {
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
		System.out.print(" "+ temp.data);
		temp = temp.next;
	}
}
public static void deleteMiddle(middleNode list) {
	int mid=0;
    double count=0;
    Node temp = head;
    while(temp!=null) {
    	count=count+1;
    	temp=temp.next;
    }
    System.out.println();
    System.out.println(" "+count);
    mid = (int)Math.round(count/2);
    System.out.println(" "+mid);
    int pos = mid;
    Node temp1 = head;
    int i=1;
    Node NextNode= null;
    while(i<pos-1) {
    	temp1 = temp1.next;
    	i++;
    	}
    NextNode = temp1.next;
    temp1.next = NextNode.next;
    System.gc();
}
public static void main(String[] args) {
	middleNode list = new middleNode();
	list.head = new Node(10);
	list.head.next= new Node(20);
	list.head.next.next = new Node(30);
	list.head.next.next.next = new Node(40);
	list.head.next.next.next.next = new Node(50);
	list.head.next.next.next.next.next = new Node(60);
	list.printList();
	list.deleteMiddle(list);
	list.printList();
}
}
