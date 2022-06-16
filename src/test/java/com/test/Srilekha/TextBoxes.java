package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(2000);

        //Hnadle Text Boxes
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Input Fields");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

        Thread.sleep(2000);
        String str = driver.findElement(By.xpath("//span[@id='display']")).getText();

        System.out.println("Your Message:" +str);

        if(str.equals("Input Fields")){

            System.out.println("Test Case is Passed");

        }else{

            System.out.println("Test Case is Failed");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
