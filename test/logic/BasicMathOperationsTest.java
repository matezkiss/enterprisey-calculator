import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicMathOperationsTest {

    @Test
    public void testAdd() {
        Assertions.assertEquals(1, BasicMathOperations.add(0, 1));
        Assertions.assertEquals(0, BasicMathOperations.add(-1, 1));
    }

    @Test
    public void testStub() {
        Assertions.assertEquals(-1, BasicMathOperations.sub(0, 1));
        Assertions.assertEquals(0, BasicMathOperations.sub(-1, -1));
    }
}