package Basic;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
	WebDriver driver;
	
	@BeforeMethod
	public void set() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");

	}
	
	@AfterMethod
	public void tear() {
		
		driver.close();
	}

}
