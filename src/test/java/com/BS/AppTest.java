import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppTest {  
  private WebDriver driver;  

  @Before
  public void setUp() throws Exception {  
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Firefox");
    caps.setCapability("browser_version", "32.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "8.1");
    caps.setCapability("resolution", "1024x768");
    caps.setCapability("build", "Sample JUnit");
    driver = new RemoteWebDriver(
      new URL("http://<username>:<automate-key>@hub.browserstack.com/wd/hub"),
      caps
    );
  }  

  @Test  
  public void testSimple() throws Exception {  
    driver.get("http://www.google.com");
    System.out.println("Page title is: " + driver.getTitle());
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("BrowserStack");
    element.submit();  
  }  

  @After
  public void tearDown() throws Exception {  
      driver.quit();  
  }  
}