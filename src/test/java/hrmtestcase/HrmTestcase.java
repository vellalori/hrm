package hrmtestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import hrmbase.HrmBase;
import hrmpages.DashBoard;
import hrmpages.LoginPage;

public class HrmTestcase extends HrmBase {
	LoginPage loginPage;
	DashBoard dashboard;
	public HrmTestcase()
	{
		super();
		
	}
	@BeforeMethod
	public void SetUp() {
		Initialisation();
		loginPage=new LoginPage();
	}
	@AfterMethod
	public void TearDown()
	{
	driver.quit();
	}
	@Test(priority=1,enabled=false)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		System.out.println(title);
	}
		@Test(priority=2,enabled=true)
		public void LoginTest() {
			dashboard=loginPage.login(prop.getProperty("Username"),prop.getProperty("password"));
		}
		@Test(priority=3,enabled=false)
		public void imagetest() {
			boolean flag=loginPage.imagetest();
			Assert.assertTrue(flag);
		}
		@Test(priority=2)
		public void LoginTest1() {
			dashboard=loginPage.login(prop.getProperty("Userid"),prop.getProperty("password"));
		
		}
	}


	


