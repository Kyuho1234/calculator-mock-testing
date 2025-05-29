package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    private Adder adder;
    
    @BeforeEach
    void setUp() {
        adder = new Adder();
    }
    
    @Test
    void testAdd_TwoNumbers() {
        assertEquals(8.0, adder.add(5.0, 3.0));
        assertEquals(0.0, adder.add(-5.0, 5.0));
        assertEquals(-8.0, adder.add(-5.0, -3.0));
        assertEquals(5.5, adder.add(2.5, 3.0));
    }
    
    @Test
    void testAdd_MultipleNumbers() {
        assertEquals(15.0, adder.add(1.0, 2.0, 3.0, 4.0, 5.0));
        assertEquals(0.0, adder.add());
        assertEquals(10.0, adder.add(10.0));
        assertEquals(-5.0, adder.add(-2.0, -3.0));
    }
    
    @Test
    void testAdd_EdgeCases() {
        assertEquals(Double.MAX_VALUE, adder.add(Double.MAX_VALUE, 0.0));
        assertEquals(Double.MIN_VALUE, adder.add(Double.MIN_VALUE, 0.0));
        assertTrue(Double.isInfinite(adder.add(Double.MAX_VALUE, Double.MAX_VALUE)));
    }
}