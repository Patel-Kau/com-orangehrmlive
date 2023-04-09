package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class MultiBrowser {
    static String browser = "Firefox";

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static WebDriver driver;

    public static void main(String[] args) {


        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }


        driver.get(baseUrl);        //Open URL into Browser
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
