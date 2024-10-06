package com.prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Wait {

	public static void main(String[] args) {

		String URL = "https://www.amazon.in/";

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		//		Implicit wait
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("twotabsearchtextbox")).click();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");

		driver.findElement(By.id("nav-search-submit-button")).click();

		//		Explicit wait

		WebDriverWait wait = new WebDriverWait(driver, 5);

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("twotabsearchtextbox1")));
		} catch (TimeoutException e) {
			System.out.println(e.getMessage());
		}

		//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsearchtextbox1")))); // no such element error as driver.findElement method is used

		//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");

	}

}
