package pageaction;

import baseUtils.WebDriverTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AmazonLogin  {
    private WebDriver driver;
    Logger logger = null;

    public AmazonLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath ="//*[@id='nav-link-accountList-nav-line-1']")
    WebElement signin;

    @FindBy(xpath ="//*[@name='email']")
    WebElement enteremail;

    @FindBy(xpath = "//*[@id='continue']")
    WebElement countinebttn;

    @FindBy(xpath = "//*[@name='password']")
    WebElement enterpassword;

    @FindBy(xpath="//*[@id='signInSubmit']")
    WebElement signInSubmit;

    @FindBy(css=".hm-icon-label")
    WebElement allMenu;

    public void login(String un ,String pwd){
        //logger.info("Strating login");
        signin.click();
        enteremail.sendKeys(un);
        countinebttn.click();
        enterpassword.sendKeys(pwd);
       // logger.info("successful  login");

        //signInSubmit.click();
    }

    public void getAttribute(){
        String v1=allMenu.getAttribute("role");
        System.out.println(v1);
        String v2=allMenu.getAttribute("aria-label");
        System.out.println(v2);
        String v3=allMenu.getAttribute("id");
        System.out.println(v3);
        String v4= allMenu.getCssValue("id");
        System.out.println(v4);

    }
    public void testWithDataFromCSV(String param1, String param2, String param3) {
        // Test method using data from CSV
        System.out.println("Param1: " + param1 + ", Param2: " + param2 + ", Param3: " + param3);
        // Add your test logic here
    }
}

