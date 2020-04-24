package com.gurudemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	  public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME, using="name")
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME,using="rad1")
	WebElement rdGender;
	
	@FindBy(how=How.ID,using="dob")
	WebElement txtdob;
	
	@FindBy(how=How.NAME,using="addr")
	WebElement txtaddress;
	
	@FindBy(how=How.NAME,using="city")
	WebElement txtcity;
	
	@FindBy(how=How.NAME,using="state")
	WebElement txtstate;
	
    @FindBy(how=How.NAME,using="pinno")
    WebElement txtpinno;
   
    @FindBy(how=How.NAME,using="telephoneno")
    WebElement txttelephoneno;
   
    @FindBy(how=How.NAME,using="emailid")
    WebElement txtemailid;
   
    @FindBy(how=How.NAME,using="sub")
    WebElement btnsubmit;
   
   
   //Action Methods
   
    public void clickAddNewCustomer()
    {
	  lnkAddNewCustomer.click();  
    }
	
  
    public void custname(String cname)
    {
    	txtCustomerName.sendKeys(cname);
    }
    
    public void custgender(String cgender)
    {
    	rdGender.sendKeys(cgender);
    }
    
    
     public void custdob(String mm,String dd,String yy)
     {
    	 txtdob.sendKeys(mm);
    	 txtdob.sendKeys(dd);
    	 txtdob.sendKeys(yy);
     }
     
     public void custaddres(String caddress)
     {
    	 txtaddress.sendKeys(caddress);
     }
     
     public void custcity(String ccity)
     {
    	 txtcity.sendKeys(ccity);
     }
     
     public void custstate(String cstate)
     {
    	 txtstate.sendKeys(cstate); 
     }
     
     public void custpinno(String cpinno)
     {
    	 txtpinno.sendKeys(String.valueOf(cpinno));
     }
     
     public void custphoneno(String cphoneno)
     {
     txttelephoneno.sendKeys(cphoneno);
     }
     
     public void custemailid(String cemailid) {
     txtemailid.sendKeys(cemailid);
     }
     
     public void custsubmit()
     {
    	 btnsubmit.click();
     }
 }
