package com.example;

/**
 * 뺄셈 연산을 담당하는 클래스
 */
public class Subtractor {
    
    /**
     * 두 숫자를 뺄니다.
     * 
     * @param a 첫 번째 숫자 (피감수)
     * @param b 두 번째 숫자 (감수)
     * @return a - b의 결과
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * 첫 번째 숫자에서 나머지 숫자들을 차례로 뺄니다.
     * 
     * @param numbers 첫 번째는 피감수, 나머지는 감수들
     * @return 연산 결과
     */
    public double subtract(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}