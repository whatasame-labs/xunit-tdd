package xunit;

public class WasRun extends TestCase {

    private String log = ""; // Collect test log

    public WasRun(final String testMethodName) {
        super(testMethodName);
    }

    @Override
    public void setUp() {
        this.log = "setUp ";
    }

    @Override
    public void tearDown() {
        this.log += "tearDown";
    }

    public void testMethod() {
        // test something

        this.log += "testMethod ";
    }

    public void testBrokenMethod() {
        throw new RuntimeException();
    }

    public String getLog() {
        return log.trim();
    }
}
