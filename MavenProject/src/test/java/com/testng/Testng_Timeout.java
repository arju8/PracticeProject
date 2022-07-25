package com.testng;

import org.testng.annotations.Test;

public class Testng_Timeout {
	@Test(timeOut=1000)
	public void aMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("A method");

	}
	@Test
	public void bMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("B method");
	}
	@Test
	public void cMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("c method");

	}
	@Test()
	public void dMethod() {
		System.out.println("D method");

	}


}
