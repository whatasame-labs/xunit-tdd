package xunit;

public class WasRun {

    private boolean wasRun; // Collect test was run

    public WasRun() {
        this.wasRun = false;
    }

    public void testMethod() {
        this.wasRun = true;
    }

    public boolean wasRun() {
        return wasRun;
    }
}
