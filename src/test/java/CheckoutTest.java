import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckoutTest extends TestBase{

    CheckoutPage checkoutObject;

    @Test
    public void openCheckoutPageTest()
    {
        checkoutObject = new CheckoutPage(driver);

        checkoutObject.openCheckoutPage();
        checkoutObject.clickCheckoutButton();
        checkoutObject.fillDataForUserToCheckout("Mahmoud", "Refat", "71652");

        String productPrice = checkoutObject.checkProductsPrice.getText();
        String tax = checkoutObject.checkTax.getText();
        String totalPrice = checkoutObject.checkTotalPrice.getText();
        System.out.println(productPrice + "\n" + tax + "\n" + totalPrice);

        checkoutObject.finishCheckout();

        Assert.assertTrue(checkoutObject.checkoutSuccessfullyMSG.getText().contains("Thank you for your order!"));
    }

}
