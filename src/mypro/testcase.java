package mypro;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class testcase {
      WebDriver driver;
	//static WebDriverWait wait = new WebDriverWait(driver,10);
	
	/*@BeforeClass
	public void Beforetest(){
		driver = new FirefoxDriver();
		driver.get("https://phptravels.com/demo/");
	}
	*/
	
	@Test
	public static void test() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		System.out.println("Test started");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/header/div/div/nav/ul/li[8]/a/span")));
		String actualText = driver.findElement(By.xpath("/html/body/header/div/div/nav/ul/li[1]/span/span/a")).getText();
		String Expectedtext = "DEMO";
		
		Assert.assertEquals(actualText, Expectedtext);
	}

	

}
