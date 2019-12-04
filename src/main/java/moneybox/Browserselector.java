package moneybox;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Brwoser Selector clas for initializing the Browser object/Chrome driver
public class Browserselector extends Utils {
    public void setUpBrowser() {
        String browser;
        Loadprop loadprop = new Loadprop();
        browser = loadprop.getProperty("Browser");
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\BrowserDriver\\chromedriver.exe");

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extension");
        options.addArguments("--disable-setUpBrowser-side-navigation");
        options.addArguments("--incognito");
        options.addArguments("--disable-blink-features-BlockCredentialeSubresources");
        Basepage.driver=new ChromeDriver(options);
        Basepage.driver.manage().window().fullscreen();
        waitForFixedTimeGivenInSecond(50);
    }

}

