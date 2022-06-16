package com.test.Likin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmit {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/input-form-demo.html");
        Thread.sleep(2000);
        String fname="first name";
        String lname="Last name";
        String email="kkkk@gmail.com";
        String phone="9494200444";
        String address="Amalapuram";
        String city="hyderabad";
        String zip="76888";
        String website="www.fp.com";
        String comment="No comments";
        driver.findElement(By.xpath(" //input[@name='first_name']")).sendKeys(fname);
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lname);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys(address);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
        Thread.sleep(2000);

        WebElement state= driver.findElement(By.xpath("//select[@name='state']"));
        Select country=new Select(state);
        country.selectByVisibleText("New Mexico");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(zip);
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys(website);
        driver.findElement(By.xpath("//input[@value='yes']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(comment);
        driver.findElement(By.xpath("//div[@class='col-md-4']/descendant::button")).click();
        driver.quit();
    }
}
