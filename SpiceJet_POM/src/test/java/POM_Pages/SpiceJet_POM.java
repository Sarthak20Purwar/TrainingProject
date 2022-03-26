package POM_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpiceJet_POM {

	WebDriver driver;

	By clicks_from_city = By.xpath("//div[text()='From']");
	By selects_from_city = By.xpath("//div[text()='Indira Gandhi International Airport']");
	By selects_to_city = By.xpath("//div[text()='Goa International Airport']");

	By selects_departure_date = By.xpath("//div[text()=\"June \"]/following::div[79]");
	By clicks_return_date = By.xpath("//div[text()='Return Date']");
	By selects_return_date = By.xpath("//div[text()=\"July \"]/following::div[90]");

	By clicks_search_flight = By.xpath("//div[text()=\"Special Assistance\"]/following::div[3]");
	By clicks_continue = By.xpath("//div[text()='inclusive of taxes']//following::div[1]");

	By enters_first_name = By.xpath("//div[text()=\"Contact Details\"]/following::input[1]");
	By enters_last_name = By.xpath("//div[text()=\"Contact Details\"]/following::input[2]");
	By enters_mob_no = By.xpath("//div[text()=\"Contact Details\"]/following::input[3]");
	By enters_email = By.xpath("//div[text()=\"Contact Details\"]/following::input[4]");
	By enters_city=By.xpath("//div[text()=\"Contact Details\"]/following::input[5]");
	
    By first_name=By.xpath("//div[text()=\"Passenger 1\"]/following::input[1]");
    By last_name=By.xpath("//div[text()=\"Passenger 1\"]/following::input[2]");
    By mob_no=By.xpath("//div[text()=\"SC Member ID / Mobile Number\"]/following::input[1]");
    By clicks_continuee=By.xpath("//div[text()='Payable Amount']//following::div[5]");
    
    
    By clicks_add=By.xpath("//*[@id=\"addons-container\"]/div[2]/div[2]/div/div[1]/div[2]/div");
    By select_seat_no=By.xpath("//div[text()='3E']/..");
    By clicks_meal=By.xpath("//div[text()='Select Meals']/..");
    By select_meal=By.xpath("//div[text()='SANDWICH(2)']/following::img[2]");
    By clicks_done=By.xpath("//div[text()='Done']/..");
    By clicks_continueee=By.xpath("//div[text()='Payable Amount']//following::div[5]");
    By checks_amt=By.xpath("//*[@id=\"main-container\"]/div/div[5]/div/div/div[2]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]");
    
	
	public SpiceJet_POM(WebDriver driver) {
		this.driver = driver;
	}

	public void clickFrom() {
		driver.findElement(clicks_from_city).click();
	}

	public void selectFrom() {
		driver.findElement(selects_from_city).click();
	}

	public void selectTo() {
		driver.findElement(selects_to_city).click();
	}

	public void depDate() {
		driver.findElement(selects_departure_date).click();
	}

	public void clickRet() {
		driver.findElement(clicks_return_date).click();
	}

	public void retDate() {
		driver.findElement(selects_return_date).click();
	}

	public void searchF() {
		driver.findElement(clicks_search_flight).click();
	}

	public void clickConti() {
		driver.findElement(clicks_continue).click();
	}

	public void firstName()
	{
		driver.findElement(enters_first_name).sendKeys("Sarthak");
	}
	
	public void lastName()
	{
		driver.findElement(enters_last_name).sendKeys("Purwar");
	}
	
	public void mobNo()
	{
		driver.findElement(enters_mob_no).sendKeys("9794327170");
	}
	
	public void  email()
	{
		driver.findElement(enters_email).sendKeys("sarthak@gmail.com");
	}
	
	public void city()
	{
		driver.findElement(enters_city).sendKeys("Delhi");
	}
	
	public void firstName1()
	{
		driver.findElement(first_name).sendKeys("Sarthak");
	}
	
	public void lastname1()
	{
		driver.findElement(last_name).sendKeys("Purwar");
	}
	
	public void mobNo1()
	{
		driver.findElement(mob_no).sendKeys("9793337170");
	}
	
	public void con()
	{
		driver.findElement(clicks_continuee).click();
	}
	
	public void add()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(clicks_add).click();
	}
	
	public void seat()
	{
		driver.findElement(select_seat_no).click();
	}
	public void clickMeal()
	{
		driver.findElement(clicks_meal).click();
	}
	
	public void selectMeal()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(select_meal).click();
	}
	
	public void done()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(clicks_done).click();
	}
//	
//	public void continu()
//	{
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.findElement(clicks_continueee).click();
//	}
	
//	public void amt()
//	{
//		driver.findElement(clicks_continueee).click();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		String s=driver.findElement(checks_amt).getText();
//		System.out.println("-----------------------------");
//		System.out.println("Total Amount is "+s);
//		System.out.println("-----------------------------");
//	}
}
