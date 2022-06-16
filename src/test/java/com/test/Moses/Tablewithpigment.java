package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tablewithpigment {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.in/");

        List<WebElement> colslist = driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));
        int colscount = colslist.size();

        List<WebElement> rowlist = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        int rowcount = rowlist.size();

        for(int i=1; i<=rowcount;i++){
            for(int j=1; i<=colscount;i++){

                String str = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+i+"]/td["+j+"]")).getText();
            System.out.print("");
            }

        }
    }
}
