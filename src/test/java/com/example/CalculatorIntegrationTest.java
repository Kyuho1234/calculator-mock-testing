package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Calculator 클래스의 통합 테스트
 * 실제 연산자 객체들을 사용하여 전체 시스템을 테스트합니다.
 */
class CalculatorIntegrationTest {

    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    void testAddition() {
        // 기본 덭셈 테스트
        assertEquals(8.0, calculator.add(5.0, 3.0));
        assertEquals(0.0, calculator.add(-5.0, 5.0));
        assertEquals(-8.0, calculator.add(-5.0, -3.0));
        
        // 여러 숫자 덭셈 테스트
        assertEquals(15.0, calculator.add(1.0, 2.0, 3.0, 4.0, 5.0));
        assertEquals(0.0, calculator.add());
    }
    
    @Test
    void testSubtraction() {
        // 기본 뺄셈 테스트
        assertEquals(2.0, calculator.subtract(5.0, 3.0));
        assertEquals(-10.0, calculator.subtract(-5.0, 5.0));
        assertEquals(-2.0, calculator.subtract(-5.0, -3.0));
        
        // 여러 숫자 뺄셈 테스트
        assertEquals(-13.0, calculator.subtract(1.0, 2.0, 3.0, 4.0, 5.0));
        assertEquals(0.0, calculator.subtract());
    }    
    @Test
    void testMultiplication() {
        // 기본 곱셈 테스트
        assertEquals(15.0, calculator.multiply(5.0, 3.0));
        assertEquals(-25.0, calculator.multiply(-5.0, 5.0));
        assertEquals(15.0, calculator.multiply(-5.0, -3.0));
        assertEquals(0.0, calculator.multiply(5.0, 0.0));
        
        // 여러 숫자 곱셈 테스트
        assertEquals(120.0, calculator.multiply(1.0, 2.0, 3.0, 4.0, 5.0));
        assertEquals(0.0, calculator.multiply());
    }
    
    @Test
    void testDivision() {
        // 기본 나눗셈 테스트
        assertEquals(2.5, calculator.divide(5.0, 2.0));
        assertEquals(-2.5, calculator.divide(-5.0, 2.0));
        assertEquals(2.5, calculator.divide(-5.0, -2.0));
        
        // 0으로 나누기 예외 테스트
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
        
        // 여러 숫자 나눗셈 테스트
        assertEquals(0.2, calculator.divide(10.0, 2.0, 5.0, 5.0));
    }
    
    @Test
    void testFlipping() {
        // 부호 변경 테스트
        assertEquals(-5.0, calculator.flip(5.0));
        assertEquals(5.0, calculator.flip(-5.0));
        assertEquals(0.0, calculator.flip(0.0));
        
        // 여러 숫자 부호 변경 테스트
        double[] input = {1.0, -2.0, 3.0, -4.0};
        double[] expected = {-1.0, 2.0, -3.0, 4.0};
        assertArrayEquals(expected, calculator.flip(input));
    }    
    @Test
    void testComplexCalculations() {
        // 복합 연산 테스트
        double result1 = calculator.add(
            calculator.multiply(2.0, 3.0),
            calculator.divide(8.0, 2.0)
        );
        assertEquals(10.0, result1); // (2*3) + (8/2) = 6 + 4 = 10
        
        double result2 = calculator.subtract(
            calculator.add(10.0, 5.0),
            calculator.multiply(3.0, 2.0)
        );
        assertEquals(9.0, result2); // (10+5) - (3*2) = 15 - 6 = 9
        
        double result3 = calculator.flip(
            calculator.subtract(5.0, 10.0)
        );
        assertEquals(5.0, result3); // flip(5-10) = flip(-5) = 5
    }
    
    @Test
    void testEdgeCases() {
        // 경계값 테스트
        assertEquals(Double.MAX_VALUE, calculator.add(Double.MAX_VALUE, 0.0));
        assertEquals(Double.MIN_VALUE, calculator.add(Double.MIN_VALUE, 0.0));
        
        // NaN 테스트
        assertTrue(Double.isNaN(calculator.divide(0.0, 0.0)));
        
        // 무한대 테스트
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(1.0, 0.0));
        assertEquals(Double.NEGATIVE_INFINITY, calculator.divide(-1.0, 0.0));
    }
}