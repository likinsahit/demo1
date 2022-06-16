package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxeExamples {
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
        driver.findElement(By.xpath("//ul[@id='treemenu']/child::li/descendant::a[4]")).click();

        Thread.sleep(2000);

    //CheckAll options
    List<WebElement> list =  driver.findElements(By.xpath("//p[text()='Check the below points before automating']/following-sibling::div/descendant::input"));
        for (WebElement webElement : list) {

            webElement.click();

        }



    String str = driver.findElement(By.xpath("//input[@id='check1']")).getAttribute("value");
    System.out.println(str);

    String str1 ="Uncheck All";
    if(str.equals(str1)){
        System.out.println("Test Cse is Passes....!");
    }else{
        System.out.println("Test Case is Failed....!");
    }

    Thread.sleep(3000);

    //UncheckAll options

        List<WebElement> list1 =  driver.findElements(By.xpath("//p[text()='Check the below points before automating']/following-sibling::div/descendant::input"));
        for (WebElement webElement : list1) {

            webElement.click();

        }



        String str2 = driver.findElement(By.xpath("//input[@id='check1']")).getAttribute("value");
        System.out.println(str2);

        String str2heck ="Check All";
        if(str2.equals(str2heck)){
            System.out.println("Test Cse is Passes....!");
        }else{
            System.out.println("Test Case is Failed....!");
        }


        driver.quit();

    }
    }

