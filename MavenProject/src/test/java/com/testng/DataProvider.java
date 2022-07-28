package com.testng;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider = "data")
	public void datas(String username, String password) {
		System.out.println("usernames:"+" "+username+" "+"passwords:"+" "+password);

	}


	@org.testng.annotations.DataProvider(name="data")
	public Object[][] testData() {

		{
			return new Object[][] {

				{"arjunan","1234"},{"arjuna","123456"},{"arjun","1234"}

			};
		}
	}

}


