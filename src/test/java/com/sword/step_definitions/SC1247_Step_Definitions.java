package com.sword.step_definitions;

import com.sword.pages.Authorization_Page;
import com.sword.pages.Log_Out_Page;
import com.sword.pages.Portal_Page;
import com.sword.utilities.ConfigurationReader;
import com.sword.utilities.Driver;
import com.sword.utilities.Timer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SC1247_Step_Definitions {
        Authorization_Page authorization_page = new Authorization_Page();
        Portal_Page portal_page = new Portal_Page();
        Log_Out_Page logOutPage=new Log_Out_Page();

        @Given("Users should go to the Authorization page")
        public void users_should_go_to_the_authorization_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("Authorization.url"));
            Assert.assertTrue(authorization_page.userName.isDisplayed());

        }

        @Given("Users should enter valid user name")
        public void users_should_enter_valid_user_name() {
            authorization_page.userName.sendKeys("helpdesk1@cybertekschool.com");



        }

        @Given("Users should enter valid password")
        public void users_should_enter_valid_password() throws InterruptedException {
            Thread.sleep(3000);
            authorization_page.password.sendKeys("UserUser");
        }

        @Given("Users should click the Log in button")
        public void users_should_click_the_log_in_button() {
            authorization_page.login.click();
        }

        @Then("Users are on the Portal page")
        public void users_are_on_the_portal_page() throws InterruptedException {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));

            Assert.assertTrue(portal_page.profileDropdown.isDisplayed());
            Assert.assertTrue(portal_page.profileDropdown.getText().contains("help"));


        }

        @When("Users click profile dropdown should see Log out option")
        public void users_click_profile_dropdown_should_see_log_out_option() throws InterruptedException {
            portal_page.profileDropdown.click();

            Thread.sleep(3000);
            Assert.assertTrue(portal_page.logout.isDisplayed());

            Assert.assertEquals("Log out", portal_page.logout.getText());
        }

        @When("Users click Log out option")
        public void users_click_log_out_option() {
            portal_page.logout.click();
        }

        @Then("Users should be on the Authorization page")
        public void users_should_be_on_the_authorization_page() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Authorization"));
        }

    @When("Users click the step back button")
    public void users_click_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("Users should stay on the same page")
    public void users_should_stay_on_the_same_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Author"));

        Assert.assertTrue(logOutPage.afterLogOut.getText().contentEquals("Authorization"));
    }
}