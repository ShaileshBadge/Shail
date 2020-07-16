package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTestCases {
	WebDriver driver;
	DashboardPage dp;

	@BeforeMethod
	public void setup_Browser() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///E:/JbkSoft/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		dp = new DashboardPage(driver);
	}

	@AfterMethod
	public void close_Browser() {
		driver.close();
	}

	@Test(priority = 1)
	public void ValidateTextCoursesOffered() {
		Assert.assertTrue(dp.checkTextInnerHeadingCoursesOffered());
	}

	@Test(priority = 2)
	public void ValidateTextSelenium() {
		Assert.assertTrue(dp.checktextInnerSelenium());
	}

	@Test(priority = 3)
	public void ValidateTextJava_J2EE() {
		Assert.assertTrue(dp.checktextInnerJava_J2EE());
	}

	@Test(priority = 4)
	public void ValidateTextPython() {
		Assert.assertTrue(dp.checktextInnerPython());
	}

	@Test(priority = 5)
	public void ValidateTextPhp() {
		Assert.assertTrue(dp.checktextInnerPhp());
	}

	@Test(priority = 6)
	public void ValidateTextAutomationTesting() {
		Assert.assertTrue(dp.checktextInnerAutomationTesting());
	}

	@Test(priority = 7)
	public void ValidateTextSoftwareDevelopment() {
		Assert.assertTrue(dp.checktextInnerSoftwareDevelopment());
	}

	@Test(priority = 8)
	public void ValidateTextDataScience() {
		Assert.assertTrue(dp.checktextInnerDataScience());
	}

	@Test(priority = 9)
	public void ValidateTextWebDevelopment() {
		Assert.assertTrue(dp.checktextInnerWebDevelopment());
	}

	@Test(priority = 10)
	public void ValidatelinkMoreInfoSelenium() {
		Assert.assertTrue(dp.checktextInnerMoreInfoSelenium());
	}

	@Test(priority = 11)
	public void ValidatelinkMoreInfoJava_J2EE() {
		Assert.assertTrue(dp.checktextInnerMoreInfoJava_J2EE());
	}

	@Test(priority = 12)
	public void ValidatelinkMoreInfoPython() {
		Assert.assertTrue(dp.checktextInnerMoreInfoPython());
	}

	@Test(priority = 13)
	public void ValidatelinkMoreInfoPhp() {
		Assert.assertTrue(dp.checktextInnerMoreInfoPhp());
	}
}