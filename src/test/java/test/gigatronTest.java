package test;

import base.gigatronBase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.gigatronGalaxyA51Page;
import page.gigatronHomePage;
import page.gigatronMobilniTelefoniIOprema;
import page.gigatronMobilniTelefoniPage;


import javax.swing.*;

public class gigatronTest extends gigatronBase {

    gigatronHomePage GigatronHomePage;
    gigatronMobilniTelefoniIOprema GigatronMobilniTelefoniIOprema;
    gigatronMobilniTelefoniPage GigatronMobilniTelefoniPage;
    gigatronGalaxyA51Page GigatronGalaxyA51Page;

    @Before
    public void SetUpPage() {
        GigatronHomePage = new gigatronHomePage();
        GigatronMobilniTelefoniIOprema = new gigatronMobilniTelefoniIOprema();
        GigatronMobilniTelefoniPage = new gigatronMobilniTelefoniPage();
        GigatronGalaxyA51Page = new gigatronGalaxyA51Page();
    }

    @Test
    public void daLiGalaxyA51ImaAmoledEkran() {
//        GigatronHomePage.hoverOverMenu();
//        GigatronHomePage.clickMobilniTelefoniIOprema();
//        GigatronMobilniTelefoniIOprema.clickMobilniTelefoni();
//        GigatronMobilniTelefoniPage.SortirajPoCeniOpadajuce();
//        ((JavascriptExecutor)
//
//                driver).executeScript("window.scrollTo(0,document.body.scrollHeight");
//        GigatronMobilniTelefoniPage.skrolujNaSamsung();
//        GigatronMobilniTelefoniPage.stiklirajSamsung();

        /*Filipova Korekcija*/


            GigatronHomePage.hoverOverMenu();
            GigatronHomePage.clickMobilniTelefoniIOprema();
            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniIOprema.mobilniTelefoni));
            GigatronMobilniTelefoniIOprema.clickMobilniTelefoni();
            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniPage.prihvatam));
            GigatronMobilniTelefoniPage.acceptCoockie();
            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniPage.samsung));
            GigatronMobilniTelefoniPage.stiklirajSamsung();
            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniPage.lazniPadajuciMeni));
            GigatronMobilniTelefoniPage.klikniNaLazniPadajuciMeni();
            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniPage.ceniOpadajuce));
            GigatronMobilniTelefoniPage.klikniNaCeniOpadajuce();
            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniPage.prikaziVise));
            GigatronMobilniTelefoniPage.klikniPrikaziVise();
//            wdwait.until(ExpectedConditions.visibilityOf(GigatronMobilniTelefoniPage.samsungA51));
//            GigatronMobilniTelefoniPage.klikniSamsungGalaksiA51();
            mojaMetodazaObradu(GigatronMobilniTelefoniPage.samsungA51);
            wdwait.until(ExpectedConditions.visibilityOf(GigatronGalaxyA51Page.tipEkrana));
            Assert.assertEquals("Super AMOLED",GigatronGalaxyA51Page.asertovanjeEkrana());
    }

}
