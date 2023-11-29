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
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.getLog());
    }

    public void testSetUp() {
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.getLog());
    }
}
