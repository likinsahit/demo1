package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClsses {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='treemenu']/child::li/descendant::a[6]")).click();


        WebElement element = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select dropdown = new Select(element);
        //ByIndex
        dropdown.selectByIndex(3);
        String str = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
        System.out.println(str);

        //ByValue
        Thread.sleep(2000);
        dropdown.selectByValue("Friday");
        String str1 = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
        System.out.println(str1);

        //ByVisibleText
        Thread.sleep(2000);
        dropdown.selectByVisibleText("Tuesday");
        String str2 = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
        System.out.println(str2);

        Thread.sleep(2000);
        driver.quit();

    }
}
