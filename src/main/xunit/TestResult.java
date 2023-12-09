package xunit;

public class TestResult {

    private int runCount = 0;
    private int errorCount = 0;

    public void testStarted() {
        runCount++;
    }

    // TODO: Log failed test method names and causes.
    public void testFailed() {
        errorCount++;
    }

    public String getSummary() {
        return runCount + " run, " + errorCount + " failed";
    }
}
