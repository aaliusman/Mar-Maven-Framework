package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class printText {

    @FindBy(xpath = "/html/body/header/div[1]/ul[1]/li[2]/a")
    public WebElement clickInfo;

    public WebElement getClickInfo() {
        return clickInfo;
    }

    public void setClickInfo(WebElement clickInfo) {
        this.clickInfo = clickInfo;
    }

    public void clickInformation(){
        getClickInfo().click();
       String a= getClickInfo().getText();
        System.out.println(a);
    }


}
