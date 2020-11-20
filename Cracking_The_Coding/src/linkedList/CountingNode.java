package linkedList;

public class CountingNode {
	public static void main(String args[]) {
	
	class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
Node head = new Node(4);
Node nodeB = new Node(2);
Node nodeC = new Node(3);
Node nodeD = new Node(10);
Node nodeE = new Node(2);

head.next = nodeB;
nodeB.next = nodeC;
nodeC.next = nodeD;
nodeD.next = nodeE;

Node temp = head;
int count =0;
while (temp!=null) {
	count++;
	temp = temp.next;
}
/*according to the tutorial video
 * int count =1;
 * while (temp.next!=null) {
	count++;
	temp = temp.next;
}*/
System.out.println("total number of nodes: "+count);
}
	
}