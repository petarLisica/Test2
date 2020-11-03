package page;

import base.gigatronBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gigatronMobilniTelefoniIOprema extends gigatronBase {

    public gigatronMobilniTelefoniIOprema() {
        PageFactory.initElements(driver,this);
    }

    /*Elementi*/

    public @FindBy(linkText = "Mobilni telefoni")
    WebElement mobilniTelefoni;

    /*METODI*/

    public void clickMobilniTelefoni(){
        mobilniTelefoni.click();
    }

//    public void openMobilnitelefoni() {
//       driver.get("https://www.gigatron.rs/mobilni_telefoni");
//    }

}
