package app;

import logic.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {
    @Test
    public void testParseLineAdd() {
        Assertions.assertEquals(Operation.ADD, CalculatorApp.parseLine("ADD 0 1").getOp());
    }
}