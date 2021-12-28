package edu;

public abstract class Test2 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1==s2);
		
		String s3 = "java";
		String s4 = "java";
		
		System.out.println(s3==s4);
		
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
