package com.enterprisey.calculator.logic;

public class Calculation {

    private final Operation op;

    private final Number a;

    private final Number b;


    public Calculation(Operation op, Number a, Number b) {
        this.op = op;
        this.a = a;
        this.b = b;
    }
}
