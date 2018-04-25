package geicoInfo;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class info extends CommonAPI{

    @FindBy(xpath = "/html/body/header/div[1]/ul[1]/li[2]/a")
    public WebElement clickInfo;

    public WebElement getClickInfo() {
        return clickInfo;
    }

    public void setClickInfo(WebElement clickInfo) {
        this.clickInfo = clickInfo;
    }

    public void mouseHoverInformation(){
//        Actions ac = new Actions(driver);
//        ac.moveToElement(getClickInfo()).build().perform();
        getClickInfo().click();
        String text= getClickInfo().getText();
        System.out.println(text);
    }

}
