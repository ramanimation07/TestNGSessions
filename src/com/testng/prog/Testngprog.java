package com.testng.prog;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprog {
	
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Set Property");
	}
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("Launch Browser");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("Login");
	}
	@BeforeMethod
	public void enterurl()
	{
		System.out.println("Enter The URL");
	}
	@Test
	public void googletitletest()
	{
		System.out.println("Google Title Test");
	}
	@Test
	public void validationfields()
	{
		System.out.println("validation fields");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("LOg Out");
	}
	@AfterTest
	public void deleteallcookies()
	{
		System.out.println("Delete all cookies ");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("Close Browser");
	}
	

}
