package xunit;

public class WasRun extends TestCase {

    private String log = ""; // Collect test log

    public WasRun(final String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.log = "setUp ";
    }

    public void testMethod() {
        // test something

        this.log += "testMethod ";
    }

    public String getLog() {
        return log.trim();
    }
}
