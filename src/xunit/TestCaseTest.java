package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testTemplateMethod() {
        final WasRun wasRun = new WasRun("testMethod");

        wasRun.run();

        Assert.assertEquals("setUp testMethod tearDown", wasRun.getLog());
    }

    public void testResult() {
        final WasRun wasRun = new WasRun("testMethod");

        final TestResult result = wasRun.run();

        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResultFormatting() {
        final TestResult result = new TestResult();

        result.testStarted();
        result.testFailed();

        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    public void testFailedResult() {
        final WasRun wasRun = new WasRun("testBrokenMethod");

        final TestResult result = wasRun.run();

        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    // TODO: If there is no test method matching name, is it guaranteed that tearDown() is run?
}
