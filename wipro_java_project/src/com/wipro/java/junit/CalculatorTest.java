package com.wipro.java.junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    // Initializing Calculator before each test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
