package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAddition {

    public static void main(String[] args) throws InterruptedException {
        int a= 56;
        int b= 67;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@id='sum1']"));
                             element.sendKeys(""+a);
                             element.getText();


        Thread.sleep(1000);
        WebElement element1 = driver.findElement(By.xpath("//input[@id='sum2']"));
                              element1.sendKeys(""+67);
                              element1.getText();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        Thread.sleep(1000);

        String str = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        System.out.println(str);
        int str2 = Integer.valueOf(str);

        int sum = a+b;


        if(str2==sum){
            System.out.println("Addition programme runs successful");

        }else{
            System.out.println("Addition programme is failure");
        }
        driver.quit();



    }


}
