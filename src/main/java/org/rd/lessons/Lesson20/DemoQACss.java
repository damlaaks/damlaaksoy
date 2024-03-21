package org.rd.lessons.Lesson20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQACss {
    public static void demoQa() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Damla");
        driver.findElement(By.id("lastName")).sendKeys("Aksoy");
        driver.findElement(By.id("userEmail")).sendKeys("damlaalev.da@gmail.com");
        driver.findElement(By.id("age")).sendKeys("29");
        driver.findElement(By.id("salary")).sendKeys("1000");
        driver.findElement(By.id("department")).sendKeys("Test");
        driver.findElement(By.id("submit")).click();

        driver.get("https://demoqa.com/elements");
        driver.findElement(By.id("item-4")).click();
        // Yeni CSS Selector:
        driver.findElement(By.cssSelector("div.row:nth-child(3) > div:nth-child(2) > div:nth-child(3) > button")).click();
    }
}
