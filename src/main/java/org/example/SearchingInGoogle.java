package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingInGoogle {

    public static class GoogleSearchTest {
        public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            driver.manage().window().maximize();

            // Test Case 1: Basic Search
            System.out.println("Test Case 1: Basic Search");
            driver.get("https://www.google.com");
            Thread.sleep(5000);

            driver.findElement(By.id("APjFqb")).sendKeys("chefaa");
            Thread.sleep(2000);
            driver.findElement(By.className("gNO89b")).click();
            Thread.sleep(3000);


            // Test Case 2: Non-English Language Search
            System.out.println("Test Case 2: Non-English Language Search");
            driver.get("https://www.google.com");
            // Change the language preference to a non-English language
            driver.findElement(By.id("APjFqb")).sendKeys("サッカーワールドカップ");
            Thread.sleep(2000);
            driver.findElement(By.className("gNO89b")).click();
            Thread.sleep(2000);
            // Add assertions or further actions for the expected result


            // Test Case 3: Numeric Search
            System.out.println("Test Case 3: Numeric Search");
            driver.get("https://www.google.com");
            driver.findElement(By.id("APjFqb")).sendKeys("2024 Olympics");
            Thread.sleep(5000);
            driver.findElement(By.className("gNO89b")).click();
            Thread.sleep(2000);
            // Add assertions or further actions for the expected result


            // Test Case 4: Special Characters Search Results
            System.out.println("Test Case 4: Special Characters Search Results");
            driver.get("https://www.google.com");
            driver.findElement(By.id("APjFqb")).sendKeys("@yahoo");
            Thread.sleep(3000);
            driver.findElement(By.className("gNO89b")).click();
            Thread.sleep(3000);



            // Test Case 5: Public Figuar Search Results
            System.out.println("Test Case 5: Public Figuar Search Results");
            driver.get("https://www.google.com");
            driver.findElement(By.id("APjFqb")).sendKeys("Ahmed Zewail");
            Thread.sleep(3000);
            driver.findElement(By.className("gNO89b")).click();
            Thread.sleep(3000);

            // Close the browser
            driver.quit();
        }
    }}
