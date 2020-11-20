package linkedList;

public class insertingNodes {
public static intNode insertNodes(intNode list,int data) {
	intNode new_node = null;
	new_node.next = null;
	if(list.head==null) {
		list.head = new_node;
	}else {
		intNode last = list.head;
		while(last.next==null) {
			last=last.next;
		}
		last.next=new_node;
	}
	return list;
}
public static void printList(intNode list) {
	intNode currNode = list.head;
	System.out.println("Linked list: ");
	while(currNode!=null) {
		System.out.println(currNode.data+" ");
		currNode=currNode.next;
	}
} 
public static void main(String args[]) {
//	intNode list = new intNode(23,);
}
}
