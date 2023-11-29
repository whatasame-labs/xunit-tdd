package xunit;

public class XUnitTest {

    public static void main(String[] args) {
        final TestSuite testSuite = TestCaseTest.suite();
        final TestResult testResult = new TestResult();

        testSuite.run(testResult);

        System.out.println(testResult.getSummary());

        // ---

        final TestSuite testSuite2 = new TestSuite();
        testSuite2.add(new TestCaseTest("testTemplateMethod"));
        testSuite2.add(new TestCaseTest("testResult"));
        testSuite2.add(testSuite); // Composite pattern

        final TestResult testResult2 = new TestResult();
        testSuite2.run(testResult2);

        System.out.println(testResult2.getSummary());
    }
}
