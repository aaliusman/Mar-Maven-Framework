package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class nonTestNgClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
//		System.setProperty("webdriver.chrome.driver", "/Users/bravo1516/eclipse-workspace/Sel-Project1/driver/chromedriver");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/bravo1516/eclipse-workspace/Sel-Project1/driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		String menuList = driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect")).getText();
		System.out.println(menuList);
		
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
