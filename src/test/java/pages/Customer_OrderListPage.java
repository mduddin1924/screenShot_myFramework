package pages;

import base.Base;
import org.openqa.selenium.By;

public class Customer_OrderListPage extends Base {

    public static By orderConfirm = By.xpath("//tbody/tr[last()]/td[7]/a");

    public static By confirmedOrder = By.xpath("//tbody/tr[last()]/td[6]");

    public static By logoutOrderList = By.cssSelector("a[href='clogin.php']");
}
