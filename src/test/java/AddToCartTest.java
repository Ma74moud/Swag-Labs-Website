import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase{

    AddToCartPage addProduct;
    @Test
    public void userCanAddToCartTest()
    {
        addProduct = new AddToCartPage(driver);
        addProduct.userAddProductToCart();

        String numberOFProducts = addProduct.checkProductsAddedSuccessfully.getText();
        System.out.println("Number of Products Added to Cart is: " + numberOFProducts);

        Assert.assertEquals(numberOFProducts, "3");
    }
}
