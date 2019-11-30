import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		WebElement review = driver.findElement(By.xpath("//span[contains(text(),'Overall Reviews')]"));
	
	String rvw = review.getText();
	System.out.println(rvw);
	
	
	
	
	}

}
