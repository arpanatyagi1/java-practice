package com.javaTraining;

public class FordTruck implements Truck{
	
	public int axles;
	public int weight;
	
	FordTruck(int ax,int w)
	{
	this.axles=ax;
	this.weight=w;
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}


}
