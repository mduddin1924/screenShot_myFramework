package pages;

import base.Base;
import org.openqa.selenium.By;

public class Customer_HomePage extends Base {

    public static By customerProfileMenu = By.cssSelector("a[href='custMyProfile.php?id=4']");

    public static By productMenu = By.xpath("//a[text()='Order Product']");
    public static By customerWelcomeMsg = By.xpath("//h2[2]");

    public static By customerIdStatus = By.xpath("//h2[text()='Customer Id: 4 ']");

    public static By logOut = By.xpath("//a[text()='Log Out']");


}
