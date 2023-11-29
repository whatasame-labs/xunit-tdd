package xunit;

public class XUnitTest {

    public static void main(String[] args) {
        final WasRun wasRun = new WasRun();

        System.out.println(wasRun.wasRun()); // false
        wasRun.testMethod();
        System.out.println(wasRun.wasRun()); // true
    }
}
