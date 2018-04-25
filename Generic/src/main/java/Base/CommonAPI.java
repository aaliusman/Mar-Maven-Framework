package Base;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "/Users/bravo1516/Web-Automation-Framework/Mar-Web-AutoFramework/driver/chromedriver");
//		driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "/Users/bravo1516/eclipse-workspace/Sel-Project1/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        //driver.close();
    }

    public void printMenu(String locator1, String locator2){
        driver.findElement(By.xpath(locator1)).click();
        String menu= driver.findElement(By.xpath(locator2)).getText();
        System.out.println(menu);
    }

    public void mouseHover(String locator){
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath(locator))).build().perform();
    }

    public void clickWebElement(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public void textInputEnter(String locator1, String locator2){
        driver.findElement(By.id(locator1)).sendKeys(locator2, Keys.ENTER);
    }

    public void textInputField(String locator1, String locator2){
        driver.findElement(By.id(locator1)).sendKeys(locator2);
    }

//    public void selectItemfromList(String locator){
//        Select select = new S(driver.findElement(By.id(locator)));
    }



