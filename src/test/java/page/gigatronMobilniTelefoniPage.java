package page;

import base.gigatronBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class gigatronMobilniTelefoniPage extends gigatronBase {

    public gigatronMobilniTelefoniPage() {
        PageFactory.initElements(driver,this);
    }

    /*ELEMENTI*/

    /*Filipova Korekcija*/
//    public @FindBy(id = "controlSort")
//    WebElement sortirajPoCeni;
    public @FindBy(className = "btn-aceptar")
    WebElement prihvatam;

    public @FindBy(id = "labelSAMSUNG")
    WebElement samsung;

/*LAZNI PADAJUCI MENI*/

    public @FindBy(xpath = "//div[@data-val=\"rejting\"]")
    WebElement lazniPadajuciMeni;

    public void klikniNaLazniPadajuciMeni() {
        lazniPadajuciMeni.click();
    }

    public @FindBy(xpath = "//div[@data-val=\"opadajuci\"]")
        WebElement ceniOpadajuce;

    public void klikniNaCeniOpadajuce() {
        ceniOpadajuce.click();
    }





 /* -------------------------------- */

    public @FindBy(className = "more-products-btn")
        WebElement prikaziVise;

    public void klikniPrikaziVise() {
        prikaziVise.click();
    }

    public @FindBy(xpath = "//*[@id=\"modernizrcom\"]/body/div[7]/div/div/div[3]/div[6]/div[2]/ul/li[11]/h4/a")
        WebElement samsungA51;

    public void klikniSamsungGalaksiA51() {
        samsungA51.click();
    }


//    public @FindBy(className = "sort")
//    WebElement sortirajPoCeni;
//
//    public @FindBy(className = "btn-aceptar")
//    WebElement prihvatam;

//    public @FindBy(id = "labelSAMSUNG")/*(xpath = "//*[@id=\"brandSAMSUNG\"]")*/
//    WebElement samsung;

//    public @FindBy(xpath = "//*[@id=\"brandSAMSUNG\"]")
//    WebElement scrollTo;
//
//    public void skrolujNaSamsung() {
//        ((JavascriptExecutor)
//                driver).executeScript("arguments[0].scrollIntoView();", scrollTo);
//    }

    /*METODI*/

    /*Filipova Korekcija*/
    public void stiklirajSamsung() {
        samsung.click();
    }
    public void acceptCoockie() {
        prihvatam.click();
    }
//    public void SortirajPoCeniOpadajuce() {
//        Select sortirajPo = new Select(sortirajPoCeni);
//        sortirajPo.selectByVisibleText("Ceni Opadajuće");
    }

//    public void stiklirajSamsung() {
//        scrollTo.click();
//    }

    /*Izgleda da imam gresku negde u sintaksi ali ne mogu da je pronadjem :(*/

//    public void SortirajPoCeniOpadajuce(){
//        Select sortirajPo = new Select(sortirajPoCeni);
//        sortirajPo.selectByVisibleText("Ceni Opadajuće");
//    }


