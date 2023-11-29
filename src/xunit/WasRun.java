package xunit;

public class WasRun extends TestCase {

    private boolean wasRun = false; // Collect test was run
    private boolean wasSetUp = false; // Collect test was set up

    public WasRun(final String name) {
        super(name);
    }

    public void testMethod() {
        this.wasRun = true;
    }

    @Override
    public void setUp() {
        this.wasSetUp = true;
    }

    public boolean isWasRun() {
        return wasRun;
    }

    public boolean isWasSetUp() {
        return wasSetUp;
    }
}
