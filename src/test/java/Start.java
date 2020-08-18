import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Start {


    private AppiumDriver<MobileElement> driver;

    @BeforeEach
    void before() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("newCommandTimeout", 1000000);
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("appPackage", "com.sberbank.services");
        cap.setCapability("appActivity", "com.sberbank.services.ui.splash.SplashActivity");
        cap.setCapability("appExported", "true");
        cap.setCapability("noReset", "true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<>(url, cap);
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);


    }

    @Test
    void createNewUser() throws InterruptedException {

        driver.resetApp();
        driver.navigate().back();


    }

    @Test
    void newBranch1231()   {

//сейчас будет откат

    }
}
