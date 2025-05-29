package com.example;

/**
 * 숫자의 부호를 바꾸는 연산을 담당하는 클래스
 */
public class Flipper {
    
    /**
     * 숫자의 부호를 바꿉니다.
     * 
     * @param number 부호를 바꿀 숫자
     * @return 부호가 바뀐 숫자
     */
    public double flip(double number) {
        return -number;
    }
    
    /**
     * 여러 숫자들의 부호를 바꿉니다.
     * 
     * @param numbers 부호를 바꿀 숫자들
     * @return 부호가 바뀐 숫자들의 배열
     */
    public double[] flip(double... numbers) {
        double[] result = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = -numbers[i];
        }
        return result;
    }
    
    /**
     * 숫자의 절댕값을 반환합니다.
     * 
     * @param number 절댕값을 구할 숫자
     * @return 숫자의 절댕값
     */
    public double abs(double number) {
        return Math.abs(number);
    }
}