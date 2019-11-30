import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ0 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement para = driver.findElement(By.xpath("(//span[@class='testimonial-content'])[1]"));
		
		String name = para.getText();
		
		System.out.println(name);
		
		driver.quit();
		
		
		
	}

}
