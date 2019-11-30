import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.cleartrip.com/trains");
WebElement from = driver.findElement(By.xpath("//input[@id='from_station']"));
from.sendKeys("coimbatore");
WebElement tostation = driver.findElement(By.xpath("//input[@id='to_station']"));
tostation.sendKeys("mumbai");

WebElement clas = driver.findElement(By.xpath("//select[@id='trainClass']"));
clas.sendKeys("Sleeper(SL)");


}
}
