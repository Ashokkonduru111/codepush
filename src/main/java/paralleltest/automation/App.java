package paralleltest.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
/**
 * Hello world!
 *
 */

public class App 
{
	@FindBy(xpath = "//a[@class='oj-button-text']" ) ////span[@id='profileLauncher']
	WebElement login_dropdown;
	@FindBy(xpath = "//span[text()='Corporate Login']")
	WebElement croporate_login;
	@FindBy(xpath = "//span[text()='Admin Login']")
	WebElement Admin_login;
	@FindBy(xpath = "//span[text()='Personal Login']")
	WebElement Personal_login;

	// for croporate_login
	@FindBy(xpath = "//input[@id='login_username1|input']")
	WebElement login_username1;
	@FindBy(xpath = "//span[contains(@id,'login-button_oj')]")
	WebElement username_continue_button;
	@FindBy(xpath = "//input[@id='login_securityQuestionAnswer|input']")
	WebElement login_securityQuestionAnswer;
	@FindBy(xpath = "//span[text()='Continue']")
	WebElement Continue;
	@FindBy(xpath = "//span[@class='oj-radiocheckbox-icon oj-component-icon']")
	WebElement check_box_password;
	@FindBy(xpath = "//input[@id='login_password|input']")
	WebElement login_password;
	@FindBy(xpath = "//span[contains(@id,'disablePasswordId_oj')]")
	WebElement password_continue_button;
	
	
	@FindBy(xpath = "//a[@title='Toggle Menu']")
	WebElement tooglemenu;
	@FindBy(xpath = "//span[@class='oj-navigationlist-item-label' and text()='Payments']")
	WebElement payments;
	@FindBy(xpath = "//span[text() = 'Payments and Transfers']")
	WebElement payments_transfer;
	@FindBy(xpath = "//span[text() = 'Transfer Money']")
	WebElement transfermoney;
	@FindBy(xpath = "//span[@id='Payee76_selected']/../following-sibling::span")
	WebElement dropdown;
	@FindBy(xpath = "//input[contains(@aria-controls,'oj-listbox-results-Payee76 oj-listbox-live-Payee76')]")
	WebElement searchbar;
	@FindBy(xpath = "//div[@id='oj-listbox-result-label-19']")
	WebElement selectcustomer;
	@FindBy(xpath = "//input[@id='specific-amount|input']")
	WebElement amount;
	@FindBy(xpath = "//span[text() = 'Select Payment Details']")
	WebElement paymentdetails;
	@FindBy(xpath = "//span[text()='Advance Payment']")
	WebElement paymentdetails_select;
	@FindBy(xpath = "//input[@id='Note16|input']")
	WebElement payment_description;
	@FindBy(xpath = "(//span[@class='oj-radiocheckbox-icon oj-component-icon'])[5]")
	WebElement accept_terms;
	@FindBy(xpath = "//span[text() = 'Pay']")
	WebElement pay;
	@FindBy(xpath = "//span[text() = 'Confirm']")
	WebElement confirm;
	@FindBy(xpath = "//span[@id='Payee76_selected']")
	WebElement dont;
	@FindBy(xpath = "//div[@id='oj-listbox-result-label-1']")
	WebElement selectpaye;

	public static WebDriver driver;
	
	@Test
	public void login_to() throws Exception {
		
		 driver = new ChromeDriver();

//	URL url = new URL("http://localhost:4444");
//	DesiredCapabilities capp = new DesiredCapabilities();
//	capp.setBrowserName("chrome");
//	capp.setPlatform(Platform.WINDOWS);
//      driver = new RemoteWebDriver(url, capp);


      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(60));
      driver.get("https://sitgbonline.e-gulfbank.com/?page=home");
//      Actions act=new Actions(driver);
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

      wait.until(ExpectedConditions.visibilityOfAllElements(login_dropdown));
//      driver.findElement(By.xpath("//a[@class='oj-button-text']")).click();
  	login_dropdown.click();
  	croporate_login.click();
  	login_username1.sendKeys("PTCORPMAKER");
  	username_continue_button.click();
  	login_securityQuestionAnswer.sendKeys("OK");
  	Continue.click();
  	check_box_password.click();
  	login_password.sendKeys("Password@123");
  	password_continue_button.click();
  	tooglemenu.click();
	payments.click();
	payments_transfer.click();
	transfermoney.click();
	dont.click();
	selectpaye.click();
	amount.sendKeys("1000");
	paymentdetails.click();
	paymentdetails_select.click();
	payment_description.sendKeys("payment");
	accept_terms.click();
	pay.click();
	confirm.click();

	}

}
