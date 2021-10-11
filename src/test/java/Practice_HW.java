import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Practice_HW {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd= new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }
    @Test
    public void testName() {
        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("active"));
        wd.findElement(By.className("login_login__3EHKB"));


        wd.findElement(By.id("root"));


        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("br"));
        wd.findElement(By.tagName("button"));
        wd.findElement(By.tagName("script"));
        wd.findElement(By.tagName("html"));
        wd.findElement(By.tagName("head"));
        wd.findElement(By.tagName("body"));
        wd.findElement(By.tagName("!DOCTYPE"));
        
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("HO"));
        wd.findElement(By.partialLinkText("ABO"));
        wd.findElement(By.partialLinkText("GIN"));

    }

    @AfterMethod
    public void postCondition() {
        wd.close();
        wd.quit();
    }
}



