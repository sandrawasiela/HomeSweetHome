package com.lab.facade.device;

public class Projector implements Device {

	@Override
	public void on() {
		System.out.println("Projector is on");		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Projector is off");
	}

	public void wideScreenMode() {
		System.out.println("Projector working in wide screen mode");
	}
	
	public void tvMode() {
		System.out.println("Projector working in TV mode");
		
	}
	
	
}
