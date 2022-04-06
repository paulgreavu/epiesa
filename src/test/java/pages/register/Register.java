package pages.register;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Register extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    private static Register instance;

//    private By contulMeu = By.xpath("//*[@id=\"myNavbar\"]/ul[2]/li/a");
//    private By loginContNou = By.xpath("/html/body/nav[2]/div/ul[2]/li/a");

    private By myAccount = By.xpath("//*[@id='myNavbar']/ul[2]/li/a");
    private By createNewAccount = By.xpath("//*[@id='myNavbar']/ul[2]/li/ul/li/a");

    private By numeField = By.xpath("//input[@name='login_utilizator']");
    private By parolaField = By.xpath("//input[@name='login_parola']");
    private By autentificare = By.xpath("//button[@onclick='this.form.submit();']");
    private By masinileMele = By.xpath("//*[@id=\"maincontent\"]/li[2]/a");
    private By marcaAudi = By.xpath("//*[@id=\"home\"]/form/div[1]/select/option[4]");
    private By modelAudi = By.id("model_marca");
    private By modelAudi8j3 = By.xpath("//*[@id=\"model_marca\"]/option[113]");
    private By carburant = By.id("carburant");
    private By carburantBenzina = By.xpath("//*[@id=\"carburant\"]/option[2]");
    private By cilindree = By.id("cilindree");
    private By cilindree20tfsi = By.xpath("//*[@id=\"cilindree\"]/option[3]");
    private By putere = By.id("motorizari");
    private By putereBWA = By.xpath("//*[@id=\"motorizari\"]/option[2]");
    private By serieSasiu = By.xpath("//input[@name='serie_sasiu']");
    private By adaugaMasina = By.xpath("//input[@class='btn-red']");









    private Register() {
    }

    public static Register getInstance(){
        if (instance == null){
            instance = new Register();
        }
        return instance;
    }

//    public void clickContulMeu(){
//        LOG.info("Click on contul meu");
//        driver.findElement(contulMeu).click();
//    }
//
//    public void clickLogin(){
//        LOG.info("Click on Login/Cont Nou button");
//        driver.findElement(loginContNou).click();
//    }

    public void clickContulMeu() {
        LOG.info("Click on contul meu");
        driver.findElement(myAccount).click();
    }

    public void clickNewAccount() {
        LOG.info("Click on create new account");
        driver.findElement(createNewAccount).click();
    }

    public void completeazaDate(String nume, String parola){
        LOG.info("Complete name and password fields");
        driver.findElement(numeField).sendKeys(nume);
        driver.findElement(parolaField).sendKeys(parola);
    }

    public void clickAutentificare(){
        LOG.info("Click on the Autentificare button");
        driver.findElement(autentificare).click();
    }

    public void clickMasinileMele(){
        LOG.info("Click on the Masinile mele button");
        driver.findElement(masinileMele).click();
    }

    public void clickAudi(){
        LOG.info("Click on the Audi car brand button");
        driver.findElement(marcaAudi).click();
    }

    public void clickModelAudi() {
        LOG.info("Click on the Audi car model button");
        driver.findElement(modelAudi).click();
    }

    public void clickAudi8j3() {
        LOG.info("Click on the audi TT 8j3 car model buton");
        driver.findElement(modelAudi8j3).click();
    }

    public void clickCarburant() {
        LOG.info("Click on the fuel type button");
        driver.findElement(carburant).click();
    }

    public void clickCarburantBenzina() {
        LOG.info("Click on the Gasoline fuel type button");
        driver.findElement(carburantBenzina).click();
    }

    public void clickCilindree() {
        LOG.info("Click on the Cilindree button");
        driver.findElement(cilindree).click();
    }

    public void click20tfsi() {
        LOG.info("Click on the 2.0tfsi button");
        driver.findElement(cilindree20tfsi).click();
    }

    public void clickPutere(){
        LOG.info("Click on the putere button");
        driver.findElement(putere).click();
    }

    public void clickPutereBWA() {
        LOG.info("Click on the 200caiBWA button");
        driver.findElement(putereBWA).click();
    }

    public void introduSerieSasiu(String serie) {
        LOG.info("Introducere serie sasiu");
        driver.findElement(serieSasiu).sendKeys(serie);
    }

    public void clickAdaugaMasina() {
        LOG.info("Add new car");
        driver.findElement(adaugaMasina).click();
    }



}


