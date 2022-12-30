package AutomationAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class Assignment7 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("-----------------------Task 1---------------------------------------");
        String WebUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(WebUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        //driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
        String ReqdField= driver.findElement(By.xpath("//span[text()=\"Required\"]")).getText();

        System.out.println("Field is displayed "+ReqdField.contains("Required"));
        System.out.println(ReqdField.length());


        //Getting css values for username and password - border
        String cssProp= driver.findElement(By.name("username")).getCssValue("border");
        System.out.println("username border contains 1px "+cssProp.contains("1px"));
        System.out.println(cssProp.toUpperCase());

        String cssVal= driver.findElement(By.name("password")).getCssValue("border");
        System.out.println("Password border contains 1px "+cssVal.contains("1px"));
        System.out.println(cssVal.toLowerCase());


        System.out.println("-----------------------Task 2---------------------------------------");
        driver.get(WebUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@placeholder= 'Username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();

       String text= driver.findElement(By.xpath("//span[text()=\"Required\"]")).getText();

        System.out.println("Text is displayed "+text.contains("Required"));


        System.out.println("-----------------------Task 3---------------------------------------");
        driver.get(WebUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@placeholder= 'Username']")).sendKeys("mukesh");
        driver.findElement(By.xpath("//input[@placeholder= 'Password']")).sendKeys("mukesh");

        driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();

        String errorMsg= driver.findElement(By.xpath("//p[text()=\"Invalid credentials\"]")).getText();
        System.out.println(errorMsg.contains("Invalid credentials"));

        System.out.println("-----------------------Task 4---------------------------------------");
        driver.get(WebUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@placeholder= 'Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder= 'Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl().contains("dashboard"));

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();



    }
    }

