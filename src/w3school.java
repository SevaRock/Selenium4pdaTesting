import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.gson.annotations.Until;

public class w3school {

	public static void main(String[] args) {
		
	    WebDriver driver = new FirefoxDriver();
	       driver.get("http://www.w3schools.com");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.xpath(".//*[@id='mySidenav']/a[1]")).click();
	       driver.findElement(By.xpath(".//*[@id='leftmenuinnerinner']/a[7]")).click();


	}

}
