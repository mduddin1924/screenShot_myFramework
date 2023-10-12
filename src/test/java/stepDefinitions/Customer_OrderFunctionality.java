package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Customer_HomePage;
import pages.Customer_OrderListPage;
import pages.Customer_ProductOrderPage;

import static org.junit.Assert.assertEquals;

public class Customer_OrderFunctionality extends Base {

    @When("I Click on Customer order Product Menu")
    public void i_Click_on_Customer_order_Product_Menu() throws InterruptedException {
       click(Customer_HomePage.productMenu);
       Thread.sleep(1000);
    }

    @Then("I Use Customer Product Name")
    public void i_Use_Customer_Product_Name() throws InterruptedException {
       dropDownIndex(Customer_ProductOrderPage.productName,9);
       Thread.sleep(1000);
    }

    @Then("I Enter Customer order date")
    public void i_Enter_Customer_order_date() throws InterruptedException {
        sendKeys(Customer_ProductOrderPage.orderDate,"07/06/2023");
        Thread.sleep(1000);

    }

    @Then("I Click Customer Order Product Button")
    public void I_click_Customer_Order_Product_Button() throws InterruptedException {
        click(Customer_ProductOrderPage.orderButton);
        Thread.sleep(1000);
    }

    @When("I Click Confirm Customer Product")
    public void i_Confirm_Product() throws InterruptedException {
      click(Customer_OrderListPage.orderConfirm);
        Thread.sleep(1000);

    }

    @And("I Confirmed Customer Product")
    public void i_Confirmed_Customer_Product() {
       String confirmedStatus = getText(Customer_OrderListPage.confirmedOrder);
       assertEquals("Confirmed",confirmedStatus);
    }
    @And("I logout From Customer Order List")
    public void i_logout_From_Customer_Order_List() {

        click(Customer_OrderListPage.logoutOrderList);
    }



}
