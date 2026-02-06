package tests;
import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.*;

@Listeners(utils.TestListener.class)
public class LoginTest extends BaseTest {
@Test
public void validLogin(){
LoginPage lp=new LoginPage(driver);
lp.login("hyrenet+bugathon@guvi.in","hyrenettest@123");
}
}
