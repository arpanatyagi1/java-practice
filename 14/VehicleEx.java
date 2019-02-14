abstract class Vehicle
{
	abstract void show();
}
abstract class Car extends Vehicle
{
	String carname;
	Car(String st)
	{
		carname=st;
	}
	void show()
	{
		System.out.println("carname:"+carname);
	}
	abstract void vendorShow();
}
abstract class Vendor extends Car
{
	String vname;
	Vendor(String st,String vn)
	{
		super(st);
		vname=vn;
	}
	void vendorShow()
	{   
	    super.show();
		System.out.println("vendor name="+vname);
	}
	abstract void carTypeShow();
}
 class CarType extends Vendor 
{
	String cartype;
	CarType(String st,String vn,String ct)
	{
		super(st,vn);
		cartype=ct;
	}
	void carTypeShow()
	{
		super.vendorShow();
		System.out.println("your cartype is:"+cartype);
	}
}
class VehicleEx
{
	public static void main(String args[])
	{
	CarType c=new CarType("Audi","RB","fourvehiler");
	c.carTypeShow();
	}
}

	
	