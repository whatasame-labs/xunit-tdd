package xunit;

public class TestCaseTest extends TestCase {

    private WasRun wasRun;

    public TestCaseTest(final String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.wasRun = new WasRun("testMethod");
    }

    public void testRunning() {
        Assert.assertEquals(false, wasRun.isWasRun());
        wasRun.run();
        Assert.assertEquals(true, wasRun.isWasRun());
    }

    public void testSetUp() {
        Assert.assertEquals(false, wasRun.isWasSetUp());
        wasRun.run();
        Assert.assertEquals(true, wasRun.isWasSetUp());
    }
}
