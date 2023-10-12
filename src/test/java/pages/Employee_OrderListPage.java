package pages;

import base.Base;
import org.openqa.selenium.By;

public class Employee_OrderListPage extends Base {

    public static By orderConfirm = By.xpath("//tbody/tr[last()]/td[7]/a");

    public static By confirmedStatus = By.xpath("//tbody/tr[114]/td[6]");

    public static By orderListLogout = By.xpath("//li[4]/a");

}
