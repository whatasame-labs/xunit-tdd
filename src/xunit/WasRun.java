package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun {

    private final String name;
    private boolean wasRun; // Collect test was run

    public WasRun(final String name) {
        this.wasRun = false;
        this.name = name;
    }

    public boolean wasRun() {
        return wasRun;
    }

    public void run() {
        try {
            final Method method = this.getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("No such method: " + name, e);
        }
    }

    public void testMethod() {
        this.wasRun = true;
    }
}
