package moneybox;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Tab extends Utils {

    //Creating the Property object for Config values
    Loadprop prop = new Loadprop();

    // Declaring variables and extracting data from Config file
    String strCautious = prop.getProperty("Cautious");
    String  strBalanced = prop.getProperty("Balanced");
    String strAdventerous = prop.getProperty("Adventerous");
    String strCashText;//decalaring global
    String strcashfund;//decalaring global
    String strGlobal;//decalaring global
    String strGlobalText;//decalaring global
    String strProperty;//decalaring global
    String strPropertyText;//decalaring global


    // Function will retrieve the 3 Percentages from Config file for Cautious tab and compare it with actual percentage
    // Compare Config values with actual percentage from screen using Assert
    public void CautiousTab(){

        //Click the Cautiuos Tab
         getTextFromElement(By.id(strCautious));
         strcashfund = prop.getProperty("FundA");
        strCashText = getTextFromElement((By.id(strcashfund)));
        Assert.assertEquals(strCashText, prop.getProperty("LabelA1"));//verification

        //getTextFromElement(By by) {
        strGlobal  = prop.getProperty("FundB");
         strGlobalText = getTextFromElement(By.id(strGlobal)) ;//locator for global share fund
        Assert.assertEquals(strGlobalText, prop.getProperty("LabelA2"));//verify

        //getTextFromElement(By by) {
        strProperty = prop.getProperty("FundC");
         strPropertyText = getTextFromElement(By.id(strProperty));//locator for property shares fund
        Assert.assertEquals(strPropertyText, prop.getProperty("LabelA3"));
    }
    // Function will retrieve the 3 Percentages from Config file for Balanced tab
    //  Compare Config values with actual percentage from screen using Assert
    public void Balanced (){


        // Call Util function to click the Balanced tab
         getTextFromElement(By.id(strBalanced));

        // Get the Percentage from Config for Balanced Tab
        strcashfund = prop.getProperty("FundA");

        //Retrieve Percentage for 1st Percentage of Balanced tab
        strCashText=getTextFromElement(By.id(strcashfund));
        //Compare value of Percentage from UI with Config
        Assert.assertEquals(strCashText, prop.getProperty("LabelB1"));

     // Retrieve the 2nd Percentage of Balanced from Config
        strGlobal  = prop.getProperty("FundB");

        //Retrieve the 2nd Percentage value from UI
        strGlobalText=getTextFromElement(By.id(strGlobal));
        // Call util function to click the GlobalShared fund;
        getTextFromElement(By.id(strGlobalText));
        //Compare the UI value with Config
        Assert.assertEquals(strGlobalText, prop.getProperty("LabelB2"));//verify

        // Retrieve 3rd Percentage from Config for Balanced
        strProperty = prop.getProperty("FundC");
        strPropertyText=getTextFromElement(By.id(strProperty));

        //Compare UI percentage from Config
        Assert.assertEquals(strPropertyText, prop.getProperty("LabelB3"));//verification


    }
    // Function will retrieve the 3 Percentages from Config file for Adventerous tab
    //  Compare Config values with actual percentage from screen using Aseert
    public void Adventerous(){

        //getTextFromElement(By by) {
         getTextFromElement(By.id(strAdventerous));//locator for adventerous
        strcashfund = prop.getProperty("FundA");
        strCashText = getTextFromElement(By.id(strcashfund));//locator for cashfund
        Assert.assertEquals(strCashText, prop.getProperty("LabelC1"));

        //getTextFromElement(By by) {
        strGlobal  = prop.getProperty("FundB");
        strGlobalText = getTextFromElement(By.id(strGlobal));//locator for globalsharefund
        Assert.assertEquals(strGlobalText, prop.getProperty("LabelC2"));//verification

        //getTextFromElement(By by) {
        strProperty = prop.getProperty("FundC");
        strPropertyText = getTextFromElement(By.id(strProperty));//locator for propertyshare fund
        Assert.assertEquals(strPropertyText, prop.getProperty("LabelC3"));



    }




}
