package com.example;

/**
 * Calculator 클래스의 기능을 시연하는 데모 클래스
 */
public class CalculatorDemo {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("=== Calculator Demo ===");
        
        // 덭셈 테스트
        System.out.println("덭셈 테스트:");
        System.out.println("5 + 3 = " + calculator.add(5.0, 3.0));
        System.out.println("1 + 2 + 3 + 4 + 5 = " + calculator.add(1.0, 2.0, 3.0, 4.0, 5.0));
        
        // 뺄셈 테스트
        System.out.println("\n뺄셈 테스트:");
        System.out.println("10 - 4 = " + calculator.subtract(10.0, 4.0));
        System.out.println("20 - 5 - 3 = " + calculator.subtract(20.0, 5.0, 3.0));
        
        // 곱셈 테스트
        System.out.println("\n곱셈 테스트:");
        System.out.println("7 × 6 = " + calculator.multiply(7.0, 6.0));
        System.out.println("2 × 3 × 4 = " + calculator.multiply(2.0, 3.0, 4.0));
        
        // 나눗셈 테스트
        System.out.println("\n나눗셈 테스트:");
        System.out.println("20 ÷ 4 = " + calculator.divide(20.0, 4.0));
        System.out.println("100 ÷ 2 ÷ 5 = " + calculator.divide(100.0, 2.0, 5.0));
        
        // 부호 변경 테스트
        System.out.println("\n부호 변경 테스트:");
        System.out.println("flip(15) = " + calculator.flip(15.0));
        System.out.println("Math.abs(-25) = " + Math.abs(-25.0));
        
        // 복합 연산 테스트
        System.out.println("\n복합 연산 테스트:");
        double result = calculator.add(
            calculator.multiply(2.0, 3.0),
            calculator.divide(8.0, 2.0)
        );
        System.out.println("(2 × 3) + (8 ÷ 2) = " + result);
        
        System.out.println("\n=== Demo 완료 ===");
    }
}