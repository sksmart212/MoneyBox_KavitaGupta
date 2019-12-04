package moneybox;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

// THis is class for common functions
    public class Utils extends Basepage {
    private PolicyUtils.IO FileUtils;

    //Clicking element
    public void clickElement(By by) {
        driver.findElement(by).click();
    }
    //method for getting text from web
    public String getTextFromElement(By by) {
        String actualText = driver.findElement(by).getText();
         return actualText;
    }
    //Wait for fixed time given in seconds
    public void waitForFixedTimeGivenInSecond(long time_in_seconds) {
        WebDriverWait wait = new WebDriverWait(driver, time_in_seconds);
        driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);
        //driver.manage().timeouts().setScriptTimeout(time_in_seconds, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(time_in_seconds,TimeUnit.SECONDS);
    }
}






