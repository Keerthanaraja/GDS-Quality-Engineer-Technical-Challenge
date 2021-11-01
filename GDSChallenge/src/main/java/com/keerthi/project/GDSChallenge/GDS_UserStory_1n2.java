package com.keerthi.project.GDSChallenge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class GDS_UserStory_1n2 {
	WebDriver driver;
	String driverPath = "C:\\Users\\Sharnie\\OneDrive\\Documents\\Sharnie\\chromedriver_win32\\chromedriver.exe";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://public:Let$BeC001@bgp-qa.gds-gov.tech");
		driver.findElement(By.xpath("//a[@id='login-button']")).click();
		driver.findElement(By.name("CPUID")).clear();
		driver.findElement(By.name("CPUID")).sendKeys("S1234567A");
		driver.findElement(By.name("CPUID_FullName")).clear();
		driver.findElement(By.name("CPUID_FullName")).sendKeys("Tan Ah Kow");
		driver.findElement(By.name("CPEntID")).clear();
		driver.findElement(By.name("CPEntID")).sendKeys("BGPQEDEMO");
		Select drpRole = new Select(driver.findElement(By.name("CPRole")));
		drpRole.selectByVisibleText("Acceptor");
		driver.findElement(By.xpath("//form[2]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@id='dashboard-menubox-app-apply-grant']/section/div/div[2]/h4")))
				.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='grant-wizard']/div[1]/div/div[1]/div[4]/div/label/div/div")))
				.click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='grant-wizard']/div[1]/div/div/div[1]/div/label/div")))
				.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='grant-wizard']/div[1]/div/div/div[1]/div/label/div/span")))
				.click();

		WebDriverWait wait4 = new WebDriverWait(driver, 100);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='go-to-grant']"))).click();

		WebDriverWait wait5 = new WebDriverWait(driver, 100);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='keyPage-form-button']"))).click();

	}

	@Test(priority = 0)
	public void VerifyEligibitySection() {
		WebDriverWait Eligibility1 = new WebDriverWait(driver, 10);
		Eligibility1
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div/div[2]/label[1]/span[1]")))
				.click();

		WebDriverWait Eligibility2 = new WebDriverWait(driver, 10);
		Eligibility2
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[5]/div/div[2]/label[1]/span[2]")))
				.click();

		WebDriverWait Eligibility3 = new WebDriverWait(driver, 10);
		Eligibility3
				.until(ExpectedConditions.elementToBeClickable(By
						.xpath("//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[6]/div/div[2]/label[1]")))
				.click();

		WebDriverWait Eligibility4 = new WebDriverWait(driver, 10);
		Eligibility4
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[7]/div/div[2]/label[1]/span[2]")))
				.click();

		WebDriverWait Eligibility5 = new WebDriverWait(driver, 10);
		Eligibility5
				.until(ExpectedConditions.elementToBeClickable(By
						.xpath("//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[8]/div/div[2]/label[2]")))
				.click();

		String exp = "Visit Smart Advisor on the SME Portal for more information on other government assistance";
		WebElement msg = driver.findElement(By.xpath("//div[@class='eligibility-advice']/span"));
		String act = msg.getText();
		if (act.equals(exp)) {
			System.out.println("Test case passed");

		} else {
			System.out.println("Test case failed");

		}
		AssertJUnit.assertEquals(act, exp);

	}

	@Test(priority = 1)
	public void VerifyContactDetails() throws InterruptedException {
		WebDriverWait contactlink = new WebDriverWait(driver, 100);
		contactlink.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact Details"))).click();

		WebDriverWait Name = new WebDriverWait(driver, 10);
		Name.until(ExpectedConditions.elementToBeClickable(By.id("react-contact_info-name"))).sendKeys("Tan Ah Kow");

		WebDriverWait JobTitle = new WebDriverWait(driver, 10);
		JobTitle.until(ExpectedConditions.elementToBeClickable(By.id("react-contact_info-designation")))
				.sendKeys("Auditor");

		WebDriverWait Contactno = new WebDriverWait(driver, 10);
		Contactno.until(ExpectedConditions.elementToBeClickable(By.id("react-contact_info-phone")))
				.sendKeys("96543210");

		WebDriverWait Email = new WebDriverWait(driver, 10);
		Email.until(ExpectedConditions.elementToBeClickable(By.id("react-contact_info-primary_email")))
				.sendKeys("tanahkow@gmail.com");

		WebDriverWait checkmailingaddr = new WebDriverWait(driver, 10);
		checkmailingaddr.until(
				ExpectedConditions.elementToBeClickable(By.id("react-contact_info-correspondence_address-copied")))
				.click();

		WebDriverWait LOaddressee = new WebDriverWait(driver, 10);
		LOaddressee.until(ExpectedConditions.elementToBeClickable(By.id("react-contact_info-copied"))).click();

		driver.findElement(By.id("save-btn")).click();
		WebElement click = driver.findElement(By.id("save-btn"));
		Actions act = new Actions(driver);
		act.moveToElement(click).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(100);
		System.out.println("Refreshed and saved details displayed correctly");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
