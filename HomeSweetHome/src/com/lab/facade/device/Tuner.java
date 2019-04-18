package com.lab.facade.device;

public class Tuner implements Device{

	
	public void setAm() {
		System.out.println("set AM");
	}
	
	public void setFm() {
		System.out.println("set FM");
		
	}
	
	public void setFrequency() {
		System.out.println("set Frequancy");		
	}
	
	@Override
	public void on() {
		System.out.println("Tuner is on");
	}

	@Override
	public void off() {
		System.out.println("Tuner is off");
		
	}

}
