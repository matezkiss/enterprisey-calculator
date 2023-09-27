package input;

import input.instruction.Instruction;

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
        return null;
    }
}
