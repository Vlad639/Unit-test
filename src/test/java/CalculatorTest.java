import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumCheckDouble() {
        double rez = Calculator.sum(76.347, 23.653);
        assertEquals(10, rez);
    }

    @Test
    void sumCheckPrecision() {
        double rez = Calculator.sum(7.5708, 3.7854);
        assertEquals(11.3562, rez);
    }
    //-------------------------

    @Test
    void subCheckDouble() {
        double rez = Calculator.sub(5.25, 0.62);
        assertEquals(4.63, rez);
    }

    @Test
    void subCheckPrecision() {
        double rez = Calculator.sub(5, 4.99);
        assertEquals(0.01, rez);
    }
    //------------------------
    @Test
    void mulCheckDouble() {
        double rez = Calculator.mul(23.45, 0.62);
        assertEquals(14.539, rez);
    }

    @Test
    void mulCheckPrecision() {
        double rez = Calculator.mul(5, 2.39);
        assertEquals(11.95, rez);
    }
    //---------------

    @Test
    void divCheckDouble() {
        double rez = Calculator.div(8.5, 2);
        assertEquals(4.25, rez);
    }

    @Test
    void divCheckPrecision() {
        double rez = Calculator.div(8, 3, 4);
        assertEquals(2.6667, rez);
    }

    @Test
    void divZeroCheck() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.div(8, 0); }
            );
    }

}