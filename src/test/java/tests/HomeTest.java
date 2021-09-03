package tests;

import com.thoughtworks.gauge.Step;
import models.HomeModel;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();


    @Step("Check that it tabs is shown correctly")
    public void checkTabs() {
        System.out.println("Checking if tabs exists");
        Assert.assertTrue("Tabs not found!",homeModel.checkTabs());
    }

    /*
    @Step("Check that it tabs is shown correctly")
     public void checkTabs() {
         Assert.assertTrue(homeModel.checkTabs());

     } */
    @Step("Check that it toolbar is shown correctly")
    public void checkToolbar() {
        System.out.println("Checking if toolbar exists");
        Assert.assertTrue(homeModel.checkToolbar());

    }

    @Step("Check that it content_main is shown correctly")
    public void checkContentMain() {
        System.out.println("Checking if main content exists");
        Assert.assertTrue(homeModel.checkContentMain());
    }

    @Step("Click on the 'Water' category")
    public void clickWater() {
        System.out.println("Click on the 'Water' category");
        homeModel.clickWater();
    }

    @Step("Open first product detail")
    public void clickFirstProduct() {
        homeModel.clickFirstProduct();
        homeModel.getProductPrice();

    }


}
