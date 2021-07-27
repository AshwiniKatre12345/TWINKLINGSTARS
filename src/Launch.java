import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
       public static void main(String[] args) {
    	   System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    	   WebDriver driver = new ChromeDriver();
    	   driver.get("https://www.flipkart.com/");
       }

}
