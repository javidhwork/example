/*package sample1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assessment {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // set system property for chrome driver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        // create a new ChromeDriver instance
        driver = new ChromeDriver();
        // navigate to the login page
        driver.get("https://example.com/login");
    }

    @AfterClass
    public void tearDown() {
        // close the browser window
        driver.quit();
    }

    @Test(priority = 1)
    public void testValidLogin() {
        // enter valid email and password and click on the login button
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("root_user@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("root_password@gmail.com");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

        // verify that the user is redirected to the home screen and the loggedIn flag is set
        Assert.assertTrue(driver.getCurrentUrl().contains("https://example.com/home"));
        Assert.assertEquals(driver.executeScript("return localStorage.getItem('loggedIn')"), "true");
    }

    @Test(priority = 2)
    public void testInvalidPassword() {
        // enter valid email but wrong password and click on the login button
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("root_user@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("wrong_password");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

        // verify that the error message is displayed
        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='Wrong password']"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 3)
    public void testInvalidEmail() {
        // enter wrong email and any password and click on the login button
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("wrong_email@gmail.com");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("any_password");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

        // verify that the error message is displayed
        WebElement errorMessage = driver.findElement(By.xpath("//div[text()='User not found']"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority = 4)
    public void testLoginPersistence() {
        // reload the page and verify that the user is still logged in
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://example.com/home"));
        Assert.assertEquals(driver.executeScript("return localStorage.getItem('loggedIn')"), "true");
    }

    @Test(priority = 5)
    public void testLogout() {
        // click on the logout button and verify that the user is redirected to the login page and the loggedIn flag is cleared
        WebElement logoutButton = driver.findElement(By.xpath("//button[text()='Logout']"));
        logoutButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://example.com/login"));
        Assert.assertEquals(driver.executeScript("return localStorage.getItem('loggedIn')"), null);
    }
}
*/