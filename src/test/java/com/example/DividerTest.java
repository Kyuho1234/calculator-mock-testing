package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest {

    private Divider divider;
    
    @BeforeEach
    void setUp() {
        divider = new Divider();
    }
    
    @Test
    void testDivide_TwoNumbers() {
        assertEquals(2.5, divider.divide(5.0, 2.0));
        assertEquals(-2.5, divider.divide(-5.0, 2.0));
        assertEquals(2.5, divider.divide(-5.0, -2.0));
        assertEquals(0.0, divider.divide(0.0, 5.0));
    }
    
    @Test
    void testDivide_ByZero() {
        assertThrows(ArithmeticException.class, () -> divider.divide(5.0, 0.0));
        assertThrows(ArithmeticException.class, () -> divider.divide(-5.0, 0.0));
    }
    
    @Test
    void testDivide_MultipleNumbers() {
        assertEquals(0.5, divider.divide(8.0, 2.0, 2.0, 4.0));
        assertEquals(0.0, divider.divide());
        assertEquals(10.0, divider.divide(10.0));
        
        assertThrows(ArithmeticException.class, () -> divider.divide(10.0, 2.0, 0.0));
    }
}