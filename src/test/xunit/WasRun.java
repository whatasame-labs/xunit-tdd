package xunit;

/**
 * The WasRun class is a subclass of TestCase and represents a test case that can be run. It contains methods to set up
 * the test fixture, tear down the test fixture, and perform test methods.
 * <p>
 * This is similar to JUnit's each test class.
 */
public class WasRun extends TestCase {

    private static int num1;
    private static int num2;
    private static int sum = 0;

    public WasRun(final String testMethodName) {
        super(testMethodName);
    }

    @Override
    public void setUp() {
        num1 = 100;
        num2 = 0;
    }

    @Override
    public void tearDown() {
        sum = 0;
    }

    @Test
    public void testMethod() {
        /* given */
        num2 = 200;

        /* then */
        sum += num1;
        sum += num2;

        /* when */
        Asserts.assertEquals(300, sum);
    }

    @Test
    public void testBrokenMethod() {
        /* given */
        num2 = 200;

        /* then */
        sum += num1;
        sum += num2;

        /* when */
        Asserts.assertEquals(777, sum); // Wrong assertion
    }
}
