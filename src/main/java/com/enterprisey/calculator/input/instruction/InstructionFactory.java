package com.enterprisey.calculator.input.instruction;

import com.enterprisey.calculator.logic.Calculation;
import com.enterprisey.calculator.logic.Operation;

public class InstructionFactory {

    private InstructionFactory() {
    }

    public static Instruction createInstruction(final String[] tokens) {
        final String command = tokens[0];

        switch (tokens.length) {
            case 1 -> {
                return "EXIT".equalsIgnoreCase(command) ?
                        new ExitInstruction() : new GibberishInstruction();
            }
            case 3 -> {

            }
            default -> new GibberishInstruction();
        }

        final String fullCmd = String.format("{} " +
                "{} {}", command, tokens[1], tokens[2]);


        if ("EXIT".equals(command.toUpperCase())) {
            return new ExitInstruction();
        }

        try {
            Operation operation = Operation.valueOf(command);
            Calculation calculation = null;
            return new CalculationInstruction(command, calculation);
        } catch (IllegalArgumentException ex) {
            System.err.println(String.format("The input:%n%s%nis not valid!",
                    fullCmd));
            return new GibberishInstruction();
        }
    }
}
