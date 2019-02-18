package com.javaTraining;

public class NissanTruck implements Truck {
	
	public int axles;
	public int weight;
	NissanTruck(int axl,int wei)
	{
	this.axles=axl;
	this.weight=wei;
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
