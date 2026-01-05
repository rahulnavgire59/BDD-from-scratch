import org.openqa.selenium.WebDriver;

public class HelloTest {
        WebDriver driver;

        HelloTest(WebDriver driver){
        this.driver = driver;
        }

        public void starturl(){
            driver.navigate().to("https://the-internet.herokuapp.com/");
        }



}
