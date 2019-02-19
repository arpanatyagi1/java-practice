package com.javaTraining;

import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String args[])
	{
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Item1");
		linkedlist.add("Item2");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
	
     System.out.println("linked list content:"+linkedlist);
     linkedlist.offer("item100");
     System.out.println("linked list content:"+linkedlist);
     linkedlist.addFirst("first item");
     linkedlist.addLast("last item");
     System.out.println("linked list content after addition"+linkedlist);
     Object firstvar=linkedlist.get(0);
     System.out.println("first element:"+firstvar);
     linkedlist.set(0, "changed first item");
     Object firstvar2=linkedlist.get(0);
     System.out.println("first element after update by set method:"+firstvar2);
     
     //remove first and last element
     linkedlist.removeFirst();
     linkedlist.removeLast();
     System.out.println("linked list after deletion of first and last element:"+linkedlist);
     linkedlist.add(0,"newly added item");
     linkedlist.remove(2);
     System.out.println("final content :"+linkedlist);
     
     
	}
}
