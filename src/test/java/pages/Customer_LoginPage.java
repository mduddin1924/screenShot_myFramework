package pages;

import base.Base;
import org.openqa.selenium.By;

public class Customer_LoginPage extends Base {

    // locators
    public static By customerLogin = By.xpath("//a[text()='Customer Login']");
    public static By customerUserId = By.cssSelector("input[name='mailuid']");

    public static By customerUserPwd = By.xpath("//input[@name='pwd']");

    public static By customerLoginBtn = By.cssSelector("input[name='login-submit']");

    public static By invalidCustomerUserId = By.xpath("//input[@placeholder='Enter Email Address']");

    public static By invalidCustomerPassword = By.cssSelector("input[placeholder='Enter Password']");

    public static By customerErrorLoginMessage = By.cssSelector("span[id='error-msg']");


    // Actions
    public static void logInAsCustomer() {

        // Click on Customer Menu Button
        click(Customer_LoginPage.customerLogin);
        // Enter Customer User Id
        sendKeys(Customer_LoginPage.customerUserId, "david@gmail.com");
        // Enter Customer User Password
        sendKeys(Customer_LoginPage.customerUserPwd, "1234");

        click(Customer_LoginPage.customerLoginBtn);

    }

}


