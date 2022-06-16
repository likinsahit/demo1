package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxcheck {
    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(2000);
        WebElement find = driver.findElement(By.xpath("//a[text()='Input Forms']"));
                          find.click();

        Thread.sleep(2000);
        WebElement find1 = driver.findElement(By.xpath("//a[text()='Input Forms']/ancestor::li[2]/descendant::li[3]/a[text()='Checkbox Demo']"));
                           find1.click();
        Thread.sleep(2000);
        WebElement find2 = driver.findElement(By.xpath("//input[@value='Check All']"));
        find2.click();

        String str = driver.findElement(By.xpath("//input[@id='isChkd']")).getAttribute("value");
        System.out.println("After clicking does all check box are selected: " +str);

        Thread.sleep(2000);


        WebElement find3 = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        find3.click();

        String str1 = driver.findElement(By.xpath("//input[@id='isChkd']")).getAttribute("value");
        System.out.println("After unselecting does all check box are selected:" +str1);

        if(str!=str1){
            System.out.println("Test case is passed no bugs");
        }else{
            System.out.println("Test case is failed there is a bugs");
        }


        driver.quit();


    }
}
