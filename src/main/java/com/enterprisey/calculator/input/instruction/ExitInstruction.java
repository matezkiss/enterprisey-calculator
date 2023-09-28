package com.enterprisey.calculator.input.instruction;

public class ExitInstruction extends ExecutableInstruction {

    @Override
    public void execute() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
