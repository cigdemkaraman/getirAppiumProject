package models;

import org.openqa.selenium.By;

public class OnboardingScreenModel extends BaseModel{
    public By btnNext = By.id("btn_next");
    public By btnSkip = By.id("btn_skip");


    public void clickNextButton() {
        clickElement(btnNext);
    }
    public void clickSkipButton() {
        clickElement(btnSkip);
    }
}
