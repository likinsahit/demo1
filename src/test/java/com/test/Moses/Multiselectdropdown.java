package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Multiselectdropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(1000);
        driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
        Thread.sleep(1000);

       WebElement element = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select dropdown = new Select(element);

        dropdown.selectByIndex(4);
        dropdown.selectByValue("Florida");
        dropdown.selectByValue("Ohio");

        Thread.sleep(2000);
        dropdown.deselectAll();

        List<WebElement> list = dropdown.getOptions();

        for(WebElement options:list){
            System.out.println(options.getText());
        }
    }
}
