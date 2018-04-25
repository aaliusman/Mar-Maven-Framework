package Home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;

public class searchZipCode {

    @FindBy(id = "zip")
    public WebElement searchZipInput;

    public WebElement getSearchZipInput() {
        return searchZipInput;
    }

    public void setSearchZipInput(WebElement searchZipInput) {
        this.searchZipInput = searchZipInput;
    }

    public void searchZipValue() {
        List<String> list = zipcodeList();
            for(String st:list){

            getSearchZipInput().sendKeys(st, Keys.ENTER);
        }
    }
    public List<String> zipcodeList(){
        List<String> list = new LinkedList<String>();
        list.add("19067");
        list.add("19047");
        list.add("19207");
        list.add("19020");

        return list;
    }

//    }
//    public List<String> getZipValue(){
//     List<String> zipList = getZipValue();
//    for (String st : zipList) {

//        List<String> zipList = new LinkedList<String>();
//        zipList.add("19020");
//        zipList.add("19047");
//        zipList.add("19120");
//        zipList.add("19007");
//        return zipList;
//    }



}