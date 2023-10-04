package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test6 {
	
	WebDriver driver;
	
	@Test
	public void testcase1() {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		//driver.findElement(By.id("contact-us")).click();
		WebElement contactUsLink= driver.findElement(By.id("contact-us"));
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].click()",contactUsLink );
		driver.close();	
		
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollelement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].scrollIntoView(true)",scrollelement );
		Thread.sleep(5000);
		driver.close();
		
		// setup new attribute for element
		//<h1 id ="hello">Hello</h1>
	
	}
	@Test
	public void testcase3() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollelement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('data-cy','two')", scrollelement);
		// je.executeScript("arguments[0].removeAttribute('data-cy')", scrollelement);
		String attributevalue = scrollelement.getAttribute("data-cy"); // two
		System.out.println(attributevalue);
		
	}
	@Test
	public void testcase4() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollelement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String title = (String)je.executeScript("return document.title;");
		// first parameter of javascriptexecutor is script
		Assert.assertEquals(title, "WebDriverUniversity.com");
		driver.close();
	
	}
	@Test
	public void testcase5() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	 WebElement e =  driver.findElement(By.id("double-click"));
	   ac.doubleClick(e).build().perform();
	  String className = e.getAttribute("class");
	  Assert.assertEquals(className, "div-double-click double");
	  driver.close();
	
	}
	/*@Test
	public void testcase6() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	   WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
	
	}*/
	
	
	

}
