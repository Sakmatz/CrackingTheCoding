package linkedList;

public class CheckPalindrome {
static Node head;
static class Node{
	String data;
	Node next;
	Node(String c){
		this.data = c;
	}
}
public static void printList() {
	Node temp = head;
	while(temp!=null) {
		System.out.print(" "+temp.data);
		temp = temp.next;
	}
}
public static void cuttingList() {
	Node midNode;
	Node NextmidNode=head;
	Node preNode=null;
	int mid=0;
	Node currNode = head;
	while(currNode!=null) {
		mid = mid+1;
		currNode = currNode.next;
	}
	System.out.println();
	mid = mid/2;
	System.out.println("Mid point is: "+mid);
	int i=1;
	Node temp = head; 
	while(i<mid) {
		temp = temp.next;
		i++;
	}
	System.out.println();
	System.out.println(temp.data);
    midNode = temp;
	Node reverseListHead = midNode.next;
	System.out.println("midnode k next data "+midNode.next.data);
	midNode.next = null;
	Node temp1 = head;
//first se mid tak
	while(temp1!=null) {
		System.out.print(" "+temp1.data);
		temp1 = temp1.next;
	}
	System.out.println();
	CheckPalindrome FirsthalfList = new CheckPalindrome();
	System.out.println(" this list is first half");
	FirsthalfList.printList();
	System.out.println();
	//mid se last tak
	CheckPalindrome halfList = new CheckPalindrome();
	Node temp2=reverseListHead;
	halfList.head = reverseListHead;
	//Node temp2=reverseListHead;
	while(temp2!=null) {
		//System.out.print(" "+temp2.data);
		temp2 = temp2.next;
	}
	System.out.println();
	System.out.println("Second half of the list");
	halfList.printList();
	System.out.println();
	System.out.println("Revsersed list is ");
	
	reverseList(halfList);
	compare(FirsthalfList,halfList);
}
public static void reverseList(CheckPalindrome halfList) {
	Node currNode = halfList.head;
	Node nextNode = halfList.head;
	Node preNode = null;
	while(nextNode!= null) {
		nextNode = nextNode.next;
		currNode.next = preNode;
		preNode = currNode;
		currNode = nextNode;
	}
	halfList.head = preNode;
	halfList.printList();
	
}
public static boolean compare(CheckPalindrome FirsthalfList, CheckPalindrome halfList){
	Node temp1 = FirsthalfList.head;
	Node temp2 = halfList.head;
	
	while(temp1!=null && temp2!=null) {
		if(temp1.data==temp2.data) {
			temp1 = temp1.next;
			temp2= temp2.next;
			
		}else {
			return false;
		}
		
	}
	return false;
}
public static void main(String[] args) {
	CheckPalindrome list = new CheckPalindrome();
	list.head = new Node("A");
	list.head.next = new Node("B");
	list.head.next.next = new Node("C");
	list.head.next.next.next = new Node("C");
	list.head.next.next.next.next = new Node("B");
	list.head.next.next.next.next.next = new Node("A");
	printList();
	cuttingList();
	
}
}
