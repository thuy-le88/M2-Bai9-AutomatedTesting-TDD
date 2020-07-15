import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifyTest {
    @Test
    @DisplayName("")
    public void test222() {
        double side1=2.0;
        double side2=2.0;
        double side3=2.0;
        String expected="tam giác đều";
        String result=TriangleClassify.triangle(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void test223() {
        double side1=2.0;
        double side2=2.0;
        double side3=3.0;
        String expected="tam giác cân";
        String result=TriangleClassify.triangle(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void test345() {
        double side1=3.0;
        double side2=4.0;
        double side3=5.0;
        String expected="tam giác thường";
        String result=TriangleClassify.triangle(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void test823() {
        double side1=8.0;
        double side2=2.0;
        double side3=3.0;
        String expected="không phải là tam giác";
        String result=TriangleClassify.triangle(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void testNegative121() {
        double side1=-1.0;
        double side2=2.0;
        double side3=1.0;
        String expected="không phải là tam giác";
        String result=TriangleClassify.triangle(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void test011() {
        double side1=0.0;
        double side2=1.0;
        double side3=1.0;
        String expected="không phải là tam giác";
        String result=TriangleClassify.triangle(side1,side2,side3);
        assertEquals(expected,result);
    }
}
