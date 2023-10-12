package pages;

import base.Base;
import org.openqa.selenium.By;

public class Employee_ProductOrderPage extends Base {

    public static By productName = By.cssSelector("select[name='prodId']");

    public static By orderDate = By.xpath("//input[@name='ordDate']");

    public static By OrderButton = By.xpath("//button[text()='Order Product']");
}
