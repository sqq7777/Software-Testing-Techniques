package cn.tjucic.selenium;

import java.util.regex.Pattern;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.csvreader.CsvReader;

public class TestLab2 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String id = null;
	private String pwd = null;
	private String gitUrl = null;

	@Before
	public void setUp() throws Exception {
		String driverPath = System.getProperty("user.dir") + "/src/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		baseUrl = "http://121.193.130.195:8800";
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
	}

	@Test
	public void testLab2() throws Exception {
		CsvReader cin = new CsvReader("F:/eclipse/2.Lab/test.csv", ',', Charset.forName("GBK"));
		//读取csv文件
		cin.readHeaders();
		while (cin.readRecord()) {
			id = cin.get(1);//获得学号（ID）
			if(id.length()<10){
				continue;
			}
			pwd = id.substring(4, 10);//获得密码
			gitUrl = cin.get(3);//获得表格中的url
			driver.get("http://121.193.130.195:8800/login");
			WebElement we = driver.findElement(By.name("id"));
			we.click();
			// driver.findElement(By.name("id")).click();
			driver.findElement(By.name("id")).clear();
			driver.findElement(By.name("id")).sendKeys(id);
			// driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.id("btn_login")).click();
			String gitUrls = driver.findElement(By.xpath("//*[@id='student-git']")).getText();
			//获得网页中url文本  使用xpath finder定位
			if (!gitUrl.equals(gitUrls)) {
				System.out.println(id);
				System.out.println(gitUrl);
				System.out.println(gitUrls);
				continue;

			}//判断网页中的url和表格中的url是否相同，相同则继续，不同则输出
			assertEquals(gitUrl, gitUrls);
			driver.findElement(By.id("btn_logout")).click();
			driver.findElement(By.id("btn_return")).click();
		}
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		// String verificationErrorString = verificationErrors.toString();
		// if (!"".equals(verificationErrorString)) {
		// fail(verificationErrorString);
		// }
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
