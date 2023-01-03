package AutomationAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class AssignmentAuto10 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

            driver.get("https://ineuron-courses.vercel.app/login");
            driver.findElement(By.xpath("//input[contains(@id, 'email1')]")).sendKeys("ineuron@ineuron.ai");
            driver.findElement(By.xpath("//input[contains(@id, 'password1')]")).sendKeys("ineuron");
            driver.findElement(By.xpath("//button[contains(@class, 'submit-btn')]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            WebElement mHover = driver.findElement(By.xpath("//span[contains(text(), 'Manage')]"));
            Actions m1 = new Actions(driver);
            m1.moveToElement(mHover).perform();
            driver.findElement(By.xpath("//span[contains(text(), 'Manage Courses')]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.findElement(By.xpath("//button[contains(text(), 'Activate Courses')]")).click();
            driver.findElement(By.xpath("//div[contains(@class, 'manage-btns')]//button[contains(text(), 'Add New Course')]")).click();
            driver.findElement(By.xpath("//input[contains(@id, 'thumbnail')]")).sendKeys("C:\\Users\\dapsh\\OneDrive\\Pictures\\Screenshots\\Screenshot (3).png");
            driver.findElement(By.xpath("//input[contains(@id, 'name')]")).sendKeys("Dapo-Selenium");
            driver.findElement(By.xpath("//textarea[contains(@id, 'description')]")).sendKeys("Learning Automation");
            driver.findElement(By.xpath("//input[contains(@name, 'instructorName')]")).sendKeys("Mukesh");
            driver.findElement(By.xpath("//input[contains(@name, 'price')]")).sendKeys("100");
            driver.findElement(By.xpath("//input[contains(@name, 'startDate')]")).click();
            driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__current-month')]")).click();
            driver.findElement(By.xpath("//button[contains(@aria-label, 'Next Month')]")).click();
            driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--017')]")).click();
            driver.findElement(By.xpath("//input[contains(@name, 'endDate')]")).click();
            driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__current-month')]")).click();
            driver.findElement(By.xpath("//button[contains(@aria-label, 'Next Month')]")).click();
            driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--015')]"));

            driver.findElement(By.xpath("//div[contains(text(), 'Select Category')]")).click();
            driver.findElement(By.xpath("//div[contains(text(), 'Select Category')]//following::button[3]")).click();
            driver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();

            WebElement verify = driver.findElement(By.xpath("//td[text()='Dapo-Selenium']"));
            System.out.println("Course created successfully "+ verify.getText());
            if (verify.getText().contains("Dapo")){
                System.out.println("Course creation successful");
            }else{
                System.out.println("Not successful");
            }


            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

           WebElement deleteBtn= driver.findElement(By.xpath("//td[contains(text(),'Dapo-Selenium')]//following::td[9]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click",deleteBtn);

            WebElement confirmDel = driver.findElement(By.xpath("//td[contains(text(),'Dapo-Selenium')]"));
            System.out.println("Course deleted successfully "+ confirmDel.getText());
            if (verify.getText().contains("Dapo")){
                System.out.println("Course successfully deleted");
            }else{
                System.out.println("Not successful");
            }

            driver.findElement(By.xpath("//button[text()=\"Sign out\"]")).click();


            //delete for manage users in ineuron
            // driver.findElement(By.xpath("//td[contains(text(),'Dapshad22@yahoo.com')]//following::td[5]")).click();

        }
    }

