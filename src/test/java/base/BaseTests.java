package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Web page URL
        driver.get("https://the-internet.herokuapp.com/");

        //Find and Print menu elements.
        //driver.findElement(By.linkText("Shifting Content")).click();
        //driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
        //List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        //System.out.println("Number of menu items: " + menuItems.size());


        //Find element by List
        //List<WebElement> link = driver.findElements(By.tagName("a"));
        //System.out.println(link.size());

        //Find Elements BY Singular
        //WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        //inputsLink.click();

        //WebDriver command to modify the window size maximize, fullscreen, setSize(new Dimension()).
        //driver.manage().window().setSize(new Dimension(375,812));

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
