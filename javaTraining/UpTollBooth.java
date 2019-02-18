package com.javaTraining;

public class UpTollBooth implements TollBooth
{
  static int count=0;
  static double total=0;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	
	public void calculateToll(FordTruck obj1) {
		// TODO Auto-generated method stub
		count++;
		System.out.println("truck no "+count);
		System.out.println("axles="+obj1.axles);
		System.out.println("weight="+obj1.weight);
		int ax=obj1.axles;
		int weight=obj1.weight;
		ax=5*ax;
		weight=((weight/1000)/2)*10;
		double sum=ax+weight;
		System.out.println("sum="+sum);
		total+=sum;
		System.out.println("total="+total);
		
		}

	public void calculateToll(NissanTruck obj2) {
		// TODO Auto-generated method stub
		count++;
		System.out.println("truck no "+count);
		int ax=obj2.axles;
		int weight=obj2.weight;
		ax=5*ax;
		weight=((weight/1000)/2)*10;
		double sum=ax+weight;
		System.out.println("sum="+sum);
		total+=sum;
		System.out.println("total="+total);
		}

	@Override
	public void totalReceipt() {
		// TODO Auto-generated method stub
		
	}



		
	}


