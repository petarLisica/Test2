package page;

import base.gigatronBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gigatronGalaxyA51Page extends gigatronBase {

    public gigatronGalaxyA51Page(){
        PageFactory.initElements(driver,this);
    }

    /*ELEMENTI*/

    public @FindBy(xpath = "//*[@id=\"specifikacija\"]/div/table/tbody/tr[2]/td")
    WebElement tipEkrana;

    /*METODI*/

    public String asertovanjeEkrana() {
        return tipEkrana.getText();
    }
}
