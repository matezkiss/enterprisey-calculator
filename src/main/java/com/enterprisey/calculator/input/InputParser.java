package com.enterprisey.calculator.input;

import com.enterprisey.calculator.input.instruction.GibberishInstruction;
import com.enterprisey.calculator.input.instruction.Instruction;
import com.enterprisey.calculator.input.instruction.InstructionFactory;

import java.util.Scanner;

public class InputParser {

    private static final Scanner in = new Scanner(System.in);

    private InputParser() {
    }

    public static Instruction parse() {
        return parse(in.nextLine());
    }

    protected static Instruction parse(final String line) throws IllegalArgumentException {

        String[] tokens = line.split(" ");

        if (tokens[0].length() < 3) {
            System.err.println(String.format("Command \"%s\" too short!",
                    tokens[0]));
            return new GibberishInstruction();
        } else if (tokens.length == 1 || tokens.length == 3) {
            return InstructionFactory.createInstruction(tokens);
        }

        return new GibberishInstruction();
    }
}
