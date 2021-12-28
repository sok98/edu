package edu;

public class BeanFactory {
	public TV getBean(String name) {
		TV tv = null;
		if(name.equals("samsung")) {
			tv = new SamsungTV();
		} else if(name.equals("LG")) {
			tv =  new LGTV();
		}
		return tv;
	}
}
