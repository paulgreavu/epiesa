package pages.homepage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.xpath("//img[@src='/images/logo.png']");
    private By pieseAuto = By.xpath("//a[@title='piese auto dupa marca']");
    private By audi = By.xpath("//img[@alt='piese auto audi']");
    private By tt = By.xpath("//img[@alt='piese auto audi tt']");
    private By tt8J3 = By.xpath("//a[@title='piese auto audi TT (8J3)']");
    private By tt8J320TFSI = By.xpath("//a[@title='piese auto audi TT 2.0 TFSI']");
    private By ttBWA = By.xpath("/html/body/main/div[2]/div/div[1]/p/a"); //copy xpath
    private By filtruUlei = By.xpath("//a[@title='Filtru aer AUDI TT (8J3) 2.0 TFSI benzina 200 cai']");








    private HomePage(){
    }

    public static HomePage getInstance(){
        if (instance == null){
            instance = new HomePage();
        }
        return instance;
    }



    public boolean checkLogo() {
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void clickPieseAuto() {
        LOG.info("Click Piese Auto link");
        driver.findElement(pieseAuto).click();
    }

    public void clickAudi() {
        LOG.info("Click on the Audi car brand button");
        driver.findElement(audi).click();
    }

    public void clickTT() {
        LOG.info("Click on the TT car model button");
        driver.findElement(tt).click();
    }

    public void clickTT8J3() {
        LOG.info("Click on the TT 8J3 model type button");
        driver.findElement(tt8J3).click();
    }

    public void clickTT8J320TFSI() {
        LOG.info("Click on the 2.0TFSI engine type button");
        driver.findElement(tt8J320TFSI);
    }

    public void clickTTBWA() {
        LOG.info("Click on the BWA engine type button");
        driver.findElement(ttBWA).click();
    }

    public void clickFiltruUlei() {
        LOG.info("Click on the filtru ulei button");
        driver.findElement(filtruUlei).click();
    }









}
