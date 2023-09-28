package com.enterprisey.calculator.input.instruction;

public abstract class ExecutableInstruction implements Instruction {

    @Override
    public boolean executable() {
        return true;
    }

}
