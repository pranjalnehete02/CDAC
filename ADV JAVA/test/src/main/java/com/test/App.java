package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.get("https://youtube.com");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(5000);
		//d.close();
		Thread.sleep(1780);
		
		WebElement we= d.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/tp-yt-paper-item/yt-formatted-string"));
			
		we.click();
		
		WebElement search = d.findElement(By.name("search_query"));
		search.sendKeys("Selenium Tutorials");
		
		Thread.sleep(2000);
		
		WebElement btn = d.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/button/yt-icon/span/div"));
		btn.click();
		
		Thread.sleep(17000);
		
		WebElement ee=d.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[2]/a/tp-yt-paper-item"));
		Thread.sleep(1000);
		ee.click();
		d.close();
		//WebElement de=d.findElement(By.id("extensionsTabSecondary"));
//		Thread.sleep(2000);
//		de.click();
//		
//		d.manage().window().maximize();
//		Thread.sleep(5000);
	d.close();
//		
	}

}
