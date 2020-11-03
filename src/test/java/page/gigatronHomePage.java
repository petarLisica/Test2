package page;

import base.gigatronBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gigatronHomePage extends gigatronBase {

    public gigatronHomePage() {
        PageFactory.initElements(driver,this);
    }

    /*ELEMENTI*/

    public @FindBy(xpath = "//li[@class=\"megamenu product-item\"]")
    WebElement mainMenu;

    public @FindBy(linkText = "Mobilni telefoni i oprema")
    WebElement mobilniTelefoniIOprema;

    /*METODI*/

    public void hoverOverMenu() {
        Actions hover = new Actions(driver);
        hover.moveToElement(mainMenu).perform();
    }

    public void clickMobilniTelefoniIOprema() {
        mobilniTelefoniIOprema.click();
    }

}
