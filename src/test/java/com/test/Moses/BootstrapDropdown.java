package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.anhtester.com/index.htm");

        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();

       List<WebElement> list = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[1]/descendant::a"));

       for(int i =0;i< list.size();i++){
           if(list.get(i).getText().equals("Input Form Submit")){
               list.get(i).click();
             break;
           }
       }

    }
}
