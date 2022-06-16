package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBttons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
        driver.findElement(By.xpath("//ul[@id='treemenu']/child::li/descendant::a[5]")).click();


        // Select Gneder
        WebElement element =  driver.findElement(By.xpath("//h4[text()='Sex : ']/following-sibling::label[1]/input"));
                                element.click();
                                Thread.sleep(3000);
        boolean isSelected = element.isSelected();
        Thread.sleep(3000);

        //Select Group
        WebElement element2 = driver.findElement(By.xpath("//h4[text()='Age Group : ']/following-sibling::label[2]/input"));
                                element2.click();
                                Thread.sleep(2000);
        boolean isSelected2 = element2.isSelected() ;

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Get values']")).click();
        Thread.sleep(3000);

        String str = "Sex : %s";
        String type = "Male";
        String finalGenStr = String.format(type,str);
        System.out.println("the final Gender String is:" + finalGenStr);
        String GenActualText = driver.findElement(By.xpath("//p[text()='Sex : Male']\n")).getText();
        System.out.println("Actual text of gender :" +GenActualText);
        Thread.sleep(3000);


        System.out.println("___________________");


        String str1 = "Age group: %s";
        String type1 = "5 - 15";
        String FinalAgeStr = String.format(type1,str1);
        System.out.println("The fina Age group String is: "+ FinalAgeStr);
        String ageActualStr = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        System.out.println("Actual text of Age :" +ageActualStr);

        Thread.sleep(3000);
        if(GenActualText.contains(finalGenStr) && isSelected && ageActualStr.contains(FinalAgeStr)){

                System.out.println("Test Case Passes!...");
            }else{

                System.out.println("Test Case Failed!...");
            }

        Thread.sleep(4000);

        driver.quit();

       }


    }

