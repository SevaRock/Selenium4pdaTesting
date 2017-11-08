import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_2 {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='mySidenav']/div/a[1]/preciding-sibling::a")).click();
		
	}

}
