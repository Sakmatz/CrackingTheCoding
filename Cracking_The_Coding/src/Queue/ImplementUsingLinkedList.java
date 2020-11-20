package Queue;

public class ImplementUsingLinkedList {
static Node front=null;
static Node rear=null;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public static void enqueue(int data) {	
	Node new_node = new Node(data);
	if(front==null && rear==null) {
		rear=front=new_node;
	}
	else {
		rear.next=new_node;
		rear=new_node;
	}
}
public static void dequeue() {
	if(front==null && rear==null) {
		System.out.println("queue is empty");
	}else {
		front = front.next;
	}
}
public static void display() {
	Node temp= front;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp = temp.next;
	}
}
public static void main(String[] args) {
	ImplementUsingLinkedList list = new ImplementUsingLinkedList();
	enqueue(2);
	enqueue(3);
	enqueue(4);
	display();
	dequeue();
	System.out.println();
	display();
}
}
