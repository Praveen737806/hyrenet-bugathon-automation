package utils;
import org.testng.*;
import com.aventstack.extentreports.*;
public class TestListener implements ITestListener{
ExtentReports extent=ExtentManager.getReport();
ExtentTest test;

public void onTestStart(ITestResult result){
test=extent.createTest(result.getName());
}

public void onTestSuccess(ITestResult result){
test.pass("Passed");
extent.flush();
}

public void onTestFailure(ITestResult result){
test.fail(result.getThrowable());
extent.flush();
}
}
