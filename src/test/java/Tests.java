
import com.internship.Browser;
import com.internship.Pages;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void loginTest() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }
    @Test
    public void validLogin() {
        Pages.pathPages().goTo();
        Pages.pathPages().validLogin();
        Assert.assertTrue(Pages.pathPages().isAt());
    }
    @Test
    public void validRegistration() throws InterruptedException {
        Pages.validRegistration().goTo();
        Pages.validRegistration().validRegistration();
        Assert.assertTrue(Pages.validRegistration().isAt());
    }
    @Test
    public void addToCart() throws InterruptedException {
        Pages.addToCart().goTo();
        Pages.addToCart().addProductToCart();
        //Assert.assertTrue(Pages.addToCart().isAt());
    }
    //@AfterClass
    //public static void  cleanUp() {
    //Browser.close();
    //}
}
