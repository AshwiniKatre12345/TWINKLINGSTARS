import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ash {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("Sofa",Keys.ENTER);
				

	}

}
