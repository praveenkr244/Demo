import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class TestOnline {
  private WebDriver driver;
  @Test
    public void chkWebtable() throws InterruptedException {
     //  WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String,Object> prefs = new HashMap<String,Object>();
        prefs.put("profile.default_content_settings.popups",0);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--incognito");
        options.addArguments("--disable-user-media-security=true");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.get("https://ump-staging.paytm.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.switchTo().frame("oauth-iframe");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8432897434");
          driver.findElement(By.xpath("//input[@type='password']")).sendKeys("paytm@123");
       driver.findElement(By.xpath("//div[@class='btnCont']//button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#otp_login")).sendKeys("888888");
        driver.findElement(By.xpath("//button[@alt='Verify']")).click();
      Thread.sleep(5000);
        driver.navigate().refresh();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
      WebElement element = wait.until(
              ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Dashboard']")));
      JavascriptExecutor je = (JavascriptExecutor) driver;

//Identify the WebElement which will appear after scrolling down

      WebElement ele= driver.findElement(By.xpath("//label[text()='Settings']"));

// now execute query which actually will scroll until that element is not appeared on page.
      je.executeScript("arguments[0].scrollIntoView(true);",ele);


       driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/nav/div/div/ul[7]/li[1]")).click();
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/nav/div/div/ul[7]/li[2]/div/ul/li[1]/a/span/label")).click();
      Thread.sleep(8000);
      WebElement elemtbttn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"appSetting\"]/div[3]/div[2]/button")));
      int rowcount=driver.findElements(By.xpath("//*[@id=\"appSetting\"]/div[3]/div[3]/table/tbody/tr")).size();
      System.out.println(rowcount);
      int coulmncount=driver.findElements(By.xpath("//*[@id=\"appSetting\"]/div[3]/div[3]/table/thead/tr/th")).size();
      System.out.println(coulmncount);
    for (int i=1; i <rowcount;i++){
        for (int j=1; j<coulmncount;j++){
       if( driver.findElement(By.xpath("//*[@id=\"appSetting\"]/div[3]/div[3]/table/tbody/tr["+i+"]/td["+j+"]")).getText().equalsIgnoreCase("UPI"));


         driver.findElement(By.xpath("//*[@id=\"appSetting\"]/div[3]/div[3]/table/tbody/tr["+i+"]/table/tr/td")).getText().equalsIgnoreCase("Free");

         break;
        }


        }


  }
}
