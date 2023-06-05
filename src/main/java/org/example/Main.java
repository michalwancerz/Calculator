package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,105));
        System.out.println(calculator.sub(6, 5.5));
        System.out.println(calculator.multi(2, 8));
        System.out.println(calculator.division(10, 5));
    }
}