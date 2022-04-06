package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    public static WebDriver driver;

    public static void setUP() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.epiesa.ro/";
        driver.get(url);
        LOG.info("Open the browser");
//        Dimension dimension = new Dimension(1366, 768);
//        driver.manage().window().setSize(dimension);
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String returnBaseUrl(){
        return "https://www.epiesa.ro/";
    }

    public static String getBaseUrl(){
        String baseurl = returnBaseUrl();
        if (baseurl != null){
            return baseurl.replace("Index.html", "");
        }
        return baseurl;
    }

}
