import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Yandex {

	public static void main(String[] args) {
	
		 WebDriver driver = new FirefoxDriver();
	       driver.get("http://www.yandex.ru");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.xpath(".//*[@id='wd-_weather']/div/h1/a[1]")).click();
	       
	 
	}

}
