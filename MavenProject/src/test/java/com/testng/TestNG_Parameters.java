package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	@Parameters({"usr"})
	@Test
	public void method1(@Optional("arju")  String username) {
		System.err.println(username);

	}
	@Parameters({"pass"})
	@Test
	public void method2(String password) {
		System.out.println(password);

	}
}
