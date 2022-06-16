package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InputFormDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        driver.findElement(By.xpath("//a[@title='Close']")).click();

//InputForm DorpDOwn

        WebElement element = driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul[1]/li[1]/a[@class='dropdown-toggle']"));
        element.click();
        Thread.sleep(2000);

        List<WebElement> list = driver.findElements(By.xpath("//div[@id='navbar-brand-centered']/ul[1]/li[1]/descendant::li"));

        String str ="Select Dropdown List";

        for (WebElement webElement : list) {

            if (webElement.getText().trim().equals(str)) {
                System.out.println(webElement.getText());
                webElement.click();
                break;
            }

        }
        Thread.sleep(4000);
        driver.quit();
    }
}
