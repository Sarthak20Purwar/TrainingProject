package GmailLogin;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarthak.purwar\\Downloads\\Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("gmail");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[text()=\"Gmail - Google\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Sign in\"]")).click();
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("purwar1999@gmail.com");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("");
	
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		//driver.close();
		
	}
}


