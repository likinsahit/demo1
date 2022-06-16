package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickermulti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.anhtester.com/bootstrap-date-picker-demo.html");

        String reqmonth = "June 2021";
        String reqmonth1 = "June 2022";

        String xpath ="//div[@class='datepicker-days']/descendant::td[text()='%s']";


        String date = "14";

        String date1 = "19";

        WebElement element = driver.findElement(By.xpath("//div[@id='sandbox-container2']/child::div/input[@placeholder='Start date']"));
                             element.click();



        while (true){
            String actualmonth = driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/descendant::th[@class='datepicker-switch']")).getText();

            if(actualmonth.equals(reqmonth)){

                break;

            }else{
                driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/descendant::th[@class='prev']")).click();
            }
        }



        String dateElement = String.format(xpath,date);

        driver.findElement(By.xpath(dateElement)).click();

        WebElement element2 = driver.findElement(By.xpath("//div[@id='sandbox-container2']/child::div/input[@placeholder='End date']"));
                              element2.click();


           while (true){

               String ss = driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/descendant::th[@class='datepicker-switch']")).getText();
               if(ss.equals(reqmonth1)){
                   break;
               }else{
            WebElement element3 = driver.findElement(By.xpath("//div[@class='datepicker-days']/child::table/descendant::th[@class='next']"));
                                  element3.click();


               }
           }


        String ff = String.format(xpath,date1);

        WebElement fin = driver.findElement(By.xpath(ff));
        fin.click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[text()='To']")).click();

        Thread.sleep(2000);

        driver.quit();













        //
        //

    }
}
