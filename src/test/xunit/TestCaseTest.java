package xunit;

/**
 * The TestCaseTest class is used to test the functionality of the TestCase class and its related classes.
 * <p>
 * This is similar to JUnit Runner. It means it is test of xUnit framework itself and represents TDD cycle. @Test
 * annotation is used for XUnitTest to run entire project.
 */
public class TestCaseTest extends TestCase {

    public TestCaseTest(final String testMethodName) {
        super(testMethodName);
    }

    // --- Testing TestCase ---

    @Test
    public void runSuccessfully() {
        final WasRun wasRun = new WasRun("testMethod");

        final TestResult result = new TestResult();
        wasRun.run(result);

        Asserts.assertEquals("1 run, 0 failed", result.getSummary());
    }

    @Test
    public void runFailed() {
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

    // --- Testing TestResult ---

    @Test
    public void testResultFormatting() {
        final TestResult result = new TestResult();

        result.testStarted();
        result.testFailed();

        Asserts.assertEquals("1 run, 1 failed", result.getSummary());
    }
}
