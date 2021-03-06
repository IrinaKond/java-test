import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class GoogleSearchTest {
    @Test
    public void testName() {
        System.setProperty("webdriver.chrome.driver", "C:\\Ira\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String fullXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String xPath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String selector = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.RNNXgb > div > div.a4bIc > input";

        driver.get("https://google.com/");

        String nameValue = "q";
        WebElement textInput = driver.findElement(By.name(nameValue));
        textInput.sendKeys("Portnov Computer School");
        textInput.submit();

        WebElement statsElement = driver.findElement(By.id("result-stats"));
        String wholeStatsText = statsElement.getText();
        String[] array = wholeStatsText.split(" ");
        String numberOfResults = array[1];
        String replaceComma = numberOfResults.replace(",", "");

        int parsedInteger = Integer.parseInt(replaceComma);

        Assert.assertTrue(parsedInteger > 1000);
    }
}
