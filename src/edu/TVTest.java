package edu;

public class TVTest {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumUp();
//		tv.volumDown();
//		tv.powerOff();
		
//		LGTV tv = new LGTV();
		BeanFactory factory = new BeanFactory();
		TV tv = factory.getBean(args[0]);
		tv.turnOn();
		tv.soundDown();
		tv.soundDown();
		tv.turnOff();
		
		
	}
}
