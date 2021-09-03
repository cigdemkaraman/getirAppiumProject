package tests;

import com.thoughtworks.gauge.Step;
import models.OnboardingScreenModel;

public class OnboardingScreenTest{
    OnboardingScreenModel onbModel=new OnboardingScreenModel();

    @Step("Click 'Next' button")
    public void clickNextButton() {
        onbModel.clickNextButton();
    }
    @Step("Click 'Skip' button")
    public void clickSkipButton() {
        onbModel.clickSkipButton();
    }
}
