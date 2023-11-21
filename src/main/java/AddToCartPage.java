import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase{
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    By addBackpackToCartBy = By.id("add-to-cart-sauce-labs-backpack");
    WebElement addBackpackToCartElement = driver.findElement(addBackpackToCartBy);

    By addBikeLightToCartBy = By.id("add-to-cart-sauce-labs-bike-light");
    WebElement addBikeLightToCartElement = driver.findElement(addBikeLightToCartBy);

    By addTShirtToCartBy = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    WebElement addTShirtToCartElement = driver.findElement(addTShirtToCartBy);

    @FindBy (css = ".shopping_cart_badge")
    public WebElement checkProductsAddedSuccessfully;

    public void userAddProductToCart()
    {
        clickButton(addBackpackToCartElement);
        clickButton(addBikeLightToCartElement);
        clickButton(addTShirtToCartElement);
    }

}
