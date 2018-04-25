package zipCode;

import Base.CommonAPI;
import Home.printText;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testTextPrint extends CommonAPI{

    @Test
    public void test2() throws InterruptedException {
        printText pt = PageFactory.initElements(driver, printText.class);
        pt.clickInformation();
    }
}
