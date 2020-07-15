
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("")
    public void nextDayOf112018() {
        int day=1;
        int month=1;
        int year=2018;
        String expected="2-1-2018";
        NextDayCalculator nextDay1=new NextDayCalculator(day,month,year);
        String result=nextDay1.nextDay();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void nextDayOf3112018() {
        int day=31;
        int month=1;
        int year=2018;
        String expected="1-2-2018";
        NextDayCalculator nextDayCalculator=new NextDayCalculator(day,month,year);
        String result=nextDayCalculator.nextDay();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void nextDayOf3042018() {
        int day=30;
        int month=4;
        int year=2018;
        String expected="1-5-2018";
        NextDayCalculator nextDayCalculator=new NextDayCalculator(day,month,year);
        String result=nextDayCalculator.nextDay();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void nextDayOf2822018() {
        int day=28;
        int month=2;
        int year=2018;
        String expected="1-3-2018";
        NextDayCalculator nextDayCalculator=new NextDayCalculator(day,month,year);
        String result=nextDayCalculator.nextDay();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void nextDayOf2922020() {
        int day=29;
        int month=2;
        int year=2020;
        String expected="1-3-2020";
        NextDayCalculator nextDayCalculator=new NextDayCalculator(day,month,year);
        String result=nextDayCalculator.nextDay();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("")
    public void nextDayOf31122018() {
        int day=31;
        int month=12;
        int year=2018;
        String expected="1-1-2019";
        NextDayCalculator nextDayCalculator=new NextDayCalculator(day,month,year);
        String result=nextDayCalculator.nextDay();
        assertEquals(expected,result);
    }

}
