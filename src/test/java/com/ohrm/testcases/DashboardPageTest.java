package com.ohrm.testcases;
 

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class DashboardPageTest {
	DashboardPage dp;
	LoginPage lp;
	
	@BeforeMethod
	public void browsersetup() {
		lp=new LoginPage();
		lp.initialization();
	
	}
	
	@Test
	public void validateTimeWorksectionTest() {
		dp=lp.login();
		Assert.assertTrue(dp.gettimeworksection());
		
	}
	
	@Test
	public void myActionSectionTest() {
		dp=lp.login();
		Assert.assertTrue(dp.getMyActionSection());
	}
	
	
	@Test
	public void validatemyactions() {
		dp=lp.login();
		Assert.assertTrue(dp.getmyactions());
	}
	@Test
	public void validatequicklunch() {
		dp=lp.login();
		Assert.assertTrue(dp.getquicklunch());
	}
	@Test
	public void validatebuzzlatest() {
		dp=lp.login();
		Assert.assertTrue(dp.getbuzzlatest());
	}
	@Test
	public void validateemployeeleave() {
		dp=lp.login();
		Assert.assertTrue(dp.getemployeeleave());
	}
	@Test
	public void validateemployeeDistribution() {
		dp=lp.login();
		Assert.assertTrue(dp.getemployeeDistribution());
	}
	@Test
	public void validateemployeeDistributionbylocation() {
		dp=lp.login();
		Assert.assertTrue(dp.getemployeeDistributionbylocation());
	}
	


	@AfterMethod
	public void closebrowser() {
		dp.teardown();
	}

}