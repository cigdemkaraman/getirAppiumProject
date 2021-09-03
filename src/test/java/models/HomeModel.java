package models;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomeModel extends BaseModel {

    public By clkWater = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Water\"]");
    public By clkfirstProduct = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.allandroidprojects.getirsample:id/recyclerview']/android.widget.FrameLayout[@resource-id='com.allandroidprojects.getirsample:id/cardview'][1]");
    public By txtPrice = By.xpath("//android.widget.ScrollView[@resource-id='com.allandroidprojects.getirsample:id/scrollbar']/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
    public By chkTabs=By.id("tabs");
    public By chkToolbar=By.id("toolbar");
    public By chkContentMain=By.id("content_main");
    public String productPrice;


    public void clickWater(){
        clickElement(clkWater);
    }
    public boolean checkTabs(){
        return isElementVisible(chkTabs);
    }
    public boolean checkToolbar(){
        return isElementVisible(chkToolbar);
    }
    public boolean checkContentMain(){
        return isElementVisible(chkContentMain);
    }
    public void clickFirstProduct(){
        clickElement(clkfirstProduct);
    }
    public void getProductPrice(){
        this.productPrice = getText(txtPrice);
    }
}
