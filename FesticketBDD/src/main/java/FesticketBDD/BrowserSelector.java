package FesticketBDD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
// fetch data from  property file

    LoadProperty loadProperty = new LoadProperty();

    public void browserSelect() {

        String browser = loadProperty.getProperty("browser");
        if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            driver = new FirefoxDriver();
            driver.get(loadProperty.getProperty("url"));
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-browserSelect-side-navigation");
             options.addArguments("--incognito");
            options.addArguments("--disable-blink-features=BlockCredentialdSubresources");

            driver = new ChromeDriver(options);
            driver.get(loadProperty.getProperty("url"));
            driver.manage().window().maximize();
        }  else {
            System.out.println("Browser name is empty or typed wrong:" + browser);
        }
    }
}
