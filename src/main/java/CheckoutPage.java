import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    By shoppingCartBy = By.id("shopping_cart_container");
    WebElement shoppingCartElement = driver.findElement(shoppingCartBy);

    @FindBy(css = ".btn.btn_action.btn_medium.checkout_button ")
    WebElement checkoutButtonElement;

    @FindBy(id = "first-name")
    WebElement firstNameFieldElement;

    @FindBy(id = "last-name")
    WebElement lastNameFieldElement;

    @FindBy(id = "postal-code")
    WebElement postalCodeFieldElement;

    @FindBy(id = "continue")
    WebElement continueButtonElement;

    @FindBy(id = "finish")
    WebElement finishButtonElement;

    @FindBy(css = ".complete-header")
    public WebElement checkoutSuccessfullyMSG;

    @FindBy(css = ".summary_subtotal_label")
    public WebElement checkProductsPrice;

    @FindBy(css = ".summary_tax_label")
    public WebElement checkTax;

    @FindBy(css = ".summary_info_label.summary_total_label")
    public WebElement checkTotalPrice;

    public void openCheckoutPage()
    {
        clickButton(shoppingCartElement);
    }

    public void clickCheckoutButton()
    {
        clickButton(checkoutButtonElement);
    }

    public void fillDataForUserToCheckout(String firstName, String lastName, String postalCode)
    {
        setTextElement(firstNameFieldElement, firstName);
        setTextElement(lastNameFieldElement, lastName);
        setTextElement(postalCodeFieldElement, postalCode);
        clickButton(continueButtonElement);
    }

    public void finishCheckout()
    {
        clickButton(finishButtonElement);
    }
}