import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
	
WebDriver driver =new ChromeDriver();

driver.get("https://www.facebook.com/");
WebElement name = driver.findElement(By.xpath("(//input[contains(@id,'email')])[1]"));
name.sendKeys("ms.soundar09@gail.com");

	String printnam = name.getAttribute("value");
	
	WebElement pswd= driver.findElement(By.xpath("(//input[contains(@id,'pass')])"));
	
	pswd.sendKeys("9965105007");
	
	String psss = pswd.getAttribute("value");
	
	
	System.out.println(psss);
	
	System.out.println(printnam);
	
	
}
}
