package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testRunning() {
        final WasRun wasRun = new WasRun("testMethod");

        Assert.assertEquals(false, wasRun.wasRun()); // OK
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasRun()); // OK
    }
}
