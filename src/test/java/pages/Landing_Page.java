package pages;

import base.Base;
import org.openqa.selenium.By;

public class Landing_Page extends Base {

    // MicroTech NA -- Home Logo
    public static By homePageLogo = By.xpath("//h1[text()='MicroTech NA']");
    public static By menuLoginButton = By.xpath("//a[text()='LOG IN']");

    // Welcome to MicroTech NA. -- Welcome Text
    public static By welcomeText = By.xpath("//h1[text()='Welcome to MicroTech NA.']");

    // Your One Stop Soloution --Slogan
    public static By wrongSlogan = By.xpath("//p[text()='Your One Stop Soloution']");
}
