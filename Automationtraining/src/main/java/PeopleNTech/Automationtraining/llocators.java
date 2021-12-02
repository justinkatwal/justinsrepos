package PeopleNTech.Automationtraining;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class llocators {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement SearchIcon=driver.findElement(By.id("nav-search-submit-button"));
	SearchIcon.click();
	Thread.sleep(6000);
	WebElement bestsellers=driver.findElement(By.linkText("Best Sellers"));
	bestsellers.click();
	WebElement linktx=driver.findElement(By.partialLinkText("Epic"));
	linktx.click();
	Thread.sleep(6000);
	WebElement searchfield=driver.findElement(By.name("field-keywords"));
	searchfield.sendKeys("computer chair");
	WebElement SearchIcon6=driver.findElement(By.id("nav-search-submit-button"));
	SearchIcon6.click();
	}

}
