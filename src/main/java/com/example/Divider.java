package com.example;

/**
 * 나눗셈 연산을 담당하는 클래스
 */
public class Divider {
    
    /**
     * 두 숫자를 나누기
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
}
