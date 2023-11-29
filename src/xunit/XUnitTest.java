package xunit;

import java.util.Set;

public class XUnitTest {

    public static void main(String[] args) {
        final Set<String> testMethods = Set.of(
                "testTemplateMethod",
                "testResult",
                "testFailedResultFormatting",
                "testFailedResult"
        );

        for (String testMethod : testMethods) {
            final TestResult testResult = new TestCaseTest(testMethod).run();

            System.out.println(testMethod + "\n\t -> " + testResult.getSummary());
        }
    }
}
