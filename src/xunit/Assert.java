package xunit;

import java.util.Objects;

// TODO: rename to Assertions
public class Assert {

    public static void assertEquals(final Object expected, final Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }
}
