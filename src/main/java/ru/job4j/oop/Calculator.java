package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(minus(2));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(4));
        System.out.println(calculator.divide(40));
        System.out.println(calculator.sumAllOperation(3));
    }
}
