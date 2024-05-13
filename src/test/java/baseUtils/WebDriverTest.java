package baseUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WebDriverTest {
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();
    protected WebDriver driver;
    protected static String baseUrl;

    //private static final Logger logger = null;

    @Parameters({"browser","baseUrl"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(String browser,String baseUrlProperty) throws Exception {
       // Logger.getLogger(WebDriverTest.class.getName());

        initialize(browser,baseUrlProperty);
    }

    protected WebDriver getWebdriver(String browser){


        if(browser.equalsIgnoreCase("firefox")) {
            /*System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe")*/;
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
           // logger.info("Initializing WebDriver");
            driver.get(baseUrl);
        } else if (browser.equalsIgnoreCase("chrome")){
          //  System.setProperty("webdriver.chrome.driver", "/Users/praveenkumar/Desktop/Demo/src/main/resources/chromedriver");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--test-type");
           // option.setHeadless(true);

           // WebDriverManager.chromedriver().setup();
         driver=WebDriverManager.chromedriver().capabilities(option).create();
            driver.manage().window().maximize();
            driver.get(baseUrl);
        }
        return driver;
    }


    public void initialize(String browser,String baseUrlProperty){
        baseUrl = baseUrlProperty;
        driver   = getWebdriver(browser);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
/*@BeforeMethod
public  void launchURL(String baseUrl){
        driver.get(baseUrl);
}*/

    @AfterMethod(alwaysRun = true)
    public void closeTest(){
        if (driver != null) {
            driver.close();
        }
    }
    @AfterTest(alwaysRun = true)
    public void tearDown() throws Exception {
        cleanUp();
    }
    @DataProvider(name = "csvDataProvider")
    public Object[][] readDataFromCSV() throws IOException {
        String csvFile = "src/test/java/resources/csvfile.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        List<Object[]> data = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(csvSplitBy);
                data.add(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return data.toArray(new Object[0][]);
    }
    protected void cleanUp(){

        driver.quit();
        String verificationErrorString = verificationErrors.toString();
       /* if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }*/
       // logger.info("Quit Webdriver : Exit test");
    }

    //Common Utility Methods
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
