package FesticketBDD;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
    BrowserSelector browserSelector= new BrowserSelector();
    @Before
    public void openBrowser(){
        browserSelector.browserSelect();

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
