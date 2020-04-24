package com.gurudemo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gurudemo.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
      {
         @Test
	    public void loginTest() {
	    
	    	Logger.info("URL Opened");
	    	
	    	LoginPage lp = new LoginPage(driver);
	    	lp.setUserName(username);
	    	Logger.info("username enter");
	    	lp.setPassword(password);
	    	Logger.info("Password enter");
	    	lp.clickSubmit();
	         Logger.info("clicked on submit button");
	    	
	    	if(driver.getTitle().equals("GTPL Bank Manager HomePage1234")) {
	    		Assert.assertTrue(true);
	    		Logger.info("login test passed");
	    	}
	    	else {
	    		Logger.info("login test fail");
	    		Assert.assertTrue(false);
	    		
	    	}
	    	
	    }
	 
	
	
	
}
