package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng_Features_1 {

	@Ignore
	@Test(priority = -1, invocationCount = 3)
	public void monday() {

		System.out.println("monday");
	}

	@Test(priority = -2, invocationCount = 2,enabled =false)
	public void tuesday() {

		System.out.println("tuesday");
	}

	@Test
	public void wednesday() {

		System.out.println("wednesday");
	}

	@Test(priority = -4,enabled = false)
	public void thrusday() {

		System.out.println("thrusday");
	}

	@Test
	public void jan() {

		System.out.println("jan");
	}

	@Test
	public void feb() {

		System.out.println("feb");

	}
}
