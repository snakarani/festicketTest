package FesticketBDD;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //Reusable method for click
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method for Enter text with SendKey
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Reusable method for time stamp

    public static String dateStamp() {

        DateFormat dateFormat = new SimpleDateFormat("DDMMYYYYSSmmHH");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    public static void selectBy(By by) {
        driver.findElement(by).isSelected();
    }

    public static void explicitWait(By by, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static String getText(By by) {
        String text = driver.findElement(by).getText();
        return text;
    }

    //Reusable Method For assert
    public static void assertByGetText(String expectedResult, By by, String errorMessage) {
        Assert.assertEquals(expectedResult, driver.findElement(by).getText(), errorMessage);
    }

    // Drop down selection by value
    public static void selectValue(By by, String value) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    // Drop down selection by index number
    public static void selectIndex(By by, int indexNumber) {
        new Select(driver.findElement(by)).selectByIndex(indexNumber);

    }

    //Wait for element to be clickable for given time in seconds
    public static void waitUntilElementToBeClickable(By webElement, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

    }

    //wait for element to be invisible
    public static void waitForElementInvisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void getcurrenturl() {
        driver.getCurrentUrl();
    }

}

