package test.navbarTest;

import org.testng.annotations.Test;
import test.BaseTest;

public class NavbarTest extends BaseTest {

    @Test

    public void navbar() {

        navbar.clickMagazine();
        navbar.clickSibiu();
        navbar.clickNume("Paul Greavu");
        navbar.clickEmail("greavuipm@yahoo.com");
        navbar.clickSubject("Test");
        //navbar.clickTrimite();
        //navbar.clickInfo();
        navbar.clickService();
        navbar.clickContact();
    }
}
