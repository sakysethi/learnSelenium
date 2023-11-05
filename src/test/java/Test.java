import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        System.out.println("Browser Launch Successfull");

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}
