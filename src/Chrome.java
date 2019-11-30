import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {
	public static void main(String[] args) {
		//to configure
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe" );
		//to launch browser
		
		
		WebDriver a = new ChromeDriver();
		//to launch browser
		a.get("http://www.greenstechnologys.com/");
		 //to get the title of any web page
		String b =a.getTitle();
		System.out.println(b);
		
		//to get url of the current page
		String c=a.getCurrentUrl();
		System.out.println(c);
		
		//to close the browser and quit
		a.quit();
		
		

		WebDriver d = new ChromeDriver();
		 // to launch browser
		d.get("https://www.google.com/gmail/about/#");
		
		//to get title of page
		String e =d.getTitle();
		System.out.println(e);
		
		//to get current title page
		String f = d.getCurrentUrl();
		System.out.println(f);
		
		//to end the browser
		d.quit();
		
		
		
		
		WebDriver d1=new ChromeDriver();
		 // to launch a browser
		d1.get("https://www.flipkart.com/");
		 
		// to get title of the page
		String e1 = d1.getTitle();
		System.out.println(e1);
		
		//to get title of url page
		String f1=d1.getCurrentUrl();
		System.out.println(f1);
		 
		d.quit();
		
		
		
		// creating another object
		WebDriver e2 =new ChromeDriver();
		
		
		// to launch the browser
		e2.get("http://greenstech.in/selenium-course-content.html");
		
		// to print the title of page
		String f2=e2.getTitle();
		System.out.println(f2);
		
		// to print the url
		String g1=e2.getCurrentUrl();
		System.out.println(g1);
		
		
	}
	}
