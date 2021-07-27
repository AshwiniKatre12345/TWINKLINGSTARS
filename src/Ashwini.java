import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ashwini {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]")).click();
		
	}

}
