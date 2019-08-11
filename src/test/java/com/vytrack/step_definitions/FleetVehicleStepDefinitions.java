package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class FleetVehicleStepDefinitions {

    Pages pages = new Pages();
    Homepages vy = new Homepages();

    @Given("User on the Vytrack login page")
    public void user_on_the_Vytrack_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment2")));
    }

    @When("Enter truck driver user name and password")
    public void enter_truck_driver_user_name_and_password() {
        String username = ConfigurationReader.getProperty("truckdriverusername");
        String password = ConfigurationReader.getProperty("truckdriverpassword");
        pages.loginPage().login(username, password);
    }

    @When("Navigate to vehicle page")
    public void navigate_to_vehicle_page() {
        vy.clickingOnVehicle();
    }

    @Then("The truck driver should be able to see all vehicle information")
    public void the_truck_driver_should_be_able_to_see_all_vehicle_information() {
        System.out.print(Driver.getDriver().getTitle());
        String AfterCreateTitle = "Car - Entities - System - Car - Entities - System";
        Assert.assertEquals(Driver.getDriver().getTitle(), AfterCreateTitle);
    }
}
