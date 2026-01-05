package main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {
//    public static WebDriver driver;

private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (driver.get()==null){
            driver.set(new ChromeDriver());
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

        return driver.get();
    }

    public static void tearDownMethod(){
        if (driver!=null) {
            driver.quit();
            driver = null;
        }

    }

}