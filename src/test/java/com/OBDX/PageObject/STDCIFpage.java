package com.OBDX.PageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class STDCIFpage {
	WebDriver driver;
	
	public void login() throws InterruptedException, MalformedURLException  {
		URL url = new URL("http://localhost:4444");
		//URL url =new URL ("http://192.168.1.2:5555");
		DesiredCapabilities capp = new DesiredCapabilities();
		capp.setBrowserName("chrome");
		capp.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(url, capp);
				WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://10.20.9.23:9004/FCJNeoWeb/LoginServlet?entity=ENTITY_ID1");
	 //  driver.get("www.google.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='details-button']")).click();
		driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
		
        WebElement e2 =driver.findElement(By.xpath("//iframe[@id='ifr_AlertWin'][contains(@title,'Information Message')]"));
        driver.switchTo().frame(e2);
        driver.findElement(By.xpath("//body[contains(@onload,'chkErr')]//input[@onclick='closeAlerts(event)']")).click();
        driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='LOGINUSERID']")).sendKeys("VARSHIMAKER");
		driver.findElement(By.xpath("//input[@id='user_pwd']")).sendKeys("Prova@2024$");
		driver.findElement(By.id("fc_sbmit")).click();
		Thread.sleep(2000);
		WebElement Frame = driver.findElement(By.xpath("//iframe[@title='Confirmation Message']"));
		driver.switchTo().frame(Frame);
		driver.findElement(By.xpath("//input[@id='BTN_OK']")).click();
		driver.switchTo().parentFrame();
	}
	public void fast_path() throws InterruptedException, MalformedURLException  {
		WebElement e3 =driver.findElement(By.xpath("//iframe[@title='Information Message']"));
        driver.switchTo().frame(e3);
        driver.findElement(By.xpath("//input[@id='BTN_OK' and@title='Ok']")).click();
		
//		WebElement e3 =driver.findElement(By.xpath("//iframe[@id='ifr_AlertWin'][contains(@title,'Information Message')]"));
//        driver.switchTo().frame(e3);
//        driver.findElement(By.xpath("//body[contains(@onload,'chkErr')]//input[@onclick='closeAlerts(event)']")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("fastpath")).sendKeys("STDCIF");
        driver.findElement(By.id("btnGo")).click();
        Thread.sleep(3000);
        WebElement e4 =driver.findElement(By.xpath("//iframe[starts-with(@id,'ifr_LaunchWin')]"));
        driver.switchTo().frame(e4);
        
	}
	public void All_steps() throws InterruptedException, MalformedURLException  {
      //li[@id='New']
        driver.findElement(By.xpath(" //li[@id='New']")).click();
        driver.findElement(By.xpath("//button[@id='BLK_CUSTOMER__BTN_P']")).click();
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__CCATEG']")).sendKeys("INDIVIDUAL");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__FULLNAME']")).sendKeys("sumanth_sai");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__SNAME']")).sendKeys("sai");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__ADDRLN1']")).sendKeys("Dubai");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__COUNTRY']")).sendKeys("AED");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__NLTY']")).sendKeys("AED");
        driver.findElement(By.xpath("//input[@label_value='Male']/..//div[@class='DIVChkRadSel']")).click();
        driver.findElement(By.xpath("//input[@id='BLK_CUSTPERSONAL__BIRTH_COUNTRY']")).sendKeys("AED");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTPERSONAL__DOBI']")).sendKeys("1999-12-23");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTPERSONAL__LANG']")).sendKeys("ENG");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Additional']")).click();
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__LOC']")).sendKeys("DL");
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__MEDIA']")).sendKeys("MAIL");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='MIS']")).click();
        WebElement e5 =driver.findElement(By.xpath("//iframe[@id='ifrSubScreen']"));
        driver.switchTo().frame(e5);
        driver.findElement(By.xpath("//input[contains(@id,'CUSTOMERMISRC7')]/..//div[@class='DIVChkRadSel']")).click();
        driver.findElement(By.xpath("//input[@id='BLK_CUSTOMERMIS__MISCDRC7']")).sendKeys("INDUSTORY");
        driver.findElement(By.xpath("//input[@id='BTN_OK' and contains(@onclick,'CVS_CUSTOMER')]")).click();
        
      
        
//        driver.findElement(By.partialLinkText("Enter Query")).click();
//        driver.findElement(By.xpath("//li[@id='EnterQuery']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id='BLK_CUSTOMER__CUSTNO']")).sendKeys("000063");
//        
//      driver.findElement(By.xpath("//*[@id='ExecuteQuery']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id='BTN_EXIT_IMG']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.xpath("//div[@id='nav']//ul//li[@class='user']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[contains(text(),'Sign Off')]")).click();
//		Thread.sleep(3000);
//		 WebElement e6 =driver.findElement(By.xpath("//iframe[@id='ifr_AlertWin'][contains(@title,'Confirmation Message')]"));
//		 driver.switchTo().frame(e6);
//		 driver.findElement(By.xpath("//body[contains(@onload,'chkErr')]//input[@onclick='closeAlerts(event)']")).click();
	//	driver.close();		
	}
	public void save() throws InterruptedException, MalformedURLException  {
        driver.switchTo().parentFrame();				
		driver.findElement(By.xpath("//li[@id='Save']")).click();
		
		WebElement e7 =driver.findElement(By.xpath("//iframe[contains(@id,'ifrSubScreen')]"));
        driver.switchTo().frame(e7);
        driver.findElement(By.xpath("//input[@id='BTN_OK' and@title='Ok']")).click();
        
//        driver.switchTo().defaultContent();
//        WebElement e8 =driver.findElement(By.xpath("//iframe[@title='Override Message']"));
//        driver.switchTo().frame(e8);
//        driver.findElement(By.xpath("//input[@id='BTN_ACCEPT']")).click();
//        
//        driver.switchTo().defaultContent();
//        Thread.sleep(2000);
//        WebElement e9 =driver.findElement(By.xpath("//iframe[@title='Information Message']"));
//        driver.switchTo().frame(e9);
//        driver.findElement(By.xpath("//input[@id='BTN_OK' and@title='Ok']")).click();
//      
}

}
