package xunit;

public class WasRun extends TestCase {

    private boolean wasRun; // Collect test was run

    public WasRun(final String name) {
        super(name);

        this.wasRun = false;
    }

    public boolean wasRun() {
        return wasRun;
    }

    public void testMethod() {
        this.wasRun = true;
    }
}
