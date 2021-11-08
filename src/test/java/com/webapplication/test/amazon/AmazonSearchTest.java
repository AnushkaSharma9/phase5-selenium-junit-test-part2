package com.webapplication.test.amazon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class AmazonSearchTest {
	String siteUrl = "https://www.amazon.in/";
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
	@DisplayName("Amazon Search Test : 'Iphone 12 max pro'")
	void testSearch1() {
		// step 5 : evaluate test
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 12 max pro");
		searchBox.submit();

		String expected = "Amazon.in : Iphone 12 max pro";
		String actual = driver.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Amazon Search Test : 'Iphone 11 max'")
	void testSearch2() {
		// step 5 : evaluate test
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 11 max");
		searchBox.submit();

		String expected = "Amazon.in : Iphone 11 max";
		String actual = driver.getTitle();
		assertEquals(expected, actual);
	}
}
