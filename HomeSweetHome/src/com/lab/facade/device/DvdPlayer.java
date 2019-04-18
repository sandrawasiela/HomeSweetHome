package com.lab.facade.device;

public class DvdPlayer implements Device{

	@Override
	public void on() {
		System.out.println("DVD player is on");	
	}

	@Override
	public void off() {
		System.out.println("DVD player is off");
	}
	
	public void eject() {
		System.out.println("Disk ejected");				
	}
	
	public void play(String dvd) {
		System.out.println("DVD playing");
	}	
	
	public void stop() {
		System.out.println("Video stopped");
	}
	
	public void pause() {
		System.out.println("Video paused");
	}
}
