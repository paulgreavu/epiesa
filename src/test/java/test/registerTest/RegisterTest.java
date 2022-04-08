package test.registerTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {

    @Test

    public void register(){

        register.clickContulMeu();
        register.clickNewAccount();
        register.completeazaDate("greavuipm@yahoo.com", "abcdefg");
        register.clickAutentificare();
        sleep(5000);
        register.clickMasinileMele();
        register.clickAudi();
        register.clickModelAudi();
        register.clickAudi8j3();
        register.clickCarburant();
        sleep(2000);
        register.clickCarburantBenzina();
        sleep(2000);
        register.clickCilindree();
        register.click20tfsi();
        register.clickPutere();
        register.clickPutereBWA();
        register.introduSerieSasiu("TRUZZZ8J881036156");
        register.clickAdaugaMasina();


    }
}
