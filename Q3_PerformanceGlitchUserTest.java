import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3_PerformanceGlitchUserTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("reset_sidebar_link")).click();

        Select sort = new Select(driver.findElement(By.className("product_sort_container")));
        sort.selectByVisibleText("Name (Z to A)");

        driver.findElement(By.cssSelector(".inventory_item button")).click();

        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("1234");

        driver.findElement(By.id("continue")).click();

        String total = driver.findElement(By.className("summary_total_label")).getText();
        System.out.println(total);

        driver.findElement(By.id("finish")).click();

        String success = driver.findElement(By.className("complete-header")).getText();
        System.out.println(success);

        driver.quit();
    }
}
