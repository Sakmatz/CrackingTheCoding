package linkedList;

public class RemoveDupsSortedList {
public static void main(String args[]) {
	class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
Node head = new Node(2);
Node NodeB = new Node(3);
Node NodeC= new Node(4);
Node NodeD = new Node(5);
Node NodeE = new Node(6);
Node NodeF = new Node(7);
Node LastNode = new Node(8);

head.next = NodeB;
NodeB.next = NodeC;
NodeC.next = NodeD;
NodeD.next = NodeE;
NodeE.next = NodeF;
NodeF.next = LastNode;


Node temp = head;

while(temp!=null) {
	System.out.print(" "+temp.data);
	temp = temp.next;
}
System.out.println();
System.out.println("Removing Duplicates: ");

System.out.println(head.data);
System.out.println(head.next.data);

//yaha pe while loop lagana hoga travese krne k liye
Node CurrNode = head;
while(CurrNode!=null) {
if(CurrNode.data==CurrNode.next.data) {	
System.out.println("Head data and head next data is same: "+head.data);
CurrNode.next = CurrNode.next.next;
System.gc();
Node temp1 = head;
while(temp1!=null) {
	System.out.print(" "+temp1.data);
	temp1=temp1.next;
}
}
}

}

}