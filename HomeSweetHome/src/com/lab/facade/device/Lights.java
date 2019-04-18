package com.lab.facade.device;

public class Lights implements Device {

	@Override
	public void on() {
		System.out.println("Lights are on");		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Lights are off");
	}

}
