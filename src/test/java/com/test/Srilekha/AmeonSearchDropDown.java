package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmeonSearchDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple");

        Thread.sleep(1000);

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/descendant::div[@role='button']"));
        Thread.sleep(1000);
        System.out.println("The size of list" + list.size());

        String str = "apple airtag";
        for (int i = 1; i < list.size(); i++) {

            if ((list.get(i).getText().equals(str))) {

                System.out.println("The string is: "+list.get(i).getText());
                list.get(i).click();
                break;
            }

            Thread.sleep(2000);
            driver.quit();


        }
    }
}

