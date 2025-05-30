package com.example;

/**
 * 덧셈 연산을 담당하는 클래스
 */
public class Adder {
    
    /**
     * 두 숫자를 더합니다.
     * 
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return a + b의 결과
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * 여러 숫자를 더합니다.
     * 
     * @param numbers 더할 숫자들
     * @return 모든 숫자의 합
     */
    public double add(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}