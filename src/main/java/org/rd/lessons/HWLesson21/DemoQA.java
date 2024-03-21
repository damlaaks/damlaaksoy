package org.rd.lessons.HWLesson21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

    public static void demoQa() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).

                click();
        driver.findElement(By.id("firstName")).

                sendKeys("qwe");
        driver.findElement(By.id("lastName")).

                sendKeys("qwe1");
        driver.findElement(By.id("userEmail")).

                sendKeys("qwe2@qwe.com");
        driver.findElement(By.id("age")).

                sendKeys("12");
        driver.findElement(By.id("salary")).

                sendKeys("1000");
        driver.findElement(By.id("department")).

                sendKeys("qwe5");
        driver.findElement(By.id("submit")).

                click();

        driver.get("https://demoqa.com/elements");
        driver.findElement(By.id("item-4")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).click();
    }
}