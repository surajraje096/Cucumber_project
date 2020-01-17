package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import WebEventListener.WebEventListener;
import config.XPath;

public class TestBase {

	public static WebDriver driver;
	
	public static ErrorCollector collector;
	public static EventFiringWebDriver eventFiringWebDriver;
	public static WebEventListener webEventListener;


	private static final String ResultSet = null;

	public static Properties pro;

	public TestBase() {
		pro = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(
					"D:\\SpringBoot API Projects\\Cucumbers\\src\\main\\java\\config\\config.properties");
			pro.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inti() throws IOException {
		String browsername = XPath.browser;
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JARs\\chromeSelinium\\Internet Explorer jar\\new\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JARs\\chromeSelinium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;

		
		driver.get(XPath.url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
