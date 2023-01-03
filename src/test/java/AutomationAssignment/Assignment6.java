package AutomationAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class Assignment6 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

       System.out.println("-----------------------Task 1---------------------------------------");
        String WebUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(WebUrl);
        /*Try to use contains , xpath axes, text functions

        Write a minimum 3 XPath and 3 CSS Selector for the username

        Write a minimum 3 XPath and 3 CSS Selector for the password

        Write a minimum 3 XPath and 3 CSS Selector for the login button*/


        System.out.println("----------------XPath & CSS Selector for Username--------------------------------------");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Daps");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Daps1");
        driver.findElement(By.xpath("//input[contains(@placeholder,'name')]")).sendKeys("Dap2");
        driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("Dap3");
        driver.findElement(By.xpath("//input[contains(@placeholder,'ame')]")).sendKeys("Dap4");
        driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Dap5");
        driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Dap6");
        driver.findElement(By.xpath("//input[contains(@class,'oxd')]")).sendKeys("Dap7");
        driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')]//following::input[1]")).sendKeys("Dap8");
        driver.findElement(By.xpath("//div[contains(@class,'oxd')]//input[1]")).sendKeys("Dap9");


        driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("Dee1");
        driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("Dee2");
        driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("Dee3");
        driver.findElement(By.cssSelector("input[placeholder*='username']")).sendKeys("Dee4");
        driver.findElement(By.cssSelector("input[placeholder$='name']")).sendKeys("Dee5");
        driver.findElement(By.cssSelector("input[placeholder^='user']")).sendKeys("Dee6");

        System.out.println("----------------XPath & CSS Selector for Password--------------------------------------");
        driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')]//following::input[2]")).sendKeys("Dap01");
        driver.findElement(By.xpath("//div[contains(@class,'oxd')]//input[@type='password']")).sendKeys("Dap02");
        driver.findElement(By.xpath("//div[contains(@class,'oxd')]//input[@name='password']")).sendKeys("Dap03");
        driver.findElement(By.xpath("//div[contains(@class,'oxd')]//input[@placeholder='password']")).sendKeys("Dap04");
        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Dap05");
        driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("Dap06");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Dap07");
        driver.findElement(By.xpath("//input[contains(@placeholder,'word')]")).sendKeys("Dap08");
        driver.findElement(By.xpath("//input[contains(@placeholder,'pass')]")).sendKeys("Dap09");
        driver.findElement(By.xpath("//input[contains(@name,'word')]")).sendKeys("Dap10");
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Dap11");
        driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("Dap12");
        driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Dap13");

        driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("Dee7");
        driver.findElement(By.cssSelector("input[type$='word']")).sendKeys("Dee8");
        driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("Dee9");
        driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("Dee01");
        driver.findElement(By.cssSelector("input[name$='word']")).sendKeys("Dee02");
        driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("Dee03");
        driver.findElement(By.cssSelector("input[placeholder*='password']")).sendKeys("Dee04");
        driver.findElement(By.cssSelector("input[placeholder$='word']")).sendKeys("Dee05");
        driver.findElement(By.cssSelector("input[placeholder^='pass']")).sendKeys("Dee06");


        System.out.println("----------------XPath & CSS Selector for Login Button-------------------------------");
        driver.findElement(By.xpath("//div[contains(@class,'oxd-form-row')]//following::button[1]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'oxd')]//following::button[1]")).click();
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("button[class*='oxd']")).click();
        driver.findElement(By.cssSelector("button[class$='button']")).click();
        driver.findElement(By.cssSelector("button[class^='oxd']")).click();
        driver.findElement(By.cssSelector("button[type^='sub']")).click();
        driver.findElement(By.cssSelector("button[type*='sub']")).click();
        driver.findElement(By.cssSelector("button[type$='mit']")).click();
        driver.findElement(By.cssSelector("button.oxd-button")).click();


        System.out.println("-----------------------Task 2---------------------------------------");

       // Write dynamic xpath which should match all below elements

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'pim')]")).click();
        driver.findElement(By.xpath("//span[text()='Leave']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'leave')]")).click();
        driver.findElement(By.xpath("//span[text()='Time']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'time')]")).click();
        driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'recruitment')]")).click();
        driver.findElement(By.xpath("//span[text()='My Info']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'MyDetails')]")).click();
        driver.findElement(By.xpath("//span[text()='Performance']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'performance')]")).click();
        driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'dashboard')]")).click();
        driver.findElement(By.xpath("//span[text()='Directory']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'Directory')]")).click();
        driver.findElement(By.xpath("//span[text()='Maintenance']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'Maintenance')]")).click();
        driver.findElement(By.xpath("//span[text()='Buzz']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'Buzz')]")).click();

        driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Olalolly");
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//preceding::input[4]")).sendKeys("Daposky");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@dapo");
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[4]")).click();

        List<WebElement> inputTag= driver.findElements(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
        for (WebElement s1:inputTag
             ) {String name =s1.getText();
            if (name.contains("Admin"))s1.click();
        }
        List<WebElement> inputTag2= driver.findElements(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
        for (WebElement s2:inputTag2
        ) {String name =s2.getText();
            if (name.contains("Enabled"))s2.click();
        }

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        System.out.println("-----------------------Task 3---------------------------------------");


        System.out.println("--------------Add User Scripts------------------------");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@placeholder= 'Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder= 'Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
       // driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("HakanOnder N Charles");
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[2]")).sendKeys("Oladaps2");
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[3]")).sendKeys("Dapo@123");
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[4]")).sendKeys("Dapo@123");

        List<WebElement> inputTag3= driver.findElements(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
        for (WebElement s1:inputTag3
        ) {String name =s1.getText();
            if (name.contains("Admin"))s1.click();
        }
        List<WebElement> inputTag4= driver.findElements(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
        for (WebElement s2:inputTag4
        ) {String name =s2.getText();
            if (name.contains("Enabled"))s2.click();
        }

        /*driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@placeholder= 'Username']")).sendKeys(new CharSequence[]{"Admin"});
        driver.findElement(By.xpath("//input[@placeholder= 'Password']")).sendKeys(new CharSequence[]{"admin123"});
        driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'viewAdmin')] ")).click();
        driver.findElement(By.cssSelector("button[class$='secondary']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(new CharSequence[]{"Oladaps2"});
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[2]")).sendKeys(new CharSequence[]{"Oladaps2"});
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[3]")).sendKeys(new CharSequence[]{"Dapo@123"});
        driver.findElement(By.xpath("//div[@class='oxd-input-group__label-wrapper']//following::input[4]")).sendKeys(new CharSequence[]{"Dapo@123"});
        driver.findElement(By.xpath("//div[contains(text(),\"Select\")]")).click();
        driver.findElement(By.xpath("//div[contains(text(),\"Admin\")]")).click();
        driver.findElement(By.xpath("//div[contains(text(),\"Select\")]")).click();
        driver.findElement(By.xpath("//div[contains(text(),\"Enabled\")]")).click();
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();*/

        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Oladaps2");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
        driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']//following::button[1]")).click();

        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Oladaps2");
        WebElement vUser= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
       String text = vUser.getText();
       if (!text.contains("Oladaps2")){
           System.out.println("Passed");
       }

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();





    }
}
