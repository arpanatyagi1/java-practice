package com.day13;

public class User implements Comparable<User>{
	String firstname;
	String lastname;
	int id;
	
	public User(String ft,String lt,int id1)
	{
    firstname=ft;
    lastname=lt;
    id=id1;
	}

	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return (this.firstname).compareTo(o.firstname);
	}
	
	public String toString()
	{
		return firstname+" "+lastname+" "+id;
	}


	}
	


