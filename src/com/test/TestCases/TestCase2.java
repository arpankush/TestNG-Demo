package com.test.TestCases;

import org.testng.annotations.*;

public class TestCase2 {

	@BeforeGroups
	void BeforeGroups() {
		System.out.println("@BeforeGroups TestCase2");
	}

	@BeforeSuite
	void BeforeSuite() {
		System.out.println("@BeforeSuite TestCase2");
	}

	@BeforeClass
	void BeforeClass() {
		System.out.println("@BeforeClass TestCase2");
	}

	@BeforeMethod
	void BeforeMethod1() {
		System.out.println("@BeforeMethod TestCase2");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("@BeforeTest TestCase2");
	}

	@Test(priority = -1)
	void Test1() {
		System.out.println("@Test1 TestCase2");
	}

	@Test(priority = 0, timeOut = 200)
	@Parameters({ "i1", "i2" })
	void Test2(int a, int b) throws InterruptedException {
		System.out.println("@Test2 TestCase2: " + (a + b));
	}

	@Test(priority = 1)
	void Test3() {
		System.out.println("@Test3 TestCase2");
	}

	@AfterTest
	void AfterTest() {
		System.out.println("@AfterTest TestCase2");
	}

	@AfterGroups
	void AfterGroups() {
		System.out.println("@AfterGroups TestCase2");
	}

	@AfterSuite
	void AfterSuite() {
		System.out.println("@AfterSuite TestCase2");
	}

	@AfterClass
	void AfterClass() {
		System.out.println("@AfterClass TestCase2");
	}

	@AfterMethod
	void AfterMethod1() {
		System.out.println("@AfterMethod TestCase2");
	}

}