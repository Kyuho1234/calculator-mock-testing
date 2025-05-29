package com.example;

/**
 * 메인 계산기 클래스
 * 모든 연산자들을 통합하여 관리합니다.
 */
public class Calculator {
    
    private final Adder adder;
    private final Subtractor subtractor;
    private final Multiplier multiplier;
    private final Divider divider;
    private final Flipper flipper;
    
    /**
     * 기본 생성자 - 모든 연산자를 초기화합니다.
     */
    public Calculator() {
        this.adder = new Adder();
        this.subtractor = new Subtractor();
        this.multiplier = new Multiplier();
        this.divider = new Divider();
        this.flipper = new Flipper();
    }
    
    /**
     * 의존성 주입을 위한 생성자
     */
    public Calculator(Adder adder, Subtractor subtractor, Multiplier multiplier, 
                     Divider divider, Flipper flipper) {
        this.adder = adder;
        this.subtractor = subtractor;
        this.multiplier = multiplier;
        this.divider = divider;
        this.flipper = flipper;
    }
    
    // 덫셈
    public double add(double a, double b) {
        return adder.add(a, b);
    }
    
    public double add(double... numbers) {
        return adder.add(numbers);
    }    
    // 뺄셈
    public double subtract(double a, double b) {
        return subtractor.subtract(a, b);
    }
    
    public double subtract(double... numbers) {
        return subtractor.subtract(numbers);
    }
    
    // 곱셈
    public double multiply(double a, double b) {
        return multiplier.multiply(a, b);
    }
    
    public double multiply(double... numbers) {
        return multiplier.multiply(numbers);
    }
    
    // 나눗셈
    public double divide(double a, double b) {
        return divider.divide(a, b);
    }
    
    public double divide(double... numbers) {
        return divider.divide(numbers);
    }
    
    // 부호 변경
    public double flip(double number) {
        return flipper.flip(number);
    }
    
    public double[] flip(double... numbers) {
        return flipper.flip(numbers);
    }
    
    // Getter 메서드들 (테스트에서 Mock 객체 검증용)
    public Adder getAdder() { return adder; }
    public Subtractor getSubtractor() { return subtractor; }
    public Multiplier getMultiplier() { return multiplier; }
    public Divider getDivider() { return divider; }
    public Flipper getFlipper() { return flipper; }
}