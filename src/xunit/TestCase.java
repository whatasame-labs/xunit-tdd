package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

    protected final String name;

    public TestCase(final String name) {
        this.name = name;
    }

    public void run() {
        try {
            final Method method = this.getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("No such method: " + name, e);
        }
    }
}
