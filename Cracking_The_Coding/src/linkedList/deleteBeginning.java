package linkedList;

public class deleteBeginning {
Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next = null;		
	}
}
public void createlist( int new_data){
	Node new_node = new Node(new_data);
	System.out.println(new_node.next); 
	new_node.next = head;
	System.out.println(head);
	head = new_node;	
}
public void displayList() {
	Node tnode = head;
	while(tnode!=null) {
		System.out.print(" "+tnode.data);
		tnode=tnode.next;
	}
}
public void deleteBeginning() {
	
}
public static void main(String args[]) {
	System.out.println("List is as follows: ");
	deleteBeginning list = new deleteBeginning();
	list.displayList();
	list.createlist(2);
	list.createlist(3);
	list.displayList();
}
}
