package com.lab.facade.device;

public class Amplifier implements Device{

	 public Tuner tuner;
	 public DvdPlayer dvdplayer;
	
	 
	public  void setStereoSound() {
		// TODO Auto-generated method stub

	}
	

	@Override
	public void on() {
		// TODO Auto-generated method stub
		tuner.on();
		dvdplayer.on();
	
		
	}
	//komentarz

	@Override
	public void off() {
		// TODO Auto-generated method stub
		tuner.off();
		dvdplayer.on();
		
		
	}

}
