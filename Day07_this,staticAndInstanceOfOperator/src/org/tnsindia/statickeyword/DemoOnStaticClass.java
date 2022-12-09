package org.tnsindia.statickeyword;
class C {
	//static variable
	public static String str="TNS India";
	/* A class can be made static only if it is nested class */
	//static class
	static class D {
		//non-static
		/* If this method is non- static then we have to create the object */
		public static void print() {
			System.out.println(str);
		}
	}
}

public class DemoOnStaticClass {

	public static void main(String[] args) {
		//C.D obj=new org.tnsindia.statickeyword.C.D();
		//obj.print();
		C.D.print();		
	}
}