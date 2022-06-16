package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='treemenu']/child::li/descendant::a[6]")).click();

        //multidropdown

       driver.findElement(By.xpath("//select[@id='multi-select']"));
        //WebElement element =
//        Select dropdown = new Select(element);
        List<WebElement> list = driver.findElements(By.xpath("//select[@id='multi-select']/option"));
        String str = "Florida";

        for (WebElement webElement : list) {

            if (webElement.getText().trim().equals(str)) {

                System.out.println(webElement.getText());
                webElement.click();
                break;

            }

        }

        Thread.sleep(3000);
        driver.quit();
    }
}
