package linkedList;

public class intNode {
 
	public int data;
	public intNode next;
	intNode head;
	
	intNode(int data,intNode next){
		this.data=data;
		this.next=next;
	}
	public String toString() {
		return data+"";
	}
}
