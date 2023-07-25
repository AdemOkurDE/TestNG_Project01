package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userHomepage {

    public userHomepage(){
        PageFactory.initElements(Driver.getDriver() ,this);
    }
}
