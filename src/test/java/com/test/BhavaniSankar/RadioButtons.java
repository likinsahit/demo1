package com.test.BhavaniSankar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nsbsa\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        Thread.sleep(3000);


        //h4[text()='Sex : ']/parent::div/descendant::label[1]/input
//h4[text()='Sex : ']/parent::div/descendant::label[2]/input
        //input[@value='0 - 5']
        //input[@value='5 - 15']
        //input[@value='15 - 50']
        //button[text()='Get values']
        //p[text()='Sex : Female']
        //p[@class='groupradiobutton']


        WebElement element= driver.findElement(By.xpath("//h4[text()='Sex : ']/parent::div/descendant::label[2]/input"));
       element.click();
        Thread.sleep(2000);
       boolean genderbutton = element.isSelected();

        WebElement element1= driver.findElement(By.xpath("//input[@value='0 - 5']"));
        element1.click();
        Thread.sleep(2000);
        boolean agebutton = element1.isSelected();

        WebElement element2 =driver.findElement(By.xpath("  //button[text()='Get values']"));
                element2.click();

        String str1 = "Sex : %s";
        String type1 = "Female";
        String line1 = String.format(str1, type1);

        String mainstr1 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        String str2 = "Age group: %s";
        String type2 = "0 - 5";
        String line2 = String.format(str2, type2);

        String mainstr2 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        System.out.println(line1);
        System.out.println(line2);



        if(mainstr1.contains(line1) && genderbutton && mainstr2.contains(line2) && agebutton ){

            System.out.println("test case is passed");
        }else{
            System.out.println("test case is failed");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}