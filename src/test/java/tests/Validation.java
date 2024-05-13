package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validation {

    @Test
    public void chk() {

        WebDriver driver = new ChromeDriver();
        driver.get("google.com");
    }
}
