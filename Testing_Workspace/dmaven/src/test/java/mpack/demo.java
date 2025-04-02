package mpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();   //Ctr+shift+o
		driver.get("https://tutorialsninja.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("https://tutorialsninja.com/demo")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("naveen121@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Naveen@7");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Account']")).isDisplayed());
		driver.findElement(By.name("search")).sendKeys("mac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("MacBook Pro")).click();
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		WebElement SuccessStatus = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
		System.out.println(SuccessStatus.getText());
		System.out.println(SuccessStatus.isDisplayed());
		driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button-payment-address")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-shipping-address")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-shipping- method")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-payment-method")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-confirm")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/h1[text()='Your order has been placed']")).getText());
		
	}

}
