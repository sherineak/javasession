package com.katzion.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FirstClass {
	WebDriver driver;
	
	
	
  @Test
  public void f() throws InterruptedException { 
	 driver.findElement(By.id("identifierId")).sendKeys("sherine.antony@katzion.com");
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
      Thread.sleep(5000);
      
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome123");
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	  Thread.sleep(5000);
	 
	  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	  Thread.sleep(5000);
    
//System.out.println("pass");
	  By to = By.xpath("//textarea[@id=':np']");
	  driver.findElement(to).click();

 driver.findElement(to).sendKeys("anju.anil@katzion.com");
// System.out.println("yes");

	  driver.findElement(By.xpath("//div[@id=':14t']")).sendKeys("Automation");
	  driver.findElement(By.xpath("//div[@id=':15v']")).sendKeys("hello");
	  driver.findElement(By.xpath("//div[@id=':14i']")).click();

	  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.gmail.com");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  //driver.close();
	  
	  //test
  }

}
