package models;

import driver.Driver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BaseModel extends Driver {

    WebDriverWait wait = new WebDriverWait(appiumDriver, 10);

    public MobileElement findElement(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 20L);
        MobileElement mobileElement = (MobileElement) webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        return mobileElement;
    }

    public List<MobileElement> findElements(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 20L);
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return appiumDriver.findElements(by);
    }
    public MobileElement findCurrentElement(By by) {
        MobileElement currentElement = (MobileElement) appiumDriver.switchTo().activeElement();
        return currentElement;
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    protected void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public String getText(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }


    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static long priceParseInt(By by) {
        //String replaced2 = text.replaceAll("Total Amount : ", "");
        String text= by.toString();
        String finalString = text.replaceAll("$", "");
        long longValue = Long.parseLong(finalString);
        return longValue;
    }

    public static int countItemsInCart(By by) {
        List<WebElement> totalLists = appiumDriver.findElements(by);
        int totalListSize = totalLists.size()+1;
        System.out.println("The number of products in the basket  : " + totalListSize);

        return totalListSize;
    }

    public void goToBack() {
        appiumDriver.navigate().back();
    }


}