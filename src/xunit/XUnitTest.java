package xunit;

public class XUnitTest {

    public static void main(String[] args) {
        final TestSuite testSuite = new TestSuite();
        testSuite.add(new TestCaseTest("testTemplateMethod"));
        testSuite.add(new TestCaseTest("testResult"));
        testSuite.add(new TestCaseTest("testFailedResultFormatting"));
        testSuite.add(new TestCaseTest("testFailedResult"));
        testSuite.add(new TestCaseTest("testSuite"));

        final TestResult testResult = new TestResult();
        testSuite.run(testResult);

        System.out.println(testResult.getSummary()); // TODO: Log failed test method names.
    }
}
