import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    // Base driver
    protected WebDriver driver;

    // create constructor to initializing page factory
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Function to send text and fill element field
    protected static void setTextElement(WebElement textElement, String text)
    {
        textElement.sendKeys(text);
    }

    // Function to click on the button
    protected static void clickButton(WebElement button)
    {
        button.click();
    }
}
