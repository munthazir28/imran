package org.lft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsFlyTogather {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\Lft\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createAcc = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		createAcc.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("syed");
		WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
		surName.sendKeys("rizzu");
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'reg_email_')]"));
		email.sendKeys("825115987");
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("807698757656745");
		WebElement birthday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		birthday.sendKeys("28");
		WebElement birthmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		birthmonth.sendKeys("Nov");
		WebElement birthyear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		birthyear.sendKeys("2000");
		WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		gender.click();
		WebElement submit=gender.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
		
		

	}
}
