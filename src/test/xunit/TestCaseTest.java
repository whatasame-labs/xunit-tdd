package xunit;

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

        Asserts.assertEquals("setUp testMethod tearDown", wasRun.getLog());
    }

    @Test
    public void runResult() {
        final WasRun wasRun = new WasRun("testMethod");

        final TestResult result = new TestResult();
        wasRun.run(result);

        Asserts.assertEquals("1 run, 0 failed", result.getSummary());
    }

    @Test
    public void failedResultFormatting() {
        final TestResult result = new TestResult();

        result.testStarted();
        result.testFailed();

        Asserts.assertEquals("1 run, 1 failed", result.getSummary());
    }

    @Test
    public void failedResult() {
        final WasRun wasRun = new WasRun("testBrokenMethod");

        final TestResult result = new TestResult();
        wasRun.run(result);

        Asserts.assertEquals("1 run, 1 failed", result.getSummary());
    }

    // TODO: If there is no test method matching name, is it guaranteed that tearDown() is run?

    @Test
    public void runSuite() {
        final TestSuite suite = new TestSuite();

        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));

        final TestResult result = new TestResult();
        suite.run(result);

        Asserts.assertEquals("2 run, 1 failed", result.getSummary());
    }
}
