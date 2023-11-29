package xunit;

public class TestCaseTest extends TestCase {

    public TestCaseTest(final String name) {
        super(name);
    }

    public void testRunning() {
        final WasRun wasRun = new WasRun("testMethod");

        System.out.println(wasRun.wasRun()); // false
        wasRun.run();
        System.out.println(wasRun.wasRun()); // true
    }
}
