package hrmbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HrmBase {
	public static WebDriver driver;
	public static Properties prop;
	public HrmBase() {
		try {
			prop=new Properties();
	FileInputStream ip=new FileInputStream("F:\\eclipse05\\hrm\\src\\main\\java\\hrmconfig\\config.properties");
	prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e1) {
		e1.printStackTrace();
	}
	}
		public static void Initialisation() {
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","F:\\eclipse05\\build files//chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			//	driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICITLY_WAIT,TimeUnit.SECONDS);
		//	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT,TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				
				
				
			}

		
}


}
