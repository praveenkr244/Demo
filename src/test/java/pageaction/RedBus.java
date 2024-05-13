package pageaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("google.com");
    }


}
