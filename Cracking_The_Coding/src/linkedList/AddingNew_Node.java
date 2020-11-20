package linkedList;

public class AddingNew_Node {
static Node head=null;
static Node tail=null;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public static void push(int new_data) {
	Node newNode = new Node(new_data);
	if(head==null) {
		head = newNode;
	}
	else {
		tail.next = newNode;
	}
	
	tail = newNode;
	tail.next = head;
}

public static AddingNew_Node print() {
	AddingNew_Node cll = new AddingNew_Node();
	cll.push(10);
	cll.push(20);
	cll.push(30);
	cll.push(40);
	cll.push(50);
	return cll;
}
public static void main(String args[]) {

	print();
	
}
}
