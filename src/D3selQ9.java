import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D3selQ9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	WebElement a1 = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	a1.click();
	WebElement a = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	a.sendKeys("iphone");
	WebElement a2 = driver.findElement(By.xpath("//button[@class='vh79eN']"));
	a2.click();
	
	/*String s = driver.getWindowHandle();
	Set<String> m = driver.getWindowHandles();
     for (String x : m) {
    	 if(!x.equals(s)) {
    		driver.switchTo().window(x);
    	 }
    		 
		
	}*/
     WebElement a3 = driver.findElement(By.xpath("//div[text()='Apple iPhone 7 Plus (Black, 32 GB)']"));
 	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
 	
 	a3.click();
	
	
	
	
	

	
	
	}

}
