package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumStandaloneTest {
	WebDriver driver;
  @Test
  @Ignore
  public void f() {
	  WebDriverManager.chromedriver().driverVersion("90.0.4430.85").setup();
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/list-todos");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}
  
  @Test
  @Ignore
  public void standalone() throws MalformedURLException, InterruptedException
  {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("chrome");
	  WebDriver remote_driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
	  
	  remote_driver.get("http://localhost:8080/list-todos");
		System.out.println(remote_driver.getCurrentUrl());
		System.out.println(remote_driver.getTitle());
		Thread.sleep(15000);
		remote_driver.quit();
	  
  }
  
  //22:40:17.861 INFO [Hub.start] - Nodes should register to http://192.168.1.106:4444/grid/register/
 // 22:40:17.870 INFO [Hub.start] - Clients should connect to http://192.168.1.106:4444/wd/hub
 // selenium-standalone start -- -role node -hub http://192.168.1.106:4444/grid/register/
  
  @Test
  public void standalonegrid() throws MalformedURLException, InterruptedException
  {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setBrowserName("chrome");
	  WebDriver remote_driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
	  
	  remote_driver.get("http://localhost:8080/list-todos");
		System.out.println(remote_driver.getCurrentUrl());
		System.out.println(remote_driver.getTitle());
		Thread.sleep(15000);
		remote_driver.quit();
	  
  }
  }

