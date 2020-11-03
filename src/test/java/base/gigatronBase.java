package base;

        import org.junit.After;
        import org.junit.Before;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.util.concurrent.TimeUnit;

public class gigatronBase {

    public static WebDriver driver;
    public static WebDriverWait wdwait;

    @Before
    public void SetUp() {
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        driver.get("https://www.gigatron.rs/");
    }

    @After
    public void TearDown() {
//        driver.close();
//        driver.quit();
    }

    /*PROBA ZA SKRACIVANJE POZIVA za sada ne diram dok ne skapiram sta je problem na gigatronMobilniTelefoniPage
     * ideja je da bi mogo da napravim metodu koju bi svaka Page mogla da koristi nasledjivanjem za sacekaj da se pojavi pa klikni na element*/

//    public void SacekajIKlikniElement(WebElement x) {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        x.isDisplayed();
//        x.click();
//    }

    public void mojaMetodazaObradu(WebElement x){
        wdwait.until(ExpectedConditions.visibilityOf(x));
            x.click();
    }
}
