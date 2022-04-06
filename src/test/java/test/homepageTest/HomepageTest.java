package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class HomepageTest extends BaseTest {

    @Test

    public void homePage() {

    Assert.assertTrue(homePage.checkLogo(), "Logo is not displayed");
    homePage.clickPieseAuto();
    homePage.clickAudi();
    homePage.clickTT();
    homePage.clickTT8J3();
    homePage.clickTT8J320TFSI();
    homePage.clickTTBWA();
    homePage.clickFiltruUlei(); //locator









    }
}
