package com.javaTraining;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
	ArrayList playerArray;
	List subListObj;
	PlayerList()
	{
      playerArray=new ArrayList();
      subListObj=new ArrayList();
    }
	public void add()

{
    for(int c=0;c<5;c++)
    {
    	playerArray.add(new Integer(c));
    }
    playerArray.add("Martina");
    playerArray.add("Serena");
    playerArray.add("Venus");
    playerArray.add("Serena");
    System.out.println();
		
}
	public void search()
	{
		System.out.println();
		System.out.println("******************"+"************");
		System.out.println("search for an object and return"+"the first and last position");
		System.out.println("******************"+"*************");
		System.out.println();
		System.out.println("first occurance of the String"+"\"Serena\" is at position" + playerArray.indexOf("Serena"));
		System.out.println("Last occurance of the String"+"\"Serena\" is at position" + playerArray.lastIndexOf("Serena"));
        System.out.println();     		
	}
	public void display()
	{
	System.out.println("***********"+"*********");
	System.out.println("retrieve objects from the ArrayList");
	System.out.println("*************"+"***********");
	System.out.println();
	for(int c=0;c<playerArray.size();c++)
	{
		System.out.println(" "+playerArray.get(c));
	}
	}
	public void extract()
	{
		System.out.println("********************"+"*************");
		System.out.println("Extract the sublist and"+"then print the new list");
		System.out.println("****************"+"**************");
		System.out.println();
		subListObj=playerArray.subList(5, playerArray.size());
		System.out.println("New Sub-List from index 5 to"+playerArray.size()+"is:"+subListObj);
		System.out.println();
		
		
		}

}
