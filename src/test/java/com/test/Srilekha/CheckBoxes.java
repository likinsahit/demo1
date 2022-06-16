package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

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



        String id =  driver.findElement(By.xpath("//div[@id='txtAge']")).getAttribute("id");
        Thread.sleep(2000);
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//input[@id='isAgeSelected']")).clear();
        //Thread.sleep(2000);
        //Boolean isEnabled = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isEnabled();


        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        Thread.sleep(2000);

        boolean isSelected = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();

        System.out.println("isSelected.." +isSelected);

        String text =  driver.findElement(By.xpath("//div[@id='txtAge']")).getText();
        System.out.println("Get Text.." +text);
        Thread.sleep(2000);

        //String text2="Success - Check box is checked";
        //System.out.println("check strig equal or not!.." + (text.equals(text2)));

        if(text.equals("Success - Check box is checked") && isSelected){
            System.out.println("Test case Passes!...");
        }else{
            System.out.println("Test Case is Failed!...");
        }

        Thread.sleep(3000);
        System.out.println("Get Id" +id);

        driver.quit();

    }
}
