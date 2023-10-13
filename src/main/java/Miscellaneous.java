
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Miscellaneous {

    public static void main(String[] args) throws IOException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wilfr\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        
        driver.get("http://facebook.com");

        
        driver.findElement(By.id("email")).sendKeys("fsfd");

        
        driver.manage().window().maximize();

       
        driver.manage().deleteAllCookies();


      getScreenshot(driver);

     
        getScreenshot(driver);
    }

    public static void getScreenshot(WebDriver driver) throws IOException {
        
        driver.get("http://google.com");

      
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src, new File("C:\\Users\\wilfr\\Pictures\\Screenshots\\screenshot.png"));
    }
}