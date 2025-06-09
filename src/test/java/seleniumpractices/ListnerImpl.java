package seleniumpractices;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImpl implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test case started " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case success " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case failed " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

//	@Override
//	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
//		// TODO Auto-generated method stub
//		ISuite suite = suites.get(0);
//		Map<String, Collection<ITestNGMethod>> methodsByGroup = suite.getMethodsByGroups();
//		Map<String, ISuiteResult> tests = suite.getResults();
//		for (String key : tests.keySet()) {
//			System.out.println("Key: " + key + ", Value: " + tests.get(key));
//		}
//		Collection<ISuiteResult> suiteResults = tests.values();
//		ISuiteResult suiteResult = suiteResults.iterator().next();
//		ITestContext testContext = suiteResult.getTestContext();
//		Collection<ITestNGMethod> perfMethods = methodsByGroup.get("regression");
//		IResultMap failedTests = testContext.getFailedTests();
//		for (ITestNGMethod perfMethod : perfMethods) {
//			Set<ITestResult> testResultSet = failedTests.getResults(perfMethod);
//			for (ITestResult testResult : testResultSet) {
//				System.out.println("Test " + testResult.getName() + " failed, error " + testResult.getThrowable());
//			}
//		}
//		IResultMap passedTests = testContext.getPassedTests();
//		for (ITestNGMethod perfMethod : perfMethods) {
//			Set<ITestResult> testResultSet = passedTests.getResults(perfMethod);
//			for (ITestResult testResult : testResultSet) {
//				System.out.println("Test " + testResult.getName() + " passed, time took "
//						+ (testResult.getEndMillis() - testResult.getStartMillis()));
//			}
//		}
//
//	}
//
//	@Override
//	public IReporterConfig getConfig() {
//		// TODO Auto-generated method stub
//		return IReporter.super.getConfig();
//	}

}
