package xunit;

public class TestResult {

    // TODO: Can not get result before test is run.

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
