package com.ohrm.testcases;

	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import com.ohrm.pages.DashboardPage;
	import com.ohrm.pages.LoginPage;
import com.ohrm.utility.ExcelReaderUtility;

	public class LoginPageTest {
		LoginPage lp;
		DashboardPage dp;
		
		//validate title
		//validate login
		@BeforeMethod
		public void browsersetup() {
			lp=new LoginPage();
			lp.initialization();
		
		}
			
		@Test
		public void validateTitleTest() {
		String ExpTitle="OrangeHRM";
		String actTitle=lp.getTitle();
		Assert.assertEquals(actTitle,ExpTitle);
		
		
		}
		@Test
		public void validateLoginTest() {		

			dp=lp.login();
			Assert.assertTrue(dp.getDashboardLabel());
			 
			
		}
		
		@Test(dataProvider="getLoginData")
		public void validateLoginMultipleData(String username,String password) {		
			dp=lp.login(username,password);
			Assert.assertTrue(dp.getDashboardLabel());
		}
		@DataProvider
		public Object[][] getLoginData() throws IOException {
			String path="./src/test/resources/TestData/TestData.xlsx";
			String sheetName ="sheet1";
			return ExcelReaderUtility.getData(path, sheetName);
			
		}
		//write a TC to validate that
		//when clicked on forgotpassword link
		//Reset Password page is open
		
		
		@AfterMethod
		public void closebrowser() {
			lp.teardown();
			}
		
	}

