import baseUtils.WebDriverTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageaction.AmazonLogin;


public class ToVerify extends WebDriverTest {

    @Test(dataProvider = "csvDataProvider")
    public void launchAndLogin(String param1, String param2, String param3){

        AmazonLogin amzlogin=new AmazonLogin(driver);
        amzlogin.login("praveen.kr244@gmail.com","Praveen@244");
        amzlogin.testWithDataFromCSV(param1,param2,param3);
    }

   /* @Test
    public void getAttribte(){

        AmazonLogin amzlogin=new AmazonLogin(driver);
        amzlogin.getAttribute();
    }*/


}
