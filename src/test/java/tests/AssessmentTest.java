package tests;

import base.BaseTest;
import pages.*;
import org.testng.annotations.*;

@Listeners(utils.TestListener.class)
public class AssessmentTest extends BaseTest {

    @Test
    public void createAssessment() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        lp.login("hyrenet+bugathon@guvi.in","hyrenettest@123");

        Thread.sleep(8000); // Dashboard stabilization

        AssessmentPage ap = new AssessmentPage(driver);
        ap.clickCreate();
    }
}
