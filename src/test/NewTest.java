package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
 /* @Test
  public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		Thread.sleep(5000);
		element.sendKeys("devops");
		element.submit();
		Thread.sleep(5000);
		driver.quit();*/
  
	 @Test
  public void f() {
	  
	   	System.setProperty("webdriver.chrome.driver", "C:\\software\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
	//	Thread.sleep(5000);
		element.sendKeys("devops");
		element.submit();
	//	Thread.sleep(5000);
		driver.quit();
  }
  
}

