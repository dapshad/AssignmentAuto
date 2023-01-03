package AutomationAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment9 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://ineuron-courses.vercel.app/signup");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        boolean statusBefore = driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
        System.out.println("Status before entering values is "+statusBefore);

        driver.findElement(By.xpath("//input[@name= 'name']")).sendKeys("Dapo Apololas");
        driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("Dapshad12@yahoo.com");
        driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("Dapo@123");
        driver.findElement(By.xpath("//label[normalize-space()='Testing']")).click();
        WebElement ele= driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click()",ele);
        new Select(driver.findElement(By.xpath("//select[@id='state']"))).selectByVisibleText("Uttarakhand");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        boolean statusAfter = driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
        System.out.println("Status after entering values is "+statusAfter);

        WebElement ele1 = driver.findElement(By.xpath("//button[@class='submit-btn']"));

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()",ele1);

    }
}
