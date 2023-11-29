package xunit;

public class XUnitTest {

    public static void main(String[] args) {
        final TestSuite testSuite = TestCaseTest.suite();
        final TestResult testResult = new TestResult();

        testSuite.run(testResult);

        System.out.println(testResult.getSummary()); // TODO: Log failed test method names.
    }
}
