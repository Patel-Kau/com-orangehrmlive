package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrmLiveCom {

    public static void main(String[] args) {
        String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        WebDriver driver = new ChromeDriver();      //Object creation for the Chrome driver
        driver.get(baseURL);        //Open URL into Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      // we give Implicit wait
        driver.manage().window().maximize();        //Maximise the Browser
        System.out.println( driver.getTitle());     // Print the Title
        System.out.println(driver.getCurrentUrl()); // Print the Current URL of the web page
        System.out.println(driver.getPageSource()); // Print the Page source
        driver.findElement(By.name("username")).sendKeys("Kaushik");    // Enter the Username in the username field.
        driver.findElement(By.name("password")).sendKeys("123456");     // Enter the password in the password field.
        driver.close();     // Closing the browser

    }
}
