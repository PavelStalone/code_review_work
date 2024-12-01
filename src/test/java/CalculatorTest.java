import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(3, calculator.add(2, 1));
        assertEquals(-1, calculator.add(1, -2));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void dif() {
        assertEquals(-1, calculator.dif(1, 2));
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(0, calculator.dif(2, 2));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(4, 2));
        assertEquals(0, calculator.div(0, 2));
        assertEquals(0, calculator.div(1, 2));
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(6, calculator.times(3, 2));
        assertEquals(0, calculator.times(3, 0));
        assertEquals(2, calculator.times(-1, -2));
    }

    @Test
    void solver() {
        assertEquals(2, calculator.solver(1, 1));
        assertEquals(2, calculator.solver(-1, -1));
        assertEquals(13, calculator.solver(2, -3));
    }
}
