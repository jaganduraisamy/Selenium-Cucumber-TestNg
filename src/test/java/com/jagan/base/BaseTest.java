package com.jagan.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

public class BaseTest extends AbstractTestNGCucumberTests {
	
	@BeforeSuite
	public void  beforeSuite(){
		System.out.println("Step :   --------- BeforeSuite.!");
	}
	@BeforeTest
	public void  beforeTest(){
		System.out.println("Step :   --------- BeforeTest.!");
	}
	@BeforeClass
	public void  beforeClass(){
		System.out.println("Step :   --------- BeforeClass.!");
	}
	@BeforeMethod
	public void  beforeMethod(){
		System.out.println("Step :   --------- BeforeMethod.!");
	}
	@AfterSuite
	public void  AfterSuite(){
		System.out.println("Step :   --------- AfterSuite.!");
	}
	@AfterTest
	public void  AfterTest(){
		System.out.println("Step :   --------- AfterTest.!");
	}
	@AfterClass
	public void  AfterClass(){
		System.out.println("Step :   --------- AfterClass.!");
	}
	@AfterMethod
	public void  AfterMethod(){
		System.out.println("Step :   --------- AfterMethod.!");
	}
}
