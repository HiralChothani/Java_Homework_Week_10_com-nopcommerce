package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        // Setup Chrome browser

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the url into browser
        driver.get(baseUrl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //  Print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("XYZ123@gmail.com");
        // Enter the password to password field
        driver.findElement(By.id("Password")).sendKeys("Password123");
        //Close the browser
        driver.close();


    }
}
