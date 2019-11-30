import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ7 {
	public static void main(String[] args) //throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");

	
	WebDriver driver =new ChromeDriver();
	//Thread.sleep(1000);
	driver.get("http://www.google.com/");
	WebElement search = driver.findElement(By.xpath("//input[contains(@name,'q')]"));
	search.sendKeys("greens velmurugan");
	//Thread.sleep(1000);
	WebElement surf = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
	surf.click();

	
	
	
	
	
	
	
	
	
	}

}
