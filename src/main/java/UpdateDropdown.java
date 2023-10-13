import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wilfr\\Documents\\chromedriver-win64\\chromedriver.exe");
        
       
        WebDriver driver = new ChromeDriver();
        
    
        driver.get("http://spicejet.com");
        
        
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
        
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        
       
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
        
        driver.findElement(By.id("divoaxinfo")).click();
        Thread.sleep(2000L);

   
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

    
        driver.findElement(By.id("btnclosepaxoption")).click();

        
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

       
    }
}