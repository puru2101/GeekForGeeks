package com.p1;
interface Hello5{

	default void m2() {
		System.out.println("m2() in A");
		m1();
	}
	default void m3() {
		System.out.println("m3() in A");
		m1();
	}
	private void m1() {
		System.out.println("m1() in A");
	}
}
public class Hi2 implements Hello5 {
	public static void main(String[] args) {
		Hello5 a = new Hi2();
		a.m2();
		a.m3();
	}

}
