package com.cast.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="SmokeTest")
 public void createOrgTest()
 {
		System.out.println("execute createOrgTest");
 }
	@Test(groups="RegressionTest")
	public void createOrgWithIndustryTest()
	 {
			System.out.println("execute OrgWithIndustryTest");
	 }
	@Test(groups="RegressionTest")
	public void deleteOrgTest()
	 {
			System.out.println("execute deleteOrgTest");
	 }
	
}
