package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapLoginwindow {

  // GIT hub example
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"F:/Rinku/Automation/Drivers/geckodriver-v0.11.1-win64/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();

		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();

		  WebElement element = driver.findElement(By.xpath("//iframe[@id='authiframe']"));
		driver.switchTo().frame(element);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='id_mobile']")).sendKeys("9952536545");
		driver.findElement(By.xpath(".//*[@id='id_password1']")).sendKeys("jajbsajdb");
	}

}
