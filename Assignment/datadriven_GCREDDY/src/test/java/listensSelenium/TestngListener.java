package listensSelenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {//alt+shift+s to add all the unimplemented methods. or overriding methods.

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("***************TEST Failure  "+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("***************TEST Skipped  "+result.getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("***************TEST Started  "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("***************TEST SUCCESS  "+result.getName());
	}

}
