package paralleltest.automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class payments {

	@Test
	public void Internalpay() throws InterruptedException, MalformedURLException {
		URL url = new URL("http://localhost:4444");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		
		DesiredCapabilities capp = new DesiredCapabilities();
		capp.setBrowserName("chrome");
		capp.setPlatform(Platform.WINDOWS);
		capp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		capp.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new RemoteWebDriver(url, capp);
		// WebDriver driver=new ChromeDriver();

		try {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://sitgbonline.e-gulfbank.com/?page=home");
			WebDriverWait wit = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement login_button = driver.findElement(By.xpath("//span[@id='profileLauncher']"));
			wit.until(ExpectedConditions.visibilityOf(login_button));
			Thread.sleep(7000);
			login_button.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Corporate Login']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='login_username1|input']")).sendKeys("PTCORPMAKER");
			driver.findElement(By.xpath("//span[contains(@id,'login-button_oj')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='login_securityQuestionAnswer|input']")).sendKeys("OK");
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='oj-radiocheckbox-icon oj-component-icon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login_password|input']")).sendKeys("Welcome@1");
			driver.findElement(By.xpath("//span[contains(@id,'disablePasswordId_oj')]")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//a[@title='Toggle Menu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='oj-navigationlist-item-label' and text()='Payments']")).click();
			driver.findElement(By.xpath("//span[text() = 'Payments and Transfers']")).click();
			driver.findElement(By.xpath("//span[text() = 'Transfer Money']")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//span[@id='Payee76_selected']/../following-sibling::span")).click();
			Thread.sleep(7000);
			driver.findElement(
					By.xpath("//input[contains(@aria-controls,'oj-listbox-results-Payee76 oj-listbox-live-Payee76')]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='oj-listbox-result-label-19']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='specific-amount|input']")).sendKeys("1000");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@id='specific-amount|input']")).sendKeys("1000");
			driver.findElement(By.xpath("//input[@id='Note89|input']")).sendKeys("payment");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='oj-radiocheckbox-icon oj-component-icon'])[5]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text() = 'Pay']")).click();
			// driver.findElement(By.xpath("(//span[@slot='startIcon'])[1]")).click();
			// driver.findElement(By.xpath("(//span[@slot='startIcon'])[1]")).click();
			// Thread.sleep(2000);
			// driver.findElement(By.xpath("//span[text() = 'Confirm']")).click();
			// driver.findElement(By.xpath("//span[@id='profileLauncher']")).click();
			// Thread.sleep(2000);
			// driver.findElement(By.xpath("//span[@data-bind='text :
			// resourceBundle.topProfile.labels.logout']")).click();
		} finally {
			driver.close();
		}

	}

}
