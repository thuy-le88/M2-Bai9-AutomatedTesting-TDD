import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Absolute of 0")
    public void findAbsoluteOf0() {
        int num=0;
        int expected=0;
        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Absolute of 1")
    public void findAbsoluteOf1() {
        int num=1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Absolute of minus 1")
    public void findAbsoluteOfMinus1() {
        int num=-1;
        int expected=1;
        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }

}