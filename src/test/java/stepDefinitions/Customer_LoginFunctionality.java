package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.Customer_HomePage;
import pages.Customer_LoginPage;
import pages.Landing_Page;

import java.io.IOException;

public class Customer_LoginFunctionality extends Base {

    @Given("I am in Landing Page")
    public void i_am_in_Landing_Page() throws IOException, InterruptedException {
        navigate("https://it.microtechlimited.com/");
        String text = getText(Landing_Page.welcomeText);
        soft.assertThat(text).isEqualTo("Welcome to MicroTech NA.");
        screenShot(driver, "Landing Page");
        Thread.sleep(1000);
    }

    @Then("I click on Login Menu")
    public void i_click_on_Login_Menu() throws IOException, InterruptedException {
        click(Landing_Page.menuLoginButton);
        screenShot(driver, "Page Opening");
        Thread.sleep(1000);
    }

    @Then("I click on Customer Login Menu")
    public void i_click_on_Customer_Login_Menu() throws IOException, InterruptedException {
        click(Customer_LoginPage.customerLogin);
        screenShot(driver, "Customer Login Button");
        Thread.sleep(1000);
    }

    @Then("I Enter Customer User Id {string}")
    public void i_Enter_Customer_User_Id(String userId) throws InterruptedException {
        sendKeys(Customer_LoginPage.customerUserId, userId);
        Thread.sleep(1000);
    }

    @Then("I Enter Customer User Password {string}")
    public void i_Enter_Customer_User_Password(String password) throws InterruptedException, IOException {
        sendKeys(Customer_LoginPage.customerUserPwd, password);
        screenShot(driver, "Customer Password");
        Thread.sleep(1000);
    }

    @When("I click on Customer Login Button")
    public void i_click_on_Customer_Login_Button() throws InterruptedException {
        String btnName = driver.findElement(By.name("login-submit")).getAttribute("name");
        System.err.println(btnName);

        click(Customer_LoginPage.customerLoginBtn);
        Thread.sleep(1000);
    }

    @Then("I can see the {string} {string}")
    public void i_can_see_the(String user, String message) throws IOException, InterruptedException {

        if (user.contains("01")) {
            String welcomeMsg = getText(Customer_HomePage.customerWelcomeMsg);
            soft.assertThat(welcomeMsg).isEqualTo(message);
            screenShot(driver, "Customer Home Page");
            Thread.sleep(1000);

        } else if (user.contains("02")) {
            String errorMsg = getText(Customer_LoginPage.customerErrorLoginMessage);
            soft.assertThat(errorMsg).isEqualTo(message);
            screenShot(driver, "Customer invalid login Page");
            Thread.sleep(1000);

        } else if (user.contains("03")){
            String errorMsg = getText(Customer_LoginPage.customerErrorLoginMessage);
            soft.assertThat(errorMsg).isEqualTo(message);
            screenShot(driver, "Customer invalid message Login Page");
            Thread.sleep(1000);

        } else {
            String errorMsg = getText(Customer_LoginPage.customerErrorLoginMessage);
            soft.assertThat(errorMsg).isEqualTo(message);
            screenShot(driver, "Customer invalid message Page");
            Thread.sleep(1000);
        }
        soft.assertAll();



    }

}

