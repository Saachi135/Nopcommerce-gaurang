package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //lunch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the url into browser
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle(); // getting browser title
        System.out.println(title); // printing title

        //Print the current url
        System.out.println("Current Url: " + driver.getCurrentUrl()); // getting url title

        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //Find the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));

        //Email input to email field element
        emailField.sendKeys("14gaurang@gmail.com");

        //Find the password element
        WebElement passWordField = driver.findElement(By.name("Password"));
        passWordField.sendKeys("123456");

        // Close the browser
        driver.close();
    }
}
