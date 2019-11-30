import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ9 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		WebElement mail = driver.findElement(By.xpath("//input[@id='identifierId']"));
		mail.sendKeys("9965105007");
		
		WebElement clkbtn = driver.findElement(By.xpath("//span[@class='CwaK9']"));
		
		clkbtn.click();
		
		//Thread.sleep(5000);
		
		WebElement inputpass = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		
		inputpass.sendKeys("mssoundar09");
		
		//Thread.sleep(5000);
		WebElement btnclk2 = driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]"));
		btnclk2.click();
		
	}

}
 