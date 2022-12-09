package org.tnsindia.operator;

public class LogicalOerator {

	public static void main(String[] args) {
		int a=3;
		int b=4;
		boolean res=(a<b && b>2);
		boolean res1=(a<b || b>2);
		boolean res2=!(b>a);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);

	}

}
