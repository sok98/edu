package edu;

public class LGTV implements TV {
	public void turnOn() {
		System.out.println("LGTV를 켠다");
	}
	
	public void turnOff() {
		System.out.println("LGTV를 끈다");
	}
	
	public void soundUp() {
		System.out.println("LGTV 소리를 높인다");
	}
	
	public void soundDown() {
		System.out.println("LGTV 소리를 낮춘다");
	}
}
