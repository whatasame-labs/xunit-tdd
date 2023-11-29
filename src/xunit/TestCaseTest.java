package xunit;

import xunit.annotation.Test;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public static TestSuite suite() {
        return new TestSuite(TestCaseTest.class);
    }

    @Test
    public void templateMethod() {
        final WasRun wasRun = new WasRun("testMethod");

        final TestResult result = new TestResult();
        wasRun.run(result);

        Assert.assertEquals("setUp testMethod tearDown", wasRun.getLog());
    }

    @Test
    public void runResult() {
        final WasRun wasRun = new WasRun("testMethod");

        final TestResult result = new TestResult();
        wasRun.run(result);

        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    @Test
    public void failedResultFormatting() {
        final TestResult result = new TestResult();

        result.testStarted();
        result.testFailed();

        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    @Test
    public void failedResult() {
        final WasRun wasRun = new WasRun("testBrokenMethod");

        final TestResult result = new TestResult();
        wasRun.run(result);

        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    // TODO: If there is no test method matching name, is it guaranteed that tearDown() is run?

    @Test
    public void runSuite() {
        final TestSuite suite = new TestSuite();

        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));

        final TestResult result = new TestResult();
        suite.run(result);

        Assert.assertEquals("2 run, 1 failed", result.getSummary());
    }
}
