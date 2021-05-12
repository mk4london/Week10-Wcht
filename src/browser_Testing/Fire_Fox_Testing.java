package browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/* i am testing nopcommerce website on firefox browser and will perform following automation steps.
 * 1 open the browser
 * 2 open the https://www.wcht.org.uk/ url
 * 3 maximise the window
 * 4 implicitly wait 10 second
 * 5 get the tittle name
 * 6 verify the tittle name
 * 6 verify the tittle  contains "Register"
 * 7  get the tittle length
 * 8 close the browser
 *
 */
public class Fire_Fox_Testing {

    public static void main(String[] args) {

        String baseurl ="https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(baseurl);
        String tittle = driver.getTitle();
        System.out.println(tittle);
        boolean verify = tittle.equals("Barclays");
        System.out.println(verify);
        boolean verifyContains = tittle.contains("Registerd");
        System.out.println(verifyContains);
        int length = tittle.length();
        System.out.println(length);
        driver.close();



    }


}

