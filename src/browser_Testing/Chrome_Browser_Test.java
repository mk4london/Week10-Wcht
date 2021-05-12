package browser_Testing;

/* i am testing nopcommerce website on google chrome browser and will perform following automation steps.
 * 1 open the browser
 * 2 open the https://www.nopcommerce.com/demo url
 * 3 maximise the window
 * 4 implicitly wait 10 second
 * 5 get the tittle name
 * 6 verify the tittle name
 * 6 verify the tittle  contains "Register"
 * 7  get the tittle length
 * 8 close the browser
 *

 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome_Browser_Test {

    public static void main(String[] args) {
        String baseurl ="https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(baseurl);
        String tittle = driver.getTitle();
        System.out.println(tittle);
        System.out.println(tittle.equals("Watford Community Housing homepage | Watford Community Housing"));
        System.out.println(tittle.length());
        System.out.println(tittle.contains("Register"));
        driver.close();







    }
}

