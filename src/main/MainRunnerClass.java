package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainRunnerClass {
//  WebDriver driver;
    public static void main(String[] args) {
       WebDriver driver=DriverFactory.getDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//*[text()='A/B Testing']")).click();
    }


}
