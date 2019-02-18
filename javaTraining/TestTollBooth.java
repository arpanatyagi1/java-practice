package com.javaTraining;

public class TestTollBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpTollBooth obj=new UpTollBooth();
      FordTruck obj1=new FordTruck(5,12000);
      //obj.calculateToll(obj1);
      obj.calculateToll(obj1);
     NissanTruck obj2=new NissanTruck(2,5000);
     obj.calculateToll(obj2);
      
      
      
	}

}
