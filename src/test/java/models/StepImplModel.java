package models;

import org.openqa.selenium.By;

public class StepImplModel extends BaseModel {

    public int countItems = 0;
    public By btnAddToCart = By.id("text_action_bottom1");
    public By btnBuyNow = By.id("text_action_bottom2");
    public By btnRemove = By.id("layout_action1");
    public By itemsInCart = By.id("recyclerview");
    public By txtPriceBasket = By.id("text_action_bottom1");
    public By leftMenu = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    public By btnBabyCare =
            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
    public By clkThirdProduct = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.allandroidprojects.getirsample:id/recyclerview']/android.widget.FrameLayout[@resource-id='com.allandroidprojects.getirsample:id/cardview'][3]");
    public By txtPrice =
            By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");


    public void clickAddToCart() {
        clickElement(btnAddToCart);
    }

    public void clickThirdProduct() {
        clickElement(clkThirdProduct);
    }
    public void clickToBack() {
        goToBack();
    }
    public void clickBabyCare() {
        clickElement(btnBabyCare);
    }

    public void openLeftMenu() {
        clickElement(leftMenu);
    }

    public void clickBuyNow() {
        clickElement(btnBuyNow);
    }

    public int countProductsCheck() {
        this.countItems = countItemsInCart(itemsInCart);
        return countItems;
    }

    public String getBasketPrice() {
        String price = getText(txtPriceBasket);
        return price;
    }

    public void clickRemove() {
        clickElement(btnRemove);
    }

    public boolean checkProduct() {
        return isElementVisible(btnRemove);
    }

    public String getProductPrice() {
        return getText(txtPrice);
    }



}