import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;


public class Practice_HW2 {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd= new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void tableHomeWork(){
        WebElement element = wd.findElement(By.cssSelector("tr:nth-child(4)"));

            System.out.println(element.getText());

        //---------------
        WebElement element2 = wd.findElement(By.xpath("//tr[4]"));
            System.out.println(element2.getText());


        WebElement e = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        String t = e.getText();
        System.out.println(t);
        //-------------
        WebElement e2 = wd.findElement(By.xpath("//td[text()='Francisco Chang']"));
        System.out.println(e2.getText());

        Assert.assertTrue(element.getText().contains("Mexico"));
        Assert.assertEquals(t,"Francisco Chang");
    }

    @Test
    public void tableHW2(){
        List<WebElement> el = wd.findElements(By.cssSelector("tr"));
        System.out.println("Numbers of rows = " + el.size());
        System.out.println("-----------------------------");
        List<WebElement> tr = wd.findElements(By.xpath("//tr"));


        List<WebElement> el2 = wd.findElements(By.cssSelector("th"));
        System.out.println("Numbers of columns = " + el2.size());
        System.out.println("-----------------------------");
        List<WebElement> th = wd.findElements(By.xpath("//th"));

        List<WebElement> el3 = wd.findElements(By.cssSelector("tr:nth-child(3)"));
        for(WebElement e: el3){
            System.out.println(e.getText());
        }
        System.out.println("-----------------------------");
        List<WebElement> tr2 = wd.findElements(By.xpath("//tr[3]"));

        List<WebElement> el4 = wd.findElements(By.cssSelector("tr td:nth-child(3n)"));
        for(WebElement e: el4){
            System.out.println(e.getText());
        }
        System.out.println("-----------------------------");
        List<WebElement>  td = wd.findElements(By.xpath("//tr/td[last()]"));

        WebElement el5 = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println(el5.getText());

        WebElement td2 = wd.findElement(By.xpath("//td[text()='Maria Anders']"));
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
