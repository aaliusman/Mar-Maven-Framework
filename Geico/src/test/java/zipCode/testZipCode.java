package zipCode;

import Home.searchZipCode;
import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

public class testZipCode extends CommonAPI{

    @Test
    public void test1() throws InterruptedException {
      searchZipCode zp = PageFactory.initElements(driver, searchZipCode.class);
      zp.searchZipValue();
    }

}