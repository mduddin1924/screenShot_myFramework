package pages;

import base.Base;
import org.openqa.selenium.By;

public class Employee_ApplyLeavePage extends Base {

    public static By reasonVacation = By.xpath("//input[@name='reason']");
    public static By startDate = By.xpath("//input[@name='start']");


    public static By endDate = By.xpath("//input[@name='end']");

    public static By submitButton = By.xpath("//button[text()='Submit']");
}
