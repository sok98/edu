package edu;

public class SamsungTV implements TV {
	public void turnOn() {
		System.out.println("SamsungTV를 켠다");
	}
	public void turnOff() {
		System.out.println("SamsungTV를 끈다");
	}
	public void soundUp() {
		System.out.println("SamsungTV 소리를 높인다");
	}
	public void soundDown() {
		System.out.println("SamsungTV 소리를 낮춘다");
	}
}
