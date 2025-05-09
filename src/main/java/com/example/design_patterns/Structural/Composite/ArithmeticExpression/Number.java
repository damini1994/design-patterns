package com.example.design_patterns.Structural.Composite.ArithmeticExpression;

public class Number implements ArithmeticExpression {
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is : "+value);
        return value;
    }
}
