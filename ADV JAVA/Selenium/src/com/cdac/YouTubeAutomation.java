package com.cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomation {

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "D:\\DAC\\CDAC\\ADV JAVA\\Selenium\\drivers");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open YouTube
        driver.get("https://youtube.com");
        Thread.sleep(2000);

        // Maximize window
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Locate the search box using XPath and input search text
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search_query']"));
        searchBox.sendKeys("Selenium Tutorials");

        // Locate the search button using XPath and click it
        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchButton.click();
        Thread.sleep(5000);

        // Locate and click a sidebar element (example)
        WebElement sidebarItem = driver.findElement(By.xpath("//a[@title='Trending']"));
        sidebarItem.click();
        Thread.sleep(3000);

        // Close browser
        driver.close();
    }
}
