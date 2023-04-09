package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String browser = "edge";
    static WebDriver driver;

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name entered"); // message if different browser is entered
        }
        driver.get(baseUrl);
//        3. Print the title of the page
        System.out.println(driver.getTitle()); // getting title

//        4. Print the current url
        System.out.println("Current url: " + driver.getCurrentUrl()); //getting current url from browser

//        5. Print the page source
        System.out.println("Current source: " + driver.getPageSource()); // getting page source

//        6. Find and input the email to email field
        WebElement email = driver.findElement(By.id("Email"));// getting element from the browser
        email.sendKeys("abcdEFG@gmail.com"); // input  in email field

//        7. Enter the password to password field
        WebElement pass = driver.findElement(By.name("Password")); // input in password field
        pass.sendKeys("yyz");

//        8. Close the browser
        driver.close();  //closing browser
    }

}

