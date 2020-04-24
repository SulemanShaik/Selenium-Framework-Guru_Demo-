package com.gurudemo.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	Properties prop;
	//Constructor
	public ReadConfig()  {
		try {
	File src = new File("./Configuration/config.properties");
	FileInputStream fis= new FileInputStream(src);
	prop= new Properties();
	prop.load(fis);
	}catch(Exception e) {
		System.out.println("Exception is" + e.getMessage());
	}
	}


	  
	   public String getApplicationUrl() {
		   
		   String url=prop.getProperty("baseURL");
		   return url;
		   
	   }
	
	public String getUsername() {
		 String username=prop.getProperty("username");
		   return username;
		
	}
	
	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}
	
	
	public String getChromepath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxpath() {
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getIepath() {
		String iepath=prop.getProperty("iepath");
		return iepath;
}
}

   
