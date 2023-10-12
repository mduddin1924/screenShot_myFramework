package pages;

import base.Base;
import org.openqa.selenium.By;

public class Employee_HomePage extends Base {
    public static By employeeWelcomeMsg = By.xpath("//h2[contains(text(),'Test')]");

    public static By employeeIdStatus = By.xpath("//h2[text()='Employee Id: 102 ']");

    public static By myProfileMenu = By.xpath("//a[text()='My Profile']");

    public static By productOrderMenu = By.xpath("//a[text()='Product Order']");

    public static By applyLeaveMenu = By.xpath("//a[text()='Apply Leave']");

    public static By leaveStatusText = By.xpath("//h2[text()='Leave Satus']");

    public static By logOut = By.cssSelector("a[href='elogin.php']");


}
