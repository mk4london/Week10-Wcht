package browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IE_Browser_Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wcht.org.uk/");
        System.out.println(driver.getTitle());
        System.out.println(driver.equals("Watford Community Housing homepage | Watford Community Housing"));
        driver.close();
    }
}

