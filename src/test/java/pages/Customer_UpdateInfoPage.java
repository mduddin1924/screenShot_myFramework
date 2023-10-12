package pages;

import base.Base;
import org.openqa.selenium.By;

public class Customer_UpdateInfoPage extends Base {

    public static By updateContactNum = By.xpath("//input[@name='contact']");

    public static By updateAddress = By.xpath("//input[@name='address']");

    public static By updateButton = By.xpath("//button[@name='update']");
}
