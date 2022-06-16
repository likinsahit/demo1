package com.test.Jyothi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Seleniummvn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//p[text()='Click on button to get the selected values from Group Sex and Age group']/following-sibling::div[1]/descendant::input"));
        element.click();
        Thread.sleep(2000);
        boolean select = element.isSelected();

        WebElement element1 = driver.findElement(By.xpath("//p[text()='Click on button to get the selected values from Group Sex and Age group']/following-sibling::div[2]/descendant::input[2]"));
        element1.click();
        Thread.sleep(2000);
        boolean select1 = element1.isSelected();

        driver.findElement(By.xpath("//button[text()='Get values']")).click();

        String str = "sex: %s";
        String type = "'Male'";
        String ind1 = String.format(str, type);
        String str1 = "Age group: %s";
        String type1 = "'5-15'";
        String ind2 = String.format(str1, type1);
        Thread.sleep(2000);

        String actualstr = driver.findElement(By.xpath("//p[text()='Sex : Male']\n")).getText();
        String actualstr1 = driver.findElement(By.xpath("//p[text()=' Age group: 5 - 15']")).getText();
        Thread.sleep(2000);

        if (actualstr.equals(ind1) && actualstr1.equals(ind2)) {

            System.out.println("Test case is passed");
        } else {
            System.out.println("test case failed");

            Thread.sleep(3000);
            driver.quit();
        }

    }
}
