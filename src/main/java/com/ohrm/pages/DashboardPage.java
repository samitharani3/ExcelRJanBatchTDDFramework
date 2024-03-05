package com.ohrm.pages;

 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ohrm.base.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase{
	public boolean getDashboardLabel() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	}
	public boolean getTimeWorkSection() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	public boolean getMyActionSection() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	
	
	public boolean getdashboardlabel() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		
	}
	public boolean gettimeworksection() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	public boolean getmyactions() {
		return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
		
	}
	public boolean getquicklunch() {
		return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();
		
	}
	public boolean getbuzzlatest() {
		return driver.findElement(By.xpath("//p[text()='Buzz Latest Posts']")).isDisplayed();
		
	}
	public boolean getemployeeleave() {
		return driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).isDisplayed();
		
	}
	public boolean getemployeeDistribution() {
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Sub Unit']")).isDisplayed();
		
	}
	public boolean getemployeeDistributionbylocation() {
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']")).isDisplayed();
		
	}
	
	 
	
	
	
	
	

}