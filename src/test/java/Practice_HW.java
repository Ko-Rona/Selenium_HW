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
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector("div.container"));
        wd.findElement(By.cssSelector("[class = 'container']"));
        wd.findElement(By.cssSelector("[class ^= 'con']"));
        wd.findElement(By.cssSelector("[class $= 'ner']"));
        wd.findElement(By.cssSelector("[class *= 'taine']"));
        wd.findElement(By.cssSelector("div.container"));

        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector("[class = 'navbar-component_nav__1X_4m']"));
        wd.findElement(By.cssSelector("[class ^= 'nav']"));
        wd.findElement(By.cssSelector("[class $= '4m']"));
        wd.findElement(By.cssSelector("[class *= 'component']"));
        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m"));

        wd.findElement(By.className("active"));
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector("a.active"));
        wd.findElement(By.cssSelector("[class = 'active']"));
        wd.findElement(By.cssSelector("[class ^= 'act']"));
        wd.findElement(By.cssSelector("[class $= 'ive']"));
        wd.findElement(By.cssSelector("[class *= 'tiv']"));
        wd.findElement(By.cssSelector("a.active"));
        wd.findElement(By.cssSelector("a[class = active]"));
        wd.findElement(By.cssSelector("a[class = active][aria-current='page']"));
        wd.findElement(By.cssSelector("a[aria-current='page'][href$='gin']"));
        wd.findElement(By.cssSelector("a[aria-current='page'][href$='/login'][style*='border: 1px solid black;']"));


        wd.findElement(By.className("login_login__3EHKB"));
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        wd.findElement(By.cssSelector("div.login_login__3EHKB"));
        wd.findElement(By.cssSelector("[class = 'login_login__3EHKB']"));
        wd.findElement(By.cssSelector("[class ^= 'logi']"));
        wd.findElement(By.cssSelector("[class $= 'HKB']"));
        wd.findElement(By.cssSelector("[class *= 'ogi']"));
        wd.findElement(By.cssSelector("div.login_login__3EHKB"));
        wd.findElement(By.cssSelector("div[class*='login_login__3EHKB']"));
        wd.findElement(By.cssSelector("div[class^='log']"));
        wd.findElement(By.cssSelector("div[class$='EHKB']"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("div#root"));
        wd.findElement(By.cssSelector("[id = 'root']"));
        wd.findElement(By.cssSelector("[id ^= 'ro']"));
        wd.findElement(By.cssSelector("[id $= 'ot']"));
        wd.findElement(By.cssSelector("[id *= 'oo']"));
        wd.findElement(By.cssSelector("[id *= 'oo'][class*='taine']"));
        wd.findElement(By.cssSelector("div[id *= 'oo'][class*='taine']"));
        wd.findElement(By.cssSelector("div[id $= 'ot'][class$='ner']"));

        wd.findElement(By.tagName("div"));
        wd.findElement(By.cssSelector("div"));

        wd.findElement(By.tagName("h1"));
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("div[class='navbar-component_nav__1X_4m'] h1"));

        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("a[href='/home']"));
        wd.findElement(By.cssSelector("a[href='/about']"));
        wd.findElement(By.cssSelector("a[class='active'][href='/login']"));

        wd.findElement(By.tagName("input"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("input[placeholder='Email']"));
        wd.findElement(By.cssSelector("input[placeholder='Password']"));

        wd.findElement(By.tagName("br"));
        wd.findElement(By.cssSelector("br"));

        wd.findElement(By.tagName("button"));
        wd.findElement(By.cssSelector("button"));

        wd.findElement(By.tagName("script"));
        wd.findElement(By.cssSelector("script"));

        wd.findElement(By.tagName("html"));
        wd.findElement(By.cssSelector("html"));
        wd.findElement(By.cssSelector("html[lang='en']"));

        wd.findElement(By.tagName("head"));
        wd.findElement(By.cssSelector("head"));

        wd.findElement(By.tagName("body"));
        wd.findElement(By.cssSelector("body"));


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



