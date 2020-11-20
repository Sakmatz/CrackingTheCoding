package linkedList;

public class linkedList1st {
Node head;//linkedlist class me head h jiska type Node h
static class Node{//linked class me Node class hai...jisme int type data h and next jo hoga vo Node class ka hoga
	int data;
	Node next;
	Node(int d){//Node class ka constructor h jisme d data h and next me null h
		data=d;
		next=null;
	}
}
public static linkedList1st insert(linkedList1st list,int data) {
	/*linkedlist ki class me insert method h jisme 
	 * new_node variable me new node ki value hogi and next me hoga null
	 * agar head null hai to new node to head bna do nai to 
	 * last node me list ka head save krdo aur aisa tab tak kro 
	 * jab tak last.next me null nai hojata
	 * last.next me new node daal do*/
	Node new_node = new Node(data); 
	new_node.next= null;
	if(list.head==null) {
		list.head= new_node;
	}else {
		Node last=list.head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new_node;
	}
	return list;
}
public static void printList(linkedList1st list) {
	Node currNode = list.head;
	System.out.println("LinkedList:  ");
	while(currNode!=null) {
		System.out.println(currNode.data+" ");
		currNode=currNode.next;
	}
}
public static void main(String[] args) {
	linkedList1st list = new linkedList1st();
	
	list= insert(list,1);
	list= insert(list,2);
	list= insert(list,3);
	list= insert(list,4);
	list= insert(list,5);
	list= insert(list,6);
	list= insert(list,7);
	list= insert(list,8);
	list= insert(list,9);
	list= insert(list,10);
	printList(list);
}
}
