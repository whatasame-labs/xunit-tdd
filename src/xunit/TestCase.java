package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

    protected final String name;

    public TestCase(final String name) {
        this.name = name;
    }

    /**
     * This method is the template method pattern.
     * <p>
     * setUp() can be overridden by subclasses to set up the test fixture.
     */
    public void run() {
        setUp();

        try {
            final Method method = this.getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
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
