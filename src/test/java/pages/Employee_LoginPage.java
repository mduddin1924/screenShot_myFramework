package pages;

import base.Base;
import org.openqa.selenium.By;


public class Employee_LoginPage extends Base {

    public static By employeeLoginMenu = By.xpath("//a[text()='Employee Login']");

    public static By employeeUserId = By.xpath("//input[@name='mailuid']");

    public static By employeePassword = By.xpath("//input[@name='pwd']");

    public static By employeeLoginButton = By.cssSelector("input[name='login-submit']");

    public static By invalidEmployeeUserId = By.cssSelector("input[type='text']");

    public static By invalidEmployeePassword = By.cssSelector("input[type='password']");

    public static By invalidEmployeeLoginMessage = By.xpath("//span[text()='Invalid username or password!']");


    // Actions

    public static void loginAsEmployee() {
        click(Employee_LoginPage.employeeLoginMenu);

        sendKeys(Employee_LoginPage.employeeUserId, "testpilot@gmail.com");

        sendKeys(Employee_LoginPage.employeePassword, "1234");

        click(Employee_LoginPage.employeeLoginButton);

    }


}


