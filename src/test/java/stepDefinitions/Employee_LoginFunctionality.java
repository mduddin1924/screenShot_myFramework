package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.Employee_HomePage;
import pages.Employee_LoginPage;
import pages.Landing_Page;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

//used whole Employee login functionality after HomePage
public class Employee_LoginFunctionality extends Base {


    @Given("I See Landing Page")
    public void i_see_landing_page() throws IOException, InterruptedException {

        navigate("http://it.microtechlimited.com");
        String s = getText(Landing_Page.wrongSlogan);
        soft.assertThat(s).isEqualTo("Your One Stop Soloution");
        screenShot(driver, "Assertion Error");
        Thread.sleep(2000);
    }

    @Then("I Press on Login Menu")
    public void i_press_on_login_menu() {

        click(Landing_Page.menuLoginButton);
    }

    @Then("I click Employee Login Menu")
    public void i_click_employee_login_menu() {

        click(Employee_LoginPage.employeeLoginMenu);
    }

    @Then("I Enter Employee User Id {string}")
    public void i_Enter_Employee_User_Id(String userId) throws InterruptedException {

        sendKeys(Employee_LoginPage.employeeUserId, userId);
        Thread.sleep(1000);
    }

    @Then("I Enter Employee Password {string}")
    public void i_Enter_Employee_Password(String passCode) throws InterruptedException {

        sendKeys(Employee_LoginPage.employeePassword, passCode);
        Thread.sleep(1000);
    }

    @When("I click on Employee Login Button")
    public void i_click_on_employee_login_button() throws InterruptedException {

        String btnName = driver.findElement(By.name("login-submit")).getAttribute("value");
        System.out.println(btnName);

        click(Employee_LoginPage.employeeLoginButton);
        Thread.sleep(1000);


    }

    @Then("I can see employee {string} and {string}")
    public void i_can_see_employee_and(String number, String message) throws IOException, InterruptedException {
        //String welcomeMsg = getText(Employee_HomePage.employeeWelcomeMsg);
        //assertEquals("Welcome Test", welcomeMsg);
        // Third Party Assertion
        if (number.contains("01")) {
            String statusId = getText(Employee_HomePage.employeeIdStatus);
            soft.assertThat(statusId).isEqualTo(message);
            screenShot(driver, "Error assertions");
            Thread.sleep(1000);
        } else if (number.contains("02")) {
            String errorLogin = getText(Employee_LoginPage.invalidEmployeeLoginMessage);
            soft.assertThat(errorLogin).isEqualTo(message);
            screenShot(driver, "employee south africa");
            Thread.sleep(1000);
        } else if (number.contains("03")) {
            String errorMsg = getText(Employee_LoginPage.invalidEmployeeLoginMessage);
            soft.assertThat(errorMsg).isEqualTo(message);
            screenShot(driver, "employee new zealand");
            Thread.sleep(1000);
        } else {
            String wrongMsg = getText(Employee_LoginPage.invalidEmployeeLoginMessage);
            soft.assertThat(wrongMsg).isEqualTo(message);
            screenShot(driver, "employee pakistan");
        }
        soft.assertAll();

    }


}








