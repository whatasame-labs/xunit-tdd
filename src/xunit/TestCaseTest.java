package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testRunning() {
        final WasRun wasRun = new WasRun("testMethod");

        Assert.assertEquals(false, wasRun.isWasRun());
        wasRun.run();
        Assert.assertEquals(true, wasRun.isWasRun());
    }

    public void testSetUp() {
        final WasRun wasRun = new WasRun("testMethod");

        Assert.assertEquals(false, wasRun.isWasSetUp());
        wasRun.run();
        Assert.assertEquals(true, wasRun.isWasSetUp());
    }
}
