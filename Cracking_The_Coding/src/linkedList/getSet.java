package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class getSet {
public static void main(String[] args) {
	LinkedList<String> linkedlist = new LinkedList<String>();
	linkedlist.add("Sakshi");
	linkedlist.addFirst("Mathur");
	linkedlist.add("Sameer");
	linkedlist.add("Shuchi");
	linkedlist.add("Rio");
	
    Iterator<String> iterator= linkedlist.iterator();
    while(iterator.hasNext()) {
    	System.out.println(iterator.next());
    }
    //getting and setting values in linkedlist
    Object firstVar = linkedlist.get(0);
    System.out.println("First variable of the linkedlist before updating: "+firstVar);
    linkedlist.set(0, "FirstValriable");
    Object ChangedfirstVar=linkedlist.get(0);
    System.out.println("First variable of the linkedlist after updating: "+ChangedfirstVar);
  //removing existing items
    linkedlist.remove(1);
    System.out.println("Final items in linkedlist: "+linkedlist);
}
}
