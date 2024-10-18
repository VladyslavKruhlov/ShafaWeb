package driver_manager;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SetUp {
    public static void setUp(Browsers browser) {
        Configuration.browserSize = "1920x1008";
        Configuration.browserPosition = "1x1";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 60000;
        Configuration.downloadsFolder = "src/test/resources";

        switch (browser) {
            case CHROME -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--disable-infobars");

                Configuration.browserCapabilities = chromeOptions;
                Configuration.browser = "chrome";
            }
            case FIREFOX -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--incognito");
                firefoxOptions.addArguments("--start-maximized");
                firefoxOptions.addArguments("--disable-infobars");

                Configuration.browserCapabilities = firefoxOptions;
                Configuration.browser = "firefox";
            }
            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    public static void close() {
        closeWebDriver();
    }
}