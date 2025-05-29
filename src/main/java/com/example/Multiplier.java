package com.example;

/**
 * 곱셈 연산을 담당하는 클래스
 */
public class Multiplier {
    
    /**
     * 두 숫자를 곱합니다.
     * 
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return a * b의 결과
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * 여러 숫자를 곱합니다.
     * 
     * @param numbers 곱할 숫자들
     * @return 모든 숫자의 곱
     */
    public double multiply(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }
}