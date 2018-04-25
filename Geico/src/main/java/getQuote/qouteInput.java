package getQuote;

import Base.CommonAPI;

public class qouteInput extends CommonAPI{

    public void enterInfoforQoute(){

        textInputEnter("zip", "19047");
        textInputField("firstName", "ADGEC");
        textInputField("lastName", "Ytgrfqp");
        textInputField("stree", "800 Trenton rd");
        textInputField("apt", "134");
        textInputField("date-monthdob", "11");
        textInputField("date-daydob", "11");
        textInputField("date-yeardob", "1991");
        clickWebElement("btnSubmit");

    }


}
