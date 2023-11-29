package xunit;

import java.util.HashSet;
import java.util.Set;

public class TestSuite {

    private final Set<TestCase> tests = new HashSet<>();

    public void add(final TestCase test) {
        this.tests.add(test);
    }

    /**
     * Collecting parameter pattern.
     */
    public void run(final TestResult testResult) {
        for (TestCase test : tests) {
            test.run(testResult);
        }
    }
}
