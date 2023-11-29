package xunit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestSuite implements Testable {

    private final Set<Testable> tests = new HashSet<>();

    public TestSuite() {
    }

    public TestSuite(final Class<? extends TestCase> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(method -> Objects.nonNull(method.getAnnotation(Test.class)))
                .forEach(method -> {
                    try {
                        add(testClass.getConstructor(String.class).newInstance(method.getName()));
                    } catch (final Exception e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public void add(final Testable test) {
        this.tests.add(test);
    }

    /**
     * Collecting parameter pattern.
     */
    public void run(final TestResult testResult) {
        for (Testable test : tests) {
            test.run(testResult);
        }
    }
}
