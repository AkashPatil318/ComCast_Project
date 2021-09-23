package com.cast.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="SmokeTest")
 public void createContactTest()
 {
		System.out.println("execute createContactTest");
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("url");
		
		System.out.println("Browser======>" +BROWSER);
		System.out.println("URL===>"+ENV);
		
 }
	@Test(groups="RegressionTest")
	public void createContactWithOrgTest()
	 {
			System.out.println("execute createContactWithOrgTest");
	 }
	@Test(groups="RegressionTest")
	public void deleteContactTest()
	 {
			System.out.println("execute deleteContactTest");
	 }
	@Test
	public void UpdateContactTest()
	 {
			System.out.println("execute UpdateContactTest");
	 }
	
}
