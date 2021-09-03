package driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AppiumDriver appiumDriver;

    @BeforeScenario
    public void initializeDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.allandroidprojects.getirsample");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.allandroidprojects.getirsample.startup.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 250);
        URL url = new URL("http://localhost:4723/wd/hub");
        appiumDriver = new AppiumDriver(url, capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
    }

    @AfterScenario
    public void closeDriver() {
        appiumDriver.quit();
    }
}
