package pages.footer;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Footer extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(Footer.class);
    public static Footer instance;

    private By Waranty = By.xpath("//a[@title='garantie si retur']");
    private By Magazin = By.xpath("//a[@href='/magazin-piese-auto-sibiu']");
    private By Contact = By.xpath("//a[@title='contact epiesa.ro']");
    private By Terms = By.xpath("//a[@title='termeni si conditii']");

    private Footer(){
    }

    public static Footer getInstance(){
        if (instance == null){
            instance = new Footer();
        }
        return instance;
    }

    public void clickGarantii(){
        LOG.info("Click Garantii Footer section");
        driver.findElement(Waranty).click();
    }

    public void clickMagazin(){
        LOG.info("Click Magazin Footer section");
        driver.findElement(Magazin).click();
    }

    public void clickContact(){
        LOG.info("Click on Contact Footer");
        driver.findElement(Contact).click();
    }

    public void clickTermeni(){
        LOG.info("click Termeni si conditii");
        driver.findElement(Terms).click();
    }



}