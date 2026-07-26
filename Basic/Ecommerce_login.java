package com.ananth.selenium.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://ecommerce-playground.lambdatest.io/");
		WebElement Account_dropdown = d.findElement(By.xpath("//*[@id=\'widget-navbar-217834\']/ul/li[6]/a/div/span"));
		Actions actions = new Actions(d);
		actions.moveToElement(Account_dropdown).perform();
		WebElement Account_register = d.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[2]/a/div/span"));
		Account_register.click();
		WebElement FirstName = d.findElement(By.id("input-firstname"));
		FirstName.sendKeys("Ananth");
		WebElement LastName = d.findElement(By.id("input-lastname"));
		LastName.sendKeys("Tester");
		WebElement email = d.findElement(By.id("input-email"));
		email.sendKeys("AnanthTEster20@gmail.com");
		WebElement Telephone = d.findElement(By.id("input-telephone"));
		Telephone.sendKeys("91+ 123456789");
		WebElement Password = d.findElement(By.id("input-password"));
		Password.sendKeys("admin@123");
		WebElement CF_Password = d.findElement(By.id("input-confirm"));
		CF_Password.sendKeys("admin@123");
		WebElement radio_Btn = d.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/div/label"));
		radio_Btn.click();
		WebElement continue_btn = d.findElement(By.xpath("//input[@class='btn btn-primary']"));
		continue_btn.click();
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='icon-left both nav-link dropdown-toggle'][@data-toggle='dropdown']/div[@class='info']/span[@class='title'][contains(text(),' My account')]")));
		WebElement myaccount = d.findElement(By.xpath("//a[@class='icon-left both nav-link dropdown-toggle'][@data-toggle='dropdown']/div[@class='info']/span[@class='title'][contains(text(),' My account')]"));		
		actions.moveToElement(myaccount).perform();
		WebElement logout = d.findElement(By.xpath("//span[@class='title'][contains(text(),'Logout')]"));
		logout.click();
		WebElement Logout_continue_btn = d.findElement(By.xpath("//a[@class='btn btn-primary']"));
		Logout_continue_btn.click();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li[6]/a/div/span[@class='title'][contains(text(),'My account')]")));
		WebElement my_account = d.findElement(By.xpath("//ul/li[6]/a/div/span[@class='title'][contains(text(),'My account')]"));
		actions.moveToElement(my_account).perform();
		WebElement login = d.findElement(By.xpath("//span[@class='title'][contains(text(),'Login')]"));
		login.click();
		WebElement EmailID = d.findElement(By.id("input-email"));
		EmailID.sendKeys("AnanthTEster18@gmail.com");
		WebElement pass = d.findElement(By.id("input-password"));
		pass.sendKeys("admin@123");
		WebElement login_btn = d.findElement(By.xpath("//input[@class='btn btn-primary']"));
		login_btn.click();

	}

}
