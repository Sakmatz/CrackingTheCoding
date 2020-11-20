package linkedList;

class removeDupsQ2_1{
	static Node head;
    static class Node {
    	int data;
    	Node next;
    	Node(int d){
    		data = d;
    	}
    }
    void removeDuplicates() {
    	Node ptr1=null;
    	Node ptr2=null;
    	Node dup = null;
    	
    	ptr1=head;
    	/*picking elements one by one*/
    	while(ptr1!=null && ptr1.next!=null) {
    		ptr2=ptr1;
    		/*now we are comparing ptr2 with rest of the elements*/
    		while(ptr2.next!=null) {
    			/*if duplicate thn delete that */
    			if(ptr1.data==ptr2.next.data) {
    				/*sequence of steps is important here*/
    				dup = ptr2.next;
    				ptr2.next = ptr2.next.next;
    				System.gc();
    			}else {
    				ptr2 = ptr2.next;
    			}
  
    		}
    		ptr1 = ptr1.next;
    	}
    }
    void printList(Node node) {
    	while(node!=null) {
    		System.out.print(node.data+" ");
    		node = node.next;
    	}
    }
   public static void main(String[] args) {
	   removeDupsQ2_1 list = new removeDupsQ2_1();
	   list.head= new Node(10);
	   list.head.next = new Node(20);
	   list.head.next.next= new Node(30);
	   list.head.next.next.next= new Node(40);
	   list.head.next.next.next.next= new Node(20);
	   list.head.next.next.next.next.next= new Node(60);
	   list.head.next.next.next.next.next.next= new Node(70);
	   list.head.next.next.next.next.next.next.next= new Node(20);
	   
	   System.out.println("Linked List before removing dups: ");
	   list.printList(head);
	   System.out.println();
	   list.removeDuplicates();
	   System.out.println("Linked List after removing dups: ");
   
	   list.printList(head);
   }
}