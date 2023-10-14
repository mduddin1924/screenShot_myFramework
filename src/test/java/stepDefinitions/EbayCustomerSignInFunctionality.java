package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class EbayCustomerSignInFunctionality extends Base {
    @Given("I am in Ebay Landing Page")
    public void i_am_in_Ebay_Landing_Page() throws InterruptedException {
        navigate("https://www.ebay.com/");
        Thread.sleep(1000);
    }

    @Then("I click on Ebay Register Menu")
    public void i_click_on_Ebay_Register_Menu() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='register']")).click();
        Thread.sleep(1000);

    }

    @Then("I can see the signIn page")
    public void i_can_see_the_signIn_page() throws InterruptedException {
        String x = driver.findElement(By.xpath("//h1[text()='Create an account']")).getText();
        Assert.assertEquals("Create an account", x);
        System.out.println("Passed");
        Thread.sleep(1000);

    }

    @Then("I enter details of my account creating information")
    public void i_enter_details_of_my_account_creating_information(List<String> data) throws InterruptedException {

        driver.findElement(By.xpath("//Input[@id='firstname']")).click();
        driver.findElement(By.xpath("//Input[@id='firstname']")).sendKeys(data.get(0));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Input[@id='lastname']")).click();
        driver.findElement(By.xpath("//Input[@id='lastname']")).sendKeys(data.get(1));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Input[@id='Email']")).click();
        driver.findElement(By.xpath("//Input[@id='Email']")).sendKeys(data.get(2));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//Input[@id='password']")).click();
        driver.findElement(By.xpath("//Input[@id='password']")).sendKeys(data.get(3));
        Thread.sleep(2000);


        //driver.quit();

    }


}









