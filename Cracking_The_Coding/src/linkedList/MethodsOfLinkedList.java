package linkedList;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;

public class MethodsOfLinkedList {
public static void main(String[] args) {
	//adding all the items of arraylist in linkedlist
	LinkedList<String> llist=new LinkedList<String>();
	ArrayList<String> Alist=new ArrayList<String>();
	Alist.add("Sakshi");
	Alist.add("Mathur");
	Alist.add("Sameer");
	Alist.add("Piyush");
	Alist.add("Shuchi");
	Alist.add("Rio");


	
	llist.addAll(Alist);
	//llist.addAll(2, Alist);
	//llist.clear();
	System.out.println(llist);
	System.out.println();
	Iterator<String> iterator=llist.iterator();
    while(iterator.hasNext()) {
    	System.out.print(" "+iterator.next());
    }
    //cloning of linked list and saving that clone in cln variable which is of object type
    Object cln = llist.clone();
    System.out.println();
    System.out.println(cln);
    //checking an item in the linkedlist are return true if that item exists
    boolean var = llist.contains("Sakshi");
    if(var) {
    	System.out.println("yes it is available");
    }else {
    	System.out.println("Not present in the linkedlist");
    }
    //it returns the index of the specified string or element
    System.out.println("Removing and returing the index of Sakshi using IndexOf: "+llist.indexOf(("Sakshi")));
    //it returns the last index of the element
    System.out.println("Removing and returing the last index of Mathur using lastIndexOf: "+llist.lastIndexOf("Mathur"));
    //It returns and remove the first item of the list
    System.out.println("Removing the First item using poll: "+llist.poll());
    //pollFirst can also be used to remove and return the first item 
    System.out.println("Removing the First item using pollFirst: "+llist.pollFirst());
    //pollLast is used to remove the last item 
    System.out.println("Removing the last item: "+llist.pollLast());
  //remove is used to remove the item 
    System.out.println("removing Piyush? "+llist.remove("Piyush"));
    
    
    
    llist.add("Kuldip");
	llist.add("Deepti");
	llist.add("Sunil");
	llist.add("Sunil");
	llist.add("poem");
	llist.add("Nandini");
    Iterator<String> iterator1=llist.iterator();
    while(iterator1.hasNext()) {
    	System.out.print(" "+iterator1.next());
    }
    //removing occurrence of an element
    System.out.println();
    llist.removeFirstOccurrence("Sunil");
    System.out.println("After remnoving the first occurence of Sunil"+llist);
    llist.removeFirstOccurrence("Nandini");
    System.out.println("After removing nandini"+llist);
    System.out.println("Size of linkedlist"+llist.size());
}
}
