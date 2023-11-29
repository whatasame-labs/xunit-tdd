package xunit;

import java.util.HashSet;
import java.util.Set;

public class TestSuite implements Test {

    private final Set<Test> tests = new HashSet<>();

    public void add(final Test test) {
        this.tests.add(test);
    }

    /**
     * Collecting parameter pattern.
     */
    public void run(final TestResult testResult) {
        for (Test test : tests) {
            test.run(testResult);
        }
    }
}
