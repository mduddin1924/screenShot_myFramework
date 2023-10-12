package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_HomePage;
import pages.Employee_OrderListPage;
import pages.Employee_ProductOrderPage;

import static org.junit.Assert.assertEquals;

public class Employee_OrderFunctionality extends Base {

    @Then("I click Employee Product Order Menu")
    public void i_click_Employee_Product_Order_Menu() throws InterruptedException {
        click(Employee_HomePage.productOrderMenu);
        Thread.sleep(1000);
    }

    @When("I Choose Employee Product Name")
    public void i_Choose_Employee_Product_Name() throws InterruptedException {
      dropDownIndex(Employee_ProductOrderPage.productName,8);
        Thread.sleep(1000);
    }

    @Then("I Put Employee Order Date")
    public void i_Put_Employee_Order_Date() throws InterruptedException {
      sendKeys(Employee_ProductOrderPage.orderDate,"07/01/2023");
        Thread.sleep(1000);
    }

    @Then("I click Employee Order Product Button")
    public void i_click_Employee_Order_Product_Button() throws InterruptedException {
        click(Employee_ProductOrderPage.OrderButton);
        Thread.sleep(1000);
    }

    @When("I confirm Employee Order Product")
    public void i_confirm_Employee_Order_Product() throws InterruptedException {
        click(Employee_OrderListPage.orderConfirm);
        Thread.sleep(1000);
    }

    @Then("I confirmed Employee Order Product")
    public void i_confirmed_Employee_Order_Product() {
        String status = getText(Employee_OrderListPage.confirmedStatus);
        assertEquals("Confirmed",status);
    }
    @And("I logout From Employee Order List")
    public void i_logout_From_Employee_Order_List() {
       click(Employee_OrderListPage.orderListLogout);
    }


}
