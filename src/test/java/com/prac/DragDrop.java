package com.prac;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		String URL = "https://jqueryui.com/droppable/";

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(URL);

		System.out.println(driver.getTitle());

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		//		source

		WebElement src = driver.findElement(By.id("draggable"));

		//		target

		WebElement tgt = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);

		actions.dragAndDrop(src, tgt).perform();

		//		actions.clickAndHold(src).moveToElement(tgt).release().perform();

		String pWH = driver.getWindowHandle();
		System.out.println("Parent WH");
		System.out.println(pWH);

		driver.switchTo().parentFrame();

		WebElement elDraggable = driver.findElement(By.linkText("Draggable"));

		//		actions.moveToElement(elDraggable).sendKeys(Keys.SHIFT).click().perform();

		//		actions.clickAndHold(elDraggable).sendKeys(Keys.SHIFT).click().perform();

		//		actions.moveToElement(elDraggable).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).perform();

		actions.moveToElement(elDraggable).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();

		Set<String> WHS = driver.getWindowHandles();
		System.out.println("All WH");
		for (String cWH : WHS) {
			//			System.out.println(cWH);
			if (!cWH.equals(pWH)) {
				driver.switchTo().window(cWH);
				break;
			}
		}

		//		Object[] winAr = WHS.toArray(); 

		System.out.println(driver.getTitle());

		driver.close();

		//		driver.switchTo().window(winAr[1].toString());

		driver.switchTo().window(pWH);

		System.out.println(driver.getTitle());

		//		driver.close();

		System.out.println("Done");

	}

}
