import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2selQ5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.swiggy.com/");
		WebElement delvlocation = driver.findElement(By.id("location"));
		delvlocation.sendKeys("omr");*/
		
		/*driver.get("https://www.snapdeal.com/login");
        WebElement mobnum = driver.findElement(By.id("userName"));
        mobnum.sendKeys("9965105007");
		
		/*driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement usname = driver.findElement(By.name("username"));
		usname.sendKeys("kokila");
		
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("12345");*/
	

	 driver.get("https://www.irctc.co.in/");
	    WebElement from = driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]"));
	    from.sendKeys("chennai");
	    
	    WebElement dest = driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[2]"));
	    dest.sendKeys("ooty");
	}

}
