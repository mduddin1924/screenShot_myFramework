package pages;

import base.Base;
import org.openqa.selenium.By;

public class Employee_ProfilePage extends Base {

    public static By updateInfoButton = By.cssSelector("button[name='send']");
    public static By logOut = By.xpath("//a[text()='Log Out']");
}
