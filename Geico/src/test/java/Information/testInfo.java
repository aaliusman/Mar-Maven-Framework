package Information;

import geicoInfo.myAccount;
import Base.CommonAPI;
import geicoInfo.info;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testInfo extends CommonAPI {

    @Test
    public void myAcnt(){
        info myacnt = PageFactory.initElements(driver, info.class);
        myacnt.mouseHoverInformation();



    }
}
