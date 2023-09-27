package input.instruction;

import logic.Calculation;
import logic.Operation;

public class InstructionFactory {

    private InstructionFactory() {
    }

    public static Instruction createInstruction(final String command,
                                                final String operand1,
                                                final String operand2) {

        final String fullCmd = String.format("{} " +
                "{} {}", command, operand1, operand2);

        if ("EXIT".equals(command)) {
            return new ExitInstruction(command);
        }

        try {
            Operation operation = Operation.valueOf(command);
            Calculation calculation = null;
            return new CalculationInstruction(command, calculation);
        } catch (IllegalArgumentException ex) {
            System.err.println(String.format("The input:%n%s%nis not valid!",
                    fullCmd));
            return new GibberishInstruction(fullCmd);
        }
    }
}
