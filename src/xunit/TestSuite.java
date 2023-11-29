package xunit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSuite implements Test {

    private final Set<Test> tests = new HashSet<>();

    public TestSuite() {
    }

    public TestSuite(final Class<? extends TestCase> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(method -> method.getName().startsWith("test"))
                .forEach(method -> {
                    try {
                        add(testClass.getConstructor(String.class).newInstance(method.getName()));
                    } catch (final Exception e) {
                        throw new RuntimeException(e);
                    }
                });
    }

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
