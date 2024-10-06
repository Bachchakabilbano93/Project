package com.prac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightReservation {

	public static void main(String[] args) throws InterruptedException {

		String URL = "https://www.tripodeal.com/";

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(URL);

		Thread.sleep(2000);

		driver.findElement(By.id("returnDateRequiredYes")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("returnDateRequiredNo")).click();

		Thread.sleep(2000);

		//		driver.findElement(By.xpath("(//i[contains(@class,'zmdi-close-circle')])[1]")).click(); // Obsolete step now

		driver.findElement(By.id("origin")).click();

		driver.findElement(By.id("origin")).sendKeys("Pune");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='eac-container-origin']//li//div[contains(text(),'Pune')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("destination")).click();

		driver.findElement(By.id("destination")).sendKeys("Delhi");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='eac-container-destination']//li//div[contains(text(),'Delhi')]")).click();

		Thread.sleep(2000);

		//		driver.findElement(By.id("dateNew")).click();

		driver.findElement(By.name("trip_start_date")).click();

		Thread.sleep(1000);

		//		driver.findElement(By.xpath("//*[aria-label='30/09/2024']")).click();

		driver.findElement(By.xpath("//*[@class='picker__nav--next']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@aria-label='06/10/2024']")).click();

		Thread.sleep(2000);

		//				driver.findElement(By.xpath("//div[@aria-label='30/09/2024'][1]")).click();

		//		Thread.sleep(2000);

		//		driver.findElement(By.xpath("//input[@id='traveller']")).click();

		driver.findElement(By.xpath("//*[@class='zmdi zmdi-chevron-down zmdi-hc-2x arrowDwn']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//i[contains(@class,'zmdi-plus-circle')])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//i[contains(@class,'zmdi-plus-circle')])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Done']")).click();

		Thread.sleep(2000);

		driver.close();

		System.out.println("Done");

	}

}
