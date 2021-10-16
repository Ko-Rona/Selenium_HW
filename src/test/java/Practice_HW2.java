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
        List<WebElement> elements = wd.findElements(By.cssSelector("tr:nth-child(4)"));

        for(WebElement e: elements){
            System.out.println(e.getText());
        }

        WebElement e = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        String t = e.getText();
        System.out.println(t);

        Assert.assertTrue(elements.get(0).getText().contains("Mexico"));
        Assert.assertEquals(t,"Francisco Chang");
    }

    @Test
    public void tableHW2(){
        List<WebElement> el = wd.findElements(By.cssSelector("tr"));
        System.out.println("Numbers of rows = " + el.size());
        System.out.println("-----------------------------");


        List<WebElement> el2 = wd.findElements(By.cssSelector("th"));
        System.out.println("Numbers of columns = " + el2.size());
        System.out.println("-----------------------------");


        List<WebElement> el3 = wd.findElements(By.cssSelector("tr:nth-child(3)"));
        for(WebElement e: el3){
            System.out.println(e.getText());
        }
        System.out.println("-----------------------------");

        List<WebElement> el4 = wd.findElements(By.cssSelector("tr td:nth-child(3n)"));
        for(WebElement e: el4){
            System.out.println(e.getText());
        }
        System.out.println("-----------------------------");

        WebElement el5 = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println(el5.getText());
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
