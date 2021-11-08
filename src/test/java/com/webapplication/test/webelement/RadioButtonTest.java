package com.webapplication.test.webelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class RadioButtonTest {
	String siteUrl = "file:D:\\java_workspace\\phase5-selenium-junit5-test-part2\\static\\web-elements.html";
	String driverPath = "drivers//windows//chromedriver.exe";
	WebDriver driver;

	@BeforeEach
	void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
	}

	@AfterEach
	void tearDown() {
		 driver.close();
	}
	
	@Test
	@DisplayName("Radio button One exist test")
	public void testToVerifyRadioButtonExist() {
		WebElement radioButton = driver.findElement(By.id("male"));
		assertEquals(true, radioButton.isDisplayed());
		assertEquals(true, radioButton.isEnabled());
		assertEquals(false, radioButton.isSelected());
	}
	
	@Test
	@DisplayName("Radio button Two exist test")
	public void testToVerifyRadioButton2Exist() {
		WebElement radioButton = driver.findElement(By.id("female"));
		assertEquals(true, radioButton.isDisplayed());
		assertEquals(true, radioButton.isEnabled());
		assertEquals(false, radioButton.isSelected());
	}
	
	
	@Test
	@DisplayName("Seleted Radio button One exist test")
	public void testToSelectRadioButton1() throws InterruptedException {
		WebElement radioButton = driver.findElement(By.id("male"));
		assertEquals(true, radioButton.isDisplayed());
		assertEquals(true, radioButton.isEnabled());
		assertEquals(false, radioButton.isSelected());
		//select radio :: click on radio
		radioButton.click();
		assertEquals(true, radioButton.isSelected());
		Thread.sleep(3000);
	}
	
	@Test
	@DisplayName("Seleted Radio button Two exist test")
	public void testToSelectRadioButton2() throws InterruptedException {
		WebElement radioButton = driver.findElement(By.id("female"));
		assertEquals(true, radioButton.isDisplayed());
		assertEquals(true, radioButton.isEnabled());
		assertEquals(false, radioButton.isSelected());
		//select radio :: click on radio
		radioButton.click();
		assertEquals(true, radioButton.isSelected());
		Thread.sleep(3000);
	}

}
