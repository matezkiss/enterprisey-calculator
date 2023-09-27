
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {
    @Test
    public void testParseLineAdd() {
        Assertions.assertEquals(Fields.Operation.ADD, Main.parseLine("ADD 0 1").getOp());
    }
}