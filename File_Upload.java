package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload {
public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--start-maximized");
	
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://www.leafground.com/file.xhtml");
	// here i have take parent Xpath , just i tried this and successfully get 
	driver.findElement(By.xpath("//input[@type='file']/parent::span[1]")).click();
	Thread.sleep(3000);
	String file ="C:\\Users\\Administrator\\Documents\\English";
	StringSelection slec =new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(slec, null);
	Thread.sleep(3000);
	Robot rc =new Robot();
	rc.keyPress(KeyEvent.VK_CONTROL);
	rc.keyPress(KeyEvent.VK_V);
	rc.keyRelease(KeyEvent.VK_V);
	rc.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_ENTER);
	
	driver.close();
	
	
	
	

}
}
//C:\Users\Administrator\Desktop\kamal(ST)