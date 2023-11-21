import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By userNameBy = By.id("user-name");
    WebElement userNameElement = driver.findElement(userNameBy);

    By passwordBy = By.id("password");
    WebElement passwordElement = driver.findElement(passwordBy);

    By loginButtonBy = By.id("login-button");
    WebElement loginButtonElement = driver.findElement(loginButtonBy);

    @FindBy(css = ".title")
    WebElement checkLoginSuccessfullyElement;

    public void userCanLoginIn(String userName, String password)
    {
        setTextElement(userNameElement, userName);
        setTextElement(passwordElement, password);
        clickButton(loginButtonElement);
    }
}
