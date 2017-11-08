import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
	       WebDriver driver = new FirefoxDriver();
	       driver.get("http://www.w3schools.com");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.xpath(".//*[@id='mySidenav']/a[1]")).click();

	}

}
