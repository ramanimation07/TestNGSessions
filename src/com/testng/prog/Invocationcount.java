package com.testng.prog;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(invocationCount = 10)

	public void sum() {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

	@Test(invocationCount = 10)

	public void sub() {
		int a = 50;
		int b = 10;
		int c = a - b;
		System.out.println(c);
	}

}
