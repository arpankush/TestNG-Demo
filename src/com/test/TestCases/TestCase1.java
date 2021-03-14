package com.test.TestCases;

import org.testng.annotations.*;

public class TestCase1 {

	@BeforeGroups
	void BeforeGroups() {
		System.out.println("@BeforeGroups TestCase1");
	}
	
	@BeforeSuite
	void BeforeSuite() {
		System.out.println("@BeforeSuite TestCase1");
	}
	
	@BeforeClass
	void BeforeClass() {
		System.out.println("@BeforeClass TestCase1");
	}
	
	@BeforeMethod
	void BeforeMethod1() {
		System.out.println("@BeforeMethod TestCase1");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("@BeforeTest TestCase1");
	}

	@Test
	void Test1() {
		System.out.println("@Test1 TestCase1");
	}

	@Test
	void Test2() {
		System.out.println("@Test2 TestCase1");
	}

	@AfterTest
	void AfterTest() {
		System.out.println("@AfterTest TestCase1");
	}
	
	@AfterGroups
	void AfterGroups() {
		System.out.println("@AfterGroups TestCase1");
	}
	
	@AfterSuite
	void AfterSuite() {
		System.out.println("@AfterSuite TestCase1");
	}
	
	@AfterClass
	void AfterClass() {
		System.out.println("@AfterClass TestCase1");
	}
	
	@AfterMethod
	void AfterMethod1() {
		System.out.println("@AfterMethod TestCase1");
	}

}