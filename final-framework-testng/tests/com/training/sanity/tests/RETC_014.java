package com.training.sanity.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Admindashboard;
import com.training.pom.LoginPOM;

public class RETC_014 extends LoginTests {
	
//	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private LoginTests logintests;
	private Admindashboard admindashboard;
	
		
	@Test(groups = "profileupdatetests")
	public void GenerateNewPassword() throws Exception {
		
	/*	logintests = new LoginTests();
		logintests.setUpBeforeClass();
		logintests.setUp();
		logintests.validLoginTest();*/
		System.out.println("Testing RETC_014 testcase");
		System.out.println("Logged in as phani");
		
			
		Admindashboard admindashboard = new Admindashboard(driver);
		admindashboard.ViewMenuItems();
		System.out.println("Test over");
		
	}
	
	}
