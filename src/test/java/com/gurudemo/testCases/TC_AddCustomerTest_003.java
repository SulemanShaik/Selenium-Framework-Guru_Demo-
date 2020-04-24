package com.gurudemo.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gurudemo.pageObjects.AddCustomerPage;
import com.gurudemo.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass
{
     @Test   
	public void addNewCustomer() throws InterruptedException, IOException {
    	 
    	 LoginPage lp= new LoginPage(driver);
    	 lp.setUserName(username);
    	 Logger.info("username entered");
    	 lp.setPassword(password);
    	 Logger.info("password entered");
    	 lp.clickSubmit();
    	 Logger.info("click on submit");
    	 Thread.sleep(3000);
    
    	 
    	AddCustomerPage addcust = new AddCustomerPage(driver);
    	
    	addcust.clickAddNewCustomer();
    	
    	Logger.info("provided user details....");
    	addcust.custname("salman");
    	addcust.custgender("male");
    	addcust.custdob("04", "03", "1995");
    	addcust.custaddres("India");
    	addcust.custcity("Hyderabad");
    	addcust.custstate("Telangana");
    	addcust.custpinno("500091");
    	addcust.custphoneno("9848022338");
    	
		String email =randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custsubmit();
		
		Thread.sleep(3000);
		Logger.info("validation started");
		
		boolean res=driver.getPageSource().contains("Customer Register Succesfully!!!");
		
		if(res==true) {
			Logger.info("testcase pass....");
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver,"addNewCustomer");
			Logger.info("testcase fail.....");
			Assert.assertTrue(false);
		}
		
	    }
	
}
