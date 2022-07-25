package com.testng;

import org.testng.annotations.Test;

public class Testng_DependsOn {
	@Test()
	public void aMethod() {
         int a=20/0;
		System.out.println("A method");

	}
	@Test(dependsOnMethods = "cMethod")
	public void bMethod()  {
		System.out.println("B method");
	}
	@Test(dependsOnMethods = "dMethod")
	public void cMethod() {
		System.out.println("c method");

	}
	@Test(dependsOnMethods = "aMethod")
	public void dMethod() {
		System.out.println("D method");

	}
}
