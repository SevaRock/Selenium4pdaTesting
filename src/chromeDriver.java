import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;

public class chromeDriver {
	
	@Test
	public static void main(String[] args) throws IOException {

		String handlehost;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe" );
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://4pda.ru");
		
		handlehost = chromeDriver.getWindowHandle();

		chromeDriver.switchTo().window(handlehost);
		chromeDriver.switchTo().activeElement();
		
		chromeDriver.manage().window().maximize();

		WebElement newsButton = chromeDriver.findElement(By.linkText("НОВОСТИ"));
		newsButton.click();
		checkTitle(chromeDriver, "Новости - 4PDA");
		takeScreenshot(chromeDriver, "news.png");
		
		chromeDriver.navigate().back();
		
		chromeDriver.findElement(By.linkText("ОБЗОРЫ")).click();
		checkTitle(chromeDriver, "Обзоры - 4PDA");
		takeScreenshot(chromeDriver, "reviews.png");
		
		chromeDriver.navigate().back();
		
		chromeDriver.findElement(By.linkText("ПРОГРАММЫ")).click();
		checkTitle(chromeDriver, "Программы - 4PDA");
		takeScreenshot(chromeDriver, "software.png");
		
		chromeDriver.navigate().back();
		
		chromeDriver.findElement(By.linkText("ИГРЫ")).click();
		checkTitle(chromeDriver, "Игры - 4PDA");
		takeScreenshot(chromeDriver, "games.png");
		
		chromeDriver.navigate().back();
		
		chromeDriver.findElement(By.linkText("СТАТЬИ")).click();
		checkTitle(chromeDriver, "Статьи - 4PDA");
		takeScreenshot(chromeDriver, "articles.png");
		TearDown(chromeDriver);
	
	}

	private static void checkTitle(WebDriver chromeDriver, String expected) {
		Assert.assertEquals(expected, chromeDriver.getTitle());
	}
	
	private static void takeScreenshot(WebDriver chromeDriver, String filename) throws IOException {
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy(HH.mm)");
		String FILE_PATH = "d:\\Selenium\\Chrome\\";
		String fileFormat = df.format(new Date()) + "." + filename; 
		File scrfile2 = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile2, new File(FILE_PATH + fileFormat));
	}

	@After
	private static void TearDown(WebDriver chromeDriver) {
		chromeDriver.close();
	}
}
