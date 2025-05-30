package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Calculator 클래스의 Mock 단위 테스트
 * 각 연산자 클래스들을 Mock으로 대체하여 테스트합니다.
 */
@ExtendWith(MockitoExtension.class)
class CalculatorMockTest {

    @Mock
    private Adder mockAdder;
    
    @Mock
    private Subtractor mockSubtractor;
    
    @Mock
    private Multiplier mockMultiplier;
    
    @Mock
    private Divider mockDivider;
    
    @Mock
    private Flipper mockFlipper;
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator(mockAdder, mockSubtractor, mockMultiplier, 
                                   mockDivider, mockFlipper);
    }
    
    @Test
    void testAdd_ShouldCallAdderAdd() {
        // Given
        double a = 5.0;
        double b = 3.0;
        double expected = 8.0;
        when(mockAdder.add(a, b)).thenReturn(expected);
        
        // When
        double result = calculator.add(a, b);
        
        // Then
        assertEquals(expected, result);
        verify(mockAdder, times(1)).add(a, b);
    }
    
    @Test
    void testSubtract_ShouldCallSubtractorSubtract() {
        // Given
        double a = 10.0;
        double b = 4.0;
        double expected = 6.0;
        when(mockSubtractor.subtract(a, b)).thenReturn(expected);
        
        // When
        double result = calculator.subtract(a, b);
        
        // Then
        assertEquals(expected, result);
        verify(mockSubtractor, times(1)).subtract(a, b);
    }
    
    @Test
    void testMultiply_ShouldCallMultiplierMultiply() {
        // Given
        double a = 7.0;
        double b = 6.0;
        double expected = 42.0;
        when(mockMultiplier.multiply(a, b)).thenReturn(expected);
        
        // When
        double result = calculator.multiply(a, b);
        
        // Then
        assertEquals(expected, result);
        verify(mockMultiplier, times(1)).multiply(a, b);
    }
    
    @Test
    void testDivide_ShouldCallDividerDivide() {
        // Given
        double a = 20.0;
        double b = 4.0;
        double expected = 5.0;
        when(mockDivider.divide(a, b)).thenReturn(expected);
        
        // When
        double result = calculator.divide(a, b);
        
        // Then
        assertEquals(expected, result);
        verify(mockDivider, times(1)).divide(a, b);
    }
    
    @Test
    void testFlip_ShouldCallFlipperFlip() {
        // Given
        double number = 15.0;
        double expected = -15.0;
        when(mockFlipper.flip(number)).thenReturn(expected);
        
        // When
        double result = calculator.flip(number);
        
        // Then
        assertEquals(expected, result);
        verify(mockFlipper, times(1)).flip(number);
    }
    
}
