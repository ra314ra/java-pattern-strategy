package com.ra314ra.pattern.strategy;

public class Calculator {
    public Strategy strategy;

    public int calculate(int x, int y) {
        return strategy.compute(x, y);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.setStrategy(Strategy.PLUS);
        System.out.println(calc.calculate(6, 7));
        calc.setStrategy(Strategy.MINUS);
        System.out.println(calc.calculate(6, 7));
    }
}


