package com.enterprisey.calculator.input.instruction;

import com.enterprisey.calculator.logic.Calculation;

public class CalculationInstruction extends ExecutableInstruction {

    private final Calculation calculation;

    public CalculationInstruction(String instruction, Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void execute() {

    }
}
