import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;

public class fourPda {

	public static void main(String[] args) {

		 WebDriver driver = new FirefoxDriver();
	       driver.get("http://www.4pda.ru");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.linkText("—“¿“‹»")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath(".//*[@id='rkez1biDd8Nq']/article[1]/div[2]/h2")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	       driver.findElement(By.xpath(".//*[@id='nav']/ul/li[2]/a")).click();
	       
	       
	       
	       driver.findElement(By.xpath(".//*[@id='nav']/ul/li[3]/a")).click();
		
	}

}
