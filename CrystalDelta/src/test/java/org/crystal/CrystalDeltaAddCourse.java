package org.crystal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrystalDeltaAddCourse {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ppodl-staging.col.crystaldelta.net/admin/login");
		driver.findElementByName("email").sendKeys("ravikutty93@gmail.com",Keys.TAB,"Password@123",Keys.ENTER);
		WebElement ele = driver.findElementByXPath("//button[text()='Login']");
		ele.click();
		WebElement addcourse = driver.findElementByXPath("//button[text()='Add Course']");
		addcourse.click();
		WebElement title = driver.findElementByName("title");
		title.sendKeys("BSC Physics");	
		WebElement ea = driver.findElementByXPath("//input[@id='react-select-2-input']");
	    ea.sendKeys("physical education teaching",Keys.ENTER);
	    driver.findElementByName("code").sendKeys("BSC1124",Keys.TAB,"http://oasis.col.org/handle/11599/437");
	    WebElement path = driver.findElementByXPath("//input[@name='is_default_image']");
		JavascriptExecutor exe =(JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();", path);
		driver.findElementByXPath("//textarea[@name='short_description']").sendKeys("xxxx");
		driver.findElementByXPath("//textarea[@name='long_description']").sendKeys("qwdth gfdc");
		driver.findElementByXPath("//input[@id='react-select-5-input']").sendKeys("online",Keys.ENTER);
		driver.findElementByXPath("//input[@id='react-select-6-input']").sendKeys("ALL",Keys.ENTER);
		driver.findElementByXPath("//input[@id='react-select-7-input']").sendKeys("Face to Face",Keys.ENTER);
		driver.findElementByXPath("//input[@name='start_date']").sendKeys("7/1/2022",Keys.ENTER);
		driver.findElementByXPath("//input[@name='end_date']").sendKeys("12/12/2022",Keys.ENTER);
		driver.findElementByXPath("//input[@placeholder='Duration']").sendKeys("12");
		driver.findElementByXPath("//input[@id='react-select-8-input']").sendKeys("months",Keys.ENTER);
		driver.findElementByXPath("//input[@name='weekly_workload']").sendKeys("8",Keys.ENTER);
		driver.findElementByXPath("//input[@id='react-select-9-input']").sendKeys("all",Keys.ENTER);
		driver.findElementByXPath("//input[@id='react-select-10-input']").sendKeys("free",Keys.ENTER);
		driver.findElementByXPath("//input[@id='react-select-11-input']").sendKeys("no",Keys.ENTER);
		driver.findElementByXPath("//input[@id='react-select-12-input']").sendKeys("java",Keys.ENTER);
		driver.findElementByXPath("//input[@placeholder='Instructor Name']").sendKeys("Thinus Stanley");
		driver.findElementByXPath("//input[@placeholder='example@org.com']").sendKeys("stanleyon91@gmil.com");
		WebElement addbut = driver.findElementByXPath("//button[text()='Add Course']");
		exe.executeScript("arguments[0].click();", addbut);
		driver.quit();
		
		}
}


