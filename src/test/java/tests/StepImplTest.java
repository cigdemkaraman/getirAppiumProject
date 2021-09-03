package tests;

import com.thoughtworks.gauge.Step;
import models.HomeModel;
import models.StepImplModel;
import org.junit.Assert;

public class StepImplTest extends HomeModel{

    StepImplModel stepImplModel = new StepImplModel();


    @Step("Add product to basket")
    public void clickAddToCart() {
        stepImplModel.clickAddToCart();
    }
    @Step("Go to basket")
    public void clickBuyNow() {
        stepImplModel.clickBuyNow();
    }

    @Step("Check the number of products")
    public void checkCountProducts() {
        stepImplModel.countItems = stepImplModel.countProductsCheck();
        Assert.assertEquals(1,stepImplModel.countItems);

    }
    @Step("Check the price")
    public void checkPrice() {

        Assert.assertEquals(stepImplModel.getBasketPrice(),productPrice);

    }
    @Step("Delete products from basket")
    public void deleteBasketItems() {
       while(stepImplModel.checkProduct()){
            stepImplModel.clickRemove();
        }

    }
  /*

    @Step("Delete products from basket")
    public void deleteBasketItems() {

       for (int i=0;i<stepImplModel.countItems;i++){
            stepImplModel.clickRemove();
        }
    }
    */
    @Step("Left menu opens")
    public void openLeftMenu() {
        stepImplModel.openLeftMenu();
    }
    @Step("Go to the 'Baby Care' category in the left menu")
    public void openBabyCareCath() {
        stepImplModel.clickBabyCare();
    }
    @Step("Open third product detail")
    public void openThirdProductDetail() {
        stepImplModel.clickThirdProduct();
    }
    @Step("The price of the product is statically controlled. Expected price <key>")
    public void checkPrice(String key) {

        Assert.assertEquals(stepImplModel.getProductPrice(),key);

    }
    @Step("Back to category detail page")
    public void backToCategoryPage() {
        stepImplModel.clickToBack();
    }

}
