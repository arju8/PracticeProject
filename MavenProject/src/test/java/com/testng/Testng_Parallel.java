package com.testng;

import org.testng.annotations.Test;

public class Testng_Parallel {
	@Test()
	public void aMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("aMethod");
	}
	@Test()
	public void bMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("bMethod");

	}
	@Test()
	public void cMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("cMethod");
	}
	@Test()
	public void dMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("dMethod");
	}
	
	

}



