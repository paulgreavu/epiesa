package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.navbar.Navbar;
import pages.register.Register;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public Register register = Register.getInstance();
    public Navbar navbar = Navbar.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUP();
    }

    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }

}
