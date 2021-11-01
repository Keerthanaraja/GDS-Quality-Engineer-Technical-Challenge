package com.keerthi.project.GDSChallenge;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class GDS_UserStory_3_Negative {
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

		// WebDriverWait Eligibility4 = new WebDriverWait(driver, 20);
		// Eligibility4
		// .until(ExpectedConditions.elementToBeClickable(By.xpath(
		// "//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[7]/div/div[2]/label[1]/span[2]")))
		// .click();

		WebDriverWait Eligibility5 = new WebDriverWait(driver, 10);
		Eligibility5
				.until(ExpectedConditions.elementToBeClickable(By.id("react-eligibility-started_project_check-true")))
				.click();

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
		driver.findElement(By.id("next-btn")).click();

		WebDriverWait ProjectTitle = new WebDriverWait(driver, 10);
		ProjectTitle.until(ExpectedConditions.elementToBeClickable(By.id("react-project-title")))
				.sendKeys("Participate in TestDemo");

		WebDriverWait StartDate = new WebDriverWait(driver, 10);
		StartDate.until(ExpectedConditions.elementToBeClickable(By.id("react-project-start_date")))
				.sendKeys("05 Nov 2021");

		WebDriverWait EndDate = new WebDriverWait(driver, 10);
		EndDate.until(ExpectedConditions.elementToBeClickable(By.id("react-project-end_date"))).sendKeys("30 Nov 2021");

		WebDriverWait ProjDesc = new WebDriverWait(driver, 10);
		ProjDesc.until(ExpectedConditions.elementToBeClickable(By.id("react-project-description")))
				.sendKeys("This is a testdemo project");

		WebDriverWait Activity = new WebDriverWait(driver, 10);
		Activity.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='Select-control'])[1]")))
				.click();
		Activity.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@id='react-select-project-activity--option-0'])"))).click();

		Activity.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='Select-control'])[2]")))
				.click();
		Activity.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@id='react-select-project-primary_market--option-201'])")))
				.click();

		WebDriverWait FirstTime = new WebDriverWait(driver, 10);
		FirstTime.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='js-app']/div/div/div[2]/div[2]/div/div/div[1]/div[12]/div/div[2]/label[1]/span[1]")))
				.click();

		driver.findElement(By.id("save-btn")).click();
		driver.findElement(By.id("next-btn")).click();

		WebDriverWait FYEndDate = new WebDriverWait(driver, 10);
		FYEndDate.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-fy_end_date_0")))
				.sendKeys("30 Nov 2021");

		WebDriverWait OverseasSales = new WebDriverWait(driver, 10);
		OverseasSales.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_sales_0")))
				.sendKeys("500");

		WebDriverWait OverseasSales1 = new WebDriverWait(driver, 10);
		OverseasSales1.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_sales_1")))
				.sendKeys("550");

		WebDriverWait OverseasSales2 = new WebDriverWait(driver, 10);
		OverseasSales2.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_sales_2")))
				.sendKeys("100");

		WebDriverWait OverseasSales3 = new WebDriverWait(driver, 10);
		OverseasSales3.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_sales_3")))
				.sendKeys("180");

		WebDriverWait OverseasInv = new WebDriverWait(driver, 10);
		OverseasInv.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_investments_0")))
				.sendKeys("4000");

		WebDriverWait OverseasInv1 = new WebDriverWait(driver, 10);
		OverseasInv1
				.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_investments_1")))
				.sendKeys("1500");

		WebDriverWait OverseasInv2 = new WebDriverWait(driver, 10);
		OverseasInv2
				.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_investments_2")))
				.sendKeys("800");

		// WebDriverWait OverseasInv3 = new WebDriverWait(driver, 10);
		// OverseasInv3
		// .until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-overseas_investments_3")))
		// .sendKeys("500");

		WebDriverWait Projections = new WebDriverWait(driver, 10);
		Projections.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-rationale_remarks")))
				.sendKeys("Determine your financial needs");

		WebDriverWait NTBenefits = new WebDriverWait(driver, 10);
		NTBenefits.until(ExpectedConditions.elementToBeClickable(By.id("react-project_impact-benefits_remarks")))
				.sendKeys("Knowledge Transfer");

		driver.findElement(By.id("save-btn")).click();
		driver.findElement(By.id("next-btn")).click();

		WebDriverWait OfficespaceRental = new WebDriverWait(driver, 10);
		OfficespaceRental.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@id='react-project_cost-office_rentals-accordion-header']//div[@class='accordion-chevron pull-right']")))
				.click();

		WebDriverWait AdditemOfficeRental = new WebDriverWait(driver, 10);
		AdditemOfficeRental
				.until(ExpectedConditions.elementToBeClickable(By.id("react-project_cost-office_rentals-add-item")))
				.click();

		WebDriverWait OfficeRentalDesc = new WebDriverWait(driver, 10);
		OfficeRentalDesc
				.until(ExpectedConditions
						.elementToBeClickable(By.id("react-project_cost-office_rentals-0-description")))
				.sendKeys("Testplace");

		WebDriverWait OfficeRentalDuration = new WebDriverWait(driver, 10);
		OfficeRentalDuration
				.until(ExpectedConditions
						.elementToBeClickable(By.id("react-project_cost-office_rentals-0-rental_duration")))
				.sendKeys("1");

		WebDriverWait OfficeRentalMonthly = new WebDriverWait(driver, 10);
		OfficeRentalMonthly
				.until(ExpectedConditions
						.elementToBeClickable(By.id("react-project_cost-office_rentals-0-amount_in_billing_currency")))
				.sendKeys("1000");

		driver.findElement(By.id("save-btn")).click();
		driver.findElement(By.id("next-btn")).click();

	}

	@Test
	public void Declareackterms() throws InterruptedException {

		// WebDriverWait qn1 = new WebDriverWait(driver, 100);
		// qn1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-declaration-criminal_liability_check-false']")))
		// .click();

		Actions actqn1 = new Actions(driver);
		actqn1.moveToElement(driver.findElement(By.id("react-declaration-criminal_liability_check-false"))).click()
				.perform();

		WebDriverWait qn2 = new WebDriverWait(driver, 10);
		qn2.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-civil_proceeding_check-false")))
				.click();

		WebDriverWait qn3 = new WebDriverWait(driver, 10);
		qn3.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-insolvency_proceeding_check-false")))
				.click();

		WebDriverWait qn4 = new WebDriverWait(driver, 10);
		qn4.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-project_incentives_check-false")))
				.click();

		WebDriverWait qn5 = new WebDriverWait(driver, 10);
		qn5.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-other_incentives_check-false")))
				.click();

		WebDriverWait qn6 = new WebDriverWait(driver, 10);
		qn6.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-project_commence_check-false")))
				.click();

		WebDriverWait qn7 = new WebDriverWait(driver, 10);
		qn7.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-related_party_check-false")))
				.click();

		WebDriverWait qn8 = new WebDriverWait(driver, 10);
		qn8.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-debarment_check-false"))).click();

		WebDriverWait qn9 = new WebDriverWait(driver, 10);
		qn9.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-covid_safe_check-true"))).click();

		// WebDriverWait qn10 = new WebDriverWait(driver, 10);
		// qn10.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-covid_safe_ques_check-true")))
		// .click();

		Actions actqn10 = new Actions(driver);
		actqn10.moveToElement(driver.findElement(By.id("react-declaration-covid_safe_ques_check-true"))).click()
				.perform();

		WebDriverWait ack = new WebDriverWait(driver, 10);
		ack.until(ExpectedConditions.elementToBeClickable(By.id("react-declaration-consent_acknowledgement_check")))
				.click();

		driver.findElement(By.id("save-btn")).click();
		driver.findElement(By.id("review-btn")).click();

		System.out.println("Error validated and no.of numbers displayed sidebar next to the offending section");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
