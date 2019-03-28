package com.selenium.practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Homepage {
	
	static ExtentReports report;
	static ExtentTest Logger;
	

	public static void main(String[] args) throws InterruptedException {
		
		report =new ExtentReports("/test-output.hompage.html");
		Logger=report.startTest("Homepage");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\suganthi\\eclipse-workspace\\practiceproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Logger.log(LogStatus.INFO,"Chrome Launched");

		driver.get("http://selenium-prd.firebaseapp.com");
		driver.manage().window().maximize();
		System.out.println("Application Launched");
		Logger.log(LogStatus.INFO,"Application Launched");

		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email_field']"));
		username.clear();
		username.sendKeys("admin123@gmail.com");
		System.out.println("Username Entered");
		Logger.log(LogStatus.PASS,"Username Entered");
		WebElement password = driver.findElement(By.xpath("//input[@id='password_field']"));
		password.clear();
		password.sendKeys("admin123");
		System.out.println("password Entered");
		Logger.log(LogStatus.PASS,"password Entered");

		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@onclick='login()']"));
		LoginButton.click();
		System.out.println("Login button clicked");

		Thread.sleep(3000);
		WebElement HomeTab = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		HomeTab.click();	
		System.out.println("Hometab is clicked");

		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.clear();
		Name.sendKeys("Suganthi");
		System.out.println("Name field entered");
		
		WebElement FatherName = driver.findElement(By.xpath("//input[@id='lname']"));
		FatherName.clear();
		FatherName.sendKeys("Ponnambalam");
		System.out.println("FatherName field Entered");
		
		WebElement PostalAddress = driver.findElement(By.xpath("//input[@id='postaladdress']"));
		PostalAddress.clear();
		PostalAddress.sendKeys("California");
		System.out.println("PostalAddress field Entered");
		
		WebElement PersonelAddress = driver.findElement(By.xpath("//input[@id='personaladdress']"));
		PersonelAddress.clear();
		PersonelAddress.sendKeys("BayArea");
		System.out.println("PersonalAddress field Entered");
		
		WebElement Gender= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[5]/span[2]/input[1]"));
		Gender.click();
		System.out.println("Gender field is selected");
		
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByIndex(1);
		System.out.println("city field is selected");
		
		Select Course = new Select(driver.findElement(By.xpath("//select[@id='course']")));
		city.selectByValue("mba");
		System.out.println("course field is selected");

		Select District = new Select(driver.findElement(By.xpath("//select[@id='district']")));
		city.selectByVisibleText("GOA");
		System.out.println("District field is selected");

		Select State = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		city.selectByVisibleText("PATNA");
		System.out.println("State field is selected");
		
		WebElement Pincode = driver.findElement(By.xpath("//input[@placeholder='pincode ..']"));
		Pincode.clear();
		Pincode.sendKeys("900089");
		System.out.println("Pincode field Entered");

		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='pincode ..']"));
		Email.clear();
		Email.sendKeys("admin123@gmail.com");
		System.out.println("Email field Entered");
		
		WebElement Submit =driver.findElement(By.xpath("//button[@class='bootbutton']"));
		Submit.click();
		System.out.println("Hometab is clicked");
		
		/*WebElement SwitchTo = driver.findElement(By.xpath(""));
		SwitchTo.click();
		
		WebElement Alert =driver.findElement(By.xpath(""));
		Alert.click();
		
		//Click on Window Alert
		
		WebElement WindowAlert =driver.findElement(By.xpath(""));
		WindowAlert.click();
		
		//Switch to Alert and Print the text from the Alert
		org.openqa.selenium.Alert windowAlert =driver.switchTo().alert();
		String AlertText = windowAlert.getText();
		System.out.println("Alert Text : "+AlertText);
		Thread.sleep(5000);
		windowAlert.accept();
		
		//Switch to prompt Alert and dismiss the text from the alert
		WebElement promptAlert =driver.findElement(By.xpath(""));
		promptAlert.click();
		Thread.sleep(4000);
		org.openqa.selenium.Alert promptalert= driver.switchTo().alert();
		Thread.sleep(4000);
		promptalert.accept();
		
*/
report.endTest(Logger);
report.flush();
System.out.println("END");
			}

}
