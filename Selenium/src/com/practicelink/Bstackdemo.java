package com.practicelink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bstackdemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
	driver.get("https://bstackdemo.com/signin");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("demouser");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys("testingisfun99");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='login-btn']")).click();
	Thread.sleep(2000);
	driver.close();
}
}
