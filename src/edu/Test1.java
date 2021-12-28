package edu;

public class Test1 {
	
	String name;
	int age;
	
	public static void main(String[] args) {
//		int age = 23;
//		int a = 2147483647;
//		long b = 2147483648L;
//		float c = 3.14F;
//		double d = 3.14;
		
		/*
		 * byte i = 10; byte j = 20; byte k = (byte)(i + j);
		 */
		
		int[] a = {90, 80, 70, 100};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for(int v:a) {
			System.out.println(v);
		}
	}
}
