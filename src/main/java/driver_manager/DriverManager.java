package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver webDriver;

    public static void startWebDriver() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://blazedemo.com/");
        }
    }

    public static void shutDownDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public static WebDriver getWebDriver() {
        if (webDriver != null) {
            return webDriver;
        } else throw new RuntimeException("Web driver is not started");
    }

    public static void goToHomePage() {
        webDriver.get("http://blazedemo.com/");
    }
}
