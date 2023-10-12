package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Hooks extends Base {

    @Before
    public static void startUp() {

        //WebDriverManager.chromedriver().setup();
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        // driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Before Run");

    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            String screenshotName= scenario.getName().replace(" ", "");
            if(scenario.isFailed()) {
                scenario.log("this is my failure message");
                scenario.log(screenshotName);
                // convert by (type casting (keywords for java))
                TakesScreenshot ts = (TakesScreenshot)driver;
                byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);

                //File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                //FileUtils.copyFile(f, new File("C:/Java/workspaceintellij/screenshot_Myframework/screenShot_Taken"));

                scenario.attach(screenshot, "image/png", screenshotName);



            }
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Complete Work");
        }
        driver.close();// to close Current Browser Tab
        //driver.quit();// to close Browser Application or Windows
        System.out.println("After Run");

        }

}
