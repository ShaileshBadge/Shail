package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {
	@FindBy(xpath = "//small[text()='Courses Offered']")
	WebElement CoursesOffered;
	@FindBy(xpath = "//h3[text()='Selenium']")
	WebElement Selenium;
	@FindBy(xpath = "//h3[text()='Java / J2EE']")
	WebElement Java_J2EE;
	@FindBy(xpath = "//h3[text()='Python']")
	WebElement Python;
	@FindBy(xpath = "//h3[text()='Php']")
	WebElement Php;
	@FindBy(xpath = "//p[text()='Automation Testing']")
	WebElement AutomationTesting;
	@FindBy(xpath = "//p[text()='Software Development']")
	WebElement SoftwareDevelopment;
	@FindBy(xpath = "//p[text()='Data Science']")
	WebElement DataScience;
	@FindBy(xpath = "//p[text()='Web Development']")
	WebElement WebDevelopment;
	@FindBy(xpath = "//div/div[1]/div/a")
	WebElement MoreInfoSelenium;
	@FindBy(xpath = "//div[2]/div/a")
	WebElement MoreInfoJava_J2EE;
	@FindBy(xpath = "//div[3]/div/a")
	WebElement MoreInfoPython;
	@FindBy(xpath = "//div[4]/div/a")
	WebElement MoreInfoPhp;

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String checktextCoursesOffered() {
		return CoursesOffered.getText();
	}

	public String checktextSelenium() {
		return Selenium.getText();
	}

	public String checktextJava_J2EE() {
		return Java_J2EE.getText();
	}

	public String checktextPython() {
		return Python.getText();
	}

	public String checktextPhp() {
		return Php.getText();
	}

	public String checktextAutomationTesting() {
		return AutomationTesting.getText();
	}

	public String checktextSoftwareDevelopment() {
		return SoftwareDevelopment.getText();
	}

	public String checktextDataScience() {
		return DataScience.getText();
	}

	public String checktextWebDevelopment() {
		return WebDevelopment.getText();
	}

	public String checktextMoreInfoSelenium() {
		return MoreInfoSelenium.getText();
	}

	public String checktextMoreInfoJava_J2EE() {
		return MoreInfoJava_J2EE.getText();
	}

	public String checktextMoreInfoPython() {
		return MoreInfoPython.getText();
	}

	public String checktextMoreInfoPhp() {
		return MoreInfoPhp.getText();
	}

	public boolean checkTextInnerHeadingCoursesOffered() {
		String exp = "Courses Offered";
		if (checktextCoursesOffered().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerSelenium() {
		String exp = "Selenium";
		if (checktextSelenium().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerJava_J2EE() {
		String exp = "Java / J2EE";
		if (checktextJava_J2EE().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerPython() {
		String exp = "Python";
		if (checktextPython().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerPhp() {
		String exp = "Php";
		if (checktextPhp().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerAutomationTesting() {
		String exp = "Automation Testing";
		if (checktextAutomationTesting().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerSoftwareDevelopment() {
		String exp = "Software Development";
		if (checktextSoftwareDevelopment().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerDataScience() {
		String exp = "Data Science";
		if (checktextDataScience().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerWebDevelopment() {
		String exp = "Web Development";
		if (checktextWebDevelopment().equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checktextInnerMoreInfoSelenium() {
		boolean flag = MoreInfoSelenium.isEnabled();
		Assert.assertTrue(flag);
		return true;
	}

	public boolean checktextInnerMoreInfoJava_J2EE() {
		boolean flag = MoreInfoJava_J2EE.isEnabled();
		Assert.assertTrue(flag);
		return true;
	}

	public boolean checktextInnerMoreInfoPython() {
		boolean flag = MoreInfoPython.isEnabled();
		Assert.assertTrue(flag);
		return true;
	}

	public boolean checktextInnerMoreInfoPhp() {
		boolean flag = MoreInfoPhp.isEnabled();
		Assert.assertTrue(flag);
		return true;
	}
}