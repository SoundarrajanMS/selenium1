import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
 
      WebDriver driver = new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Register.html");
     WebElement fstnme = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
      fstnme.sendKeys("sundara"); 
      
      WebElement lstnme = driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'])[2]"));
      lstnme.sendKeys("moorthy");
      
      WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
      address.sendKeys("ooty");
      
      WebElement email = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
      email.sendKeys("ks.moorthy04@gmail.com");
      
      WebElement phno = driver.findElement(By.xpath("form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched"));
      phno.sendKeys("9443856496");
      
      WebElement btn = driver.findElement(By.xpath("//input[@class='ng-dirty ng-valid ng-valid-required ng-touched']"));
      btn.click();
      WebElement hobby = driver.findElement(By.xpath("//input[@id='checkbox2']"));
     hobby.click();
     
     WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
    lang.sendKeys("tamil");
    
   

}
}
