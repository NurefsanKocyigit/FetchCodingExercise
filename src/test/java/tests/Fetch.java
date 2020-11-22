package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Fetch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1. Open website
        driver.get("http://ec2-54-208-152-154.compute-1.amazonaws.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement left_0 = driver.findElement(By.id("left_0"));
        left_0.click();
        left_0.sendKeys("0");
        Thread.sleep(1000);
        WebElement right_0 = driver.findElement(By.id("right_0"));
        right_0.click();

        int number;
        for (int i = 1; i <= 8; i++) {
            number = i;
            right_0.sendKeys("" + number);
            WebElement weigh = driver.findElement(By.id("weigh"));
            weigh.click();
            right_0.clear();
        }

        List<WebElement> result1 = (driver.findElements(By.xpath("//div[@class='game-info']//ol/li")));
        System.out.println(result1.size());

        String result = "";
        for (WebElement each : result1) {
            System.out.println(each.getText());
            if (each.getText().contains("<") || each.getText().contains(">")) {
                result += each.getText();
            }
        }
        if (result.contains("<")) {
            System.out.println("Fake gold bar is: 0");
        } else {
            System.out.println("Fake gold bar is: " + result.substring(7, 8));
        }

        List<WebElement> numbers = driver.findElements(By.xpath("//div[@class='coins']//button"));
        String numbercoin="";
        for(WebElement coin:numbers) {
            if (coin.getText().contains(result.substring(7, 8))) {
                coin.click();
                Alert alert=driver.switchTo().alert();
        String expectedmessage="Yay! You find it!";
        if(expectedmessage.equalsIgnoreCase(alert.getText())){
            System.out.println(alert.getText());
        }
        alert.accept();

        }}}}

