package test.footerTest;

import org.testng.annotations.Test;
import test.BaseTest;


public class FooterTest extends BaseTest {

    @Test
    public void FooterTesting() {
        footer.clickGarantii();
        footer.clickMagazin();
        footer.clickContact();
        footer.clickTermeni();
    }
}
