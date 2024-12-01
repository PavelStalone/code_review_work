/**
 * Simple calculator class for basic arithmetic operations
 */
public class Calculator {

    /**
     * Adds two numbers
     *
     * @param a first number
     * @param b second number
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers
     *
     * @param a first number
     * @param b second number
     */
    public int dif(int a, int b) {
        return a - b;
    }

    /**
     * Divides two numbers
     *
     * @param a first number
     * @param b second number
     */
    public int div(int a, int b) {
        return a / b;
    }

    /**
     * Multiplies two numbers
     *
     * @param a first number
     * @param b second number
     */
    public int times(int a, int b) {
        return a * b;
    }

    /**
     * Calculates a^2 + b^2
     *
     * @param a first number
     * @param b second number
     */
    public int solver(int a, int b) {
        return add(times(a, a), times(b, b));
    }
}
