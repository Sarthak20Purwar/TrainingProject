package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Pages.SpiceJet_POM;

import io.cucumber.java.en.*;

public class SpiceJetTask_POM {

	WebDriver driver = null;
	SpiceJet_POM spice;

	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("Inside Step - browser is open ");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sarthak.purwar\\Downloads\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@Given("user is on spiceJet homepage")
	public void user_is_on_spice_jet_homepage() {

		driver.navigate().to("https://www.spicejet.com/");

	}

	@When("user enters the text box of from city")
	public void user_enters_the_text_box_of_from_city() {

		spice = new SpiceJet_POM(driver);
		spice.clickFrom();

	}

	@When("user selects the city from")
	public void user_selects_the_city_from() {

		spice.selectFrom();
	}

	@When("user selects the city to")
	public void user_selects_the_city_to() {

		spice.selectTo();
	}

	@Then("user selects the departure date")
	public void user_selects_the_departure_date() {
		spice.depDate();
	}

	@When("user clicks the return date option")
	public void user_clicks_the_return_date_option() {
		spice.clickRet();
	}

	@When("user enters the return date")
	public void user_enters_the_return_date() {
		spice.retDate();
	}

	@Then("user clicks the search flight button")
	public void user_clicks_the_search_flight_button() {
		spice.searchF();
	}

	@Then("user clicks the continue button")
	public void user_clicks_the_continue_button() {
		spice.clickConti();
	}

	@When("User enters the First name text box")
	public void user_enters_the_first_name_text_box() {
        spice.firstName();
	}

	@When("User enters the last name")
	public void user_enters_the_last_name() {
        spice.lastName();
	}

	@Then("User enters the mobile number")
	public void user_enters_the_mobile_number() {
        spice.mobNo();	}

	@Then("User enters the email address")
	public void user_enters_the_email_address() {
         spice.email();
	}

	@Then("User enters the city")
	public void user_enters_the_city() {
          spice.city();
	}

	@Then("User Enters the First name in second text box")
	public void user_enters_the_first_name_in_second_text_box() {
          spice.firstName1();
	}

	@Then("User enters the last name in the second box")
	public void user_enters_the_last_name_in_the_second_box() {
         spice.lastname1();
	}

	@Then("User enters the mobile number in second text box")
	public void user_enters_the_mobile_number_in_second_text_box() {
           spice.mobNo1();
	}

	@Then("User click the continue button")
	public void user_click_the_continue_button() {
          spice.con();
	}

	@Then("User enters the Add button")
	public void user_enters_the_add_button() {
	   spice.add();
	}

	@Then("User clicks the seat number")
	public void user_clicks_the_seat_number() {
	  spice.seat();
	}

	@Then("User clicks the select meal")
	public void user_clicks_the_select_meal() {
	   spice.clickMeal();
	}

	@Then("User selects the meal")
	public void user_selects_the_meal() {
	   spice.selectMeal();
	}

	@Then("User enters the done button")
	public void user_enters_the_done_button() {
	    spice.done();
	}
//	@Then("User clickss the continue button")
//	public void user_clickss_the_continue_button() {
//        spice.continu();
//	}

//
//	@Then("user checks the amount")
//	public void user_checks_the_amount() {
//	   spice.amt();
//	}


}

