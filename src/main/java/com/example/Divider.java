package com.example;

/**
 * 나눗셈 연산을 담당하는 클래스
 */
public class Divider {
    
    /**
     * 두 숫자를 나눅니다.
     * 
     * @param a 첫 번째 숫자 (피제수)
     * @param b 두 번째 숫자 (제수)
     * @return a / b의 결과
     * @throws ArithmeticException 0으로 나누려고 할 때
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
    
    /**
     * 첫 번째 숫자를 나머지 숫자들로 차례로 나눅니다.
     * 
     * @param numbers 첫 번째는 피제수, 나머지는 제수들
     * @return 연산 결과
     * @throws ArithmeticException 0으로 나누려고 할 때
     */
    public double divide(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            result /= numbers[i];
        }
        return result;
    }
}