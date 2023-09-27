import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void testParseLineAdd() {
        Assert.assertEquals(Fields.Operation.ADD, Main.parseLine("ADD 0 1").getOp());
    }
}