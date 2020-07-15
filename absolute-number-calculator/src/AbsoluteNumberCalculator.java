public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        //throw new UnsupportedOperationException();
        //return Math.abs(number);
        /*if (number>=0)
            return number;
        else
            return -number;*/
        //sử dụng toán tử 3 ngôi
        return number>=0?number:-number;
    }
}
