package com.gurudemo.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurudemo.pageObjects.LoginPage;
import com.gurudemo.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass{
	
	
	@Test(dataProvider="Logindata")
	public void loginDDT(String user,String pwd)
	{
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(user);
		Logger.info("user name provided");
		lp.setPassword(pwd);
		Logger.info("pwd  provided");
		lp.clickSubmit();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();  //close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			Logger.warn("Login fail");
		}
		
		else {
			Assert.assertTrue(true);
			Logger.info("Login Pass");
			lp.clickLogout();
			driver.switchTo().alert().accept();  //close the logout alert
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() // user defined method  created to check alert is present or not
	{
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}

	
	@DataProvider(name="Logindata")
	   String [][] getData() throws IOException
	  {
		//String path="F:\\Selenium Practice - SEPTEMBER\\GuruDemo_FrameWork\\src\\test\\java\\com\\gurudemo\\testData\\testdata.xlsx";
		String path=System.getProperty("user.dir")+"/src/test/java/com/gurudemo/testData/LoginData.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]= new String [rowcount][colcount];
		for(int i=1;i<=rowcount;i++) 
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1 0
			}
			
		}
		return logindata;
		
		
	  }
	
	
	
	
}
