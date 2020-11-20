package linkedList;

public class linkedListForDeletion {
Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
 void deleteNode(int key) {
	Node temp= head;
	Node prev=null;
	if(head!=null && temp.data==key) {
		head = temp.next;
		return;
	}
	 // Search for the key to be deleted, keep track of the 
    // previous node as we need to change temp.next
	while(temp!=null && temp.data!=key) {
		prev = temp;
		temp = temp.next;	
	}
	   // If key was not present in linked list
	if(temp==null) {
		return;
	}
	// Unlink the node from linked list 
	prev.next = temp.next;
	
	
}
 public void push(int new_data) {
	 Node new_node = new Node(new_data);
	 new_node.next = head;
	 head = new_node;
 }
 public void printList() {
	 Node tnode = head;
	 while(tnode!=null) {
		 System.out.print(tnode.data+" ");
		 tnode = tnode.next;
	 }
 }
 public static void main(String args[]) {
	 linkedListForDeletion list = new linkedListForDeletion();
	 list.push(0);
	 list.push(1);
	 list.push(2);
	 list.push(3);
	 list.push(4);
	 list.push(5);
	 list.push(6);
	 list.push(7);
	 list.push(8);
	 System.out.println("Before deleting head:  ");
	 list.printList();
	 list.deleteNode(7);
	 System.out.println();
	 System.out.println("After deleting head:   ");
	 list.printList();
 }
}
