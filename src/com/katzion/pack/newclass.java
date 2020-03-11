package com.katzion.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
	}
	
	
	
}
