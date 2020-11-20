package linkedList;

import java.util.*;

public class creatingLinkedlist {
public static void main(String args[]) {
	LinkedList<String> list = new LinkedList<String>(); //linkedlist create krne k liye
	list.add("sakshi");
	list.addFirst("mathur");
	list.addLast("sameer");
	
	Iterator<String> iterator=list.iterator();//show krne k liye
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println();
	list.removeFirst();//removing first element Same as list.remove(0);
	list.remove(1);//removing 2nd element
	Iterator<String> iterator2=list.iterator();
	while(iterator2.hasNext()) {
		System.out.println(iterator2.next());
	}
}
}
