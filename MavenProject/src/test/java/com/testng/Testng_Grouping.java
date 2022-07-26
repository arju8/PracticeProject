package com.testng;

import org.testng.annotations.Test;

public class Testng_Grouping {
	@Test(groups="smoketest1")
	public void aMethod() {
		System.out.println("aMethod");
	}
	@Test(groups="smoketest2")
	public void bMethod() {
		System.out.println("bMethod");
	}
	@Test(groups="smoketest2")
	public void cMethod() {
		System.out.println("cMethod");

	}
	@Test(groups="smoketest1")
	public void dMethod() {
		System.out.println("dMethod");

	}
	@Test(groups= {"smoketest1","smoketest2"})
	public void eMethod() {
		System.out.println("eMethod");

	}


}
