import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    LoginPage loginObject;

    @Test
    public void userCanLoginTest()
    {
        loginObject = new LoginPage(driver);
        loginObject.userCanLoginIn("standard_user", "secret_sauce");

        Assert.assertTrue(loginObject.checkLoginSuccessfullyElement.getText().contains("Products"));

    }
}
