package xunit;

import java.lang.reflect.Method;

public class TestCase implements Testable {

    protected final String name;

    public TestCase(final String name) {
        this.name = name;
    }

    /**
     * This method is the template method pattern.
     * <p>
     * setUp() can be overridden by subclasses to set up the test fixture.
     */
    public void run(final TestResult testResult) {
        testResult.testStarted();

        setUp();

        try {
            final Method method = this.getClass().getMethod(name);
            method.invoke(this);
        } catch (final Exception e) {
            testResult.testFailed();
        }

        tearDown();
    }

    public void setUp() {
        // Subclasses can override this method to perform any necessary setup operations.
    }

    public void tearDown() {
        // Subclasses can override this method to perform any necessary cleanup operations.
    }
}
