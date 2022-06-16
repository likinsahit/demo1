package com.test.Likin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableRead1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/table-pagination-demo.html");
        Thread.sleep(2000);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        int rowcount = rows.size();
        List<WebElement> collist = driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));
        int colcount = collist.size();
        WebElement next = driver.findElement(By.xpath("//a[@class='next_link']"));

        for (int i = 1; i <= rowcount; i++) {
            if (i == 6 || i == 11) {
                next.click();
            }
            for (int j = 1; j <= colcount; j++) {
                String data = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(data + "     ");
            }
            System.out.println("");
        }
    }
}