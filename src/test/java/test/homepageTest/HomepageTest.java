package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.sleep;

public class HomepageTest extends BaseTest {

    @Test

    public void homePage() {

        Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
        homePage.clickPieseAuto();
        homePage.clickAudi();
        homePage.clickTT();
        homePage.clickTT8J3();
        sleep(3000);
        homePage.clickTT8J320TFSI();
        sleep(5000);
        homePage.clickTTBWA();
        sleep(5000);
        homePage.clickFiltruUlei();
        sleep(4000);
        homePage.clickFiltruMann();
        homePage.addItem();
        sleep(3000);

    }
}
