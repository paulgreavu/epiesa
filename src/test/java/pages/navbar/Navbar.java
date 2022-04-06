package pages.navbar;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.register.Register;

public class Navbar extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    private static Navbar instance;

    private By magazine = By.xpath("//a[@title='magazine epiesa.ro']");
    private By sibiu = By.xpath("//a[@href='/magazin-piese-auto-sibiu']");
    private By numeField = By.xpath("//input[@name='nume']");
    private By emailField = By.xpath("//input[@name='email']");
    private By subjectField = By.xpath("//input[@name='subject']");
    private By trimite = By.xpath("//button[@class='btn-yellow']");
    private By info = By.xpath("//li[@class='dropdown open']");
    private By service = By.xpath("//a[@target='_blank']");
    private By contact = By.xpath("//a[@href='/contact-epiesa/']");


    private Navbar(){
    }

    public static Navbar getInstance() {
        if (instance == null) {
            instance = new Navbar();
        }
        return instance;
    }

    public void clickMagazine() {
        LOG.info("Click on the Magazine button");
        driver.findElement(magazine).click();
    }

    public void clickSibiu() {
        LOG.info("Click on Magazin Sibiu");
        driver.findElement(sibiu).click();
    }

    public void clickNume(String name) {
        LOG.info("Complete nume field");
        driver.findElement(numeField).click();
        driver.findElement(numeField).sendKeys(name);
    }

    public void clickEmail(String email) {
        LOG.info("Complete email field");
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSubject(String subject) {
        LOG.info("Complete subject field");
        driver.findElement(subjectField).click();
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void clickTrimite(){
        LOG.info("Click on the Trimite button");
        driver.findElement(trimite).click();
    }

    public void clickInfo(){
        LOG.info("Click on the Info button");
        driver.findElement(info).click();
    }

    public void clickService(){
        LOG.info("Click on the Service button");
        driver.findElement(service).click();
    }

    public void clickContact(){
        LOG.info("Click on the Contact button");
        driver.findElement(contact).click();
    }

 }
