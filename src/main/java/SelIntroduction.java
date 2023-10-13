import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		//Invoking Browser 

		// Chrome - ChromeDriver ->Methods close get
		//Firefox- FirefoxDriver ->methods close get
		//Safari SaariDriver ->methods close get
		// WebDriver close get
		// WebDriver methods + class methods
		
		//  chromedriver.exe-> Chrome browser Selenium Manager
		//step to invoke chrome driver //
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wilfr\\Documents\\chromedriver-win64\\chromedriver.exe");
		
		//webdriver.chrome.driver->value of path
		//WebDriver driver = new ChromeDriver();
		
		
		//Firefox Launch
		// geckodriver
		
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\wilfr\\Documents\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.udemy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
