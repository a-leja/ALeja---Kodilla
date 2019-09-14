package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public static final String CHROME = "CHROME DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("erbdriver.chrome.driver",)
    };

    if(driver.equals(CHROME)) {
        return new ChromeDriver();
    } else {
        return null;
    }
}
