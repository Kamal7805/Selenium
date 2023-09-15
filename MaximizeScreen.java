package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--start-maximized");
		WebDriver driver =new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //Dimension dimen =new Dimension(1920, 1080);
		//driver.manage().window().setSize(dimen);
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0krmgioc4tbc41e3qjuhwuhgba474277.node0");
		driver.findElement(By.id("j_idt88:name")).sendKeys("vk");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("madurai");
		Thread.sleep(3000);
		
		//To refresh the Page
		driver.get(driver.getCurrentUrl());
		Thread.sleep(3000);				
		driver.close();
		
//		automation practice website
//		http://www.automationpractice.pl/index.php

	}

}
