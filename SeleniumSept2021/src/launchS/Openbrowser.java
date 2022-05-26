package launchS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wa_ng\\OneDrive\\Desktop\\SELENIUM\\Maven\\SeleniumSept2021\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.close();
		
		driver.quit();

	}

}
