import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
  private WebDriver driver;
  
  @BeforeTest
  public void setup() {
	  
	  System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("http://localhost/employee/admin/");
  }
  
  @Parameters({"userGeNama"})
  @Test(priority=1)
  public void login(String name)
  {
	  
	  driver.findElement(By.name("username")).sendKeys(name);
  }
  
  @Test(priority=2,dependsOnMethods= {"login"})
  public void serchEmployee()
  {
	  
  }
  
}
