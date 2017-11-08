import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.gson.annotations.Until;

public class ieDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//lib//IEDriverServer.exe");
		WebDriver ieDriver = new InternetExplorerDriver();
		ieDriver.get("http://4pda.ru/");
		ieDriver.manage().window().maximize();
		
		String windowsize = new String (ieDriver.manage().window().getSize().toString());
		System.out.println("Window size is " + windowsize);
		
		ieDriver.findElement(By.linkText("—“¿“‹»")).click();
		ieDriver.navigate().back();
		
		
		ieDriver.findElement(By.linkText("ÕŒ¬Œ—“»")).click();
		ieDriver.navigate().back();
		
		ieDriver.close();
		
	}
	
}

