package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(1000);
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//h4[text()='Sex : ']/parent::div/descendant::label[1]/input"));
                             element.click();
        Thread.sleep(1000);
        boolean   isSelected= element.isSelected();


        WebElement element1 = driver.findElement(By.xpath("//input[@value='15 - 50']"));
        element1.click();
        Thread.sleep(1000);
        boolean   isSelected1= element1.isSelected();

        WebElement element2 = driver.findElement(By.xpath("//button[text()='Get values']"));
        element2.click();

        String str = "Sex : %s";
        String type = "Male";
        String finalstr = String.format(str, type) ;
        System.out.println(finalstr);
        String actualstr = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        String str1 = "Age group: %s";
        String type1 = "15 - 50";
        String finalstr1 = String.format(str1, type1) ;
        System.out.println(finalstr1);
        String actualstr1 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        if(actualstr.contains(finalstr) && isSelected && isSelected1 && actualstr1.contains(finalstr1)  ){

            System.out.println("Test Case is Passed...!!!");
        }else{

            System.out.println("Test Case is Failed...!!!");
        }
        Thread.sleep(5000);
        driver.quit();



    }
}
