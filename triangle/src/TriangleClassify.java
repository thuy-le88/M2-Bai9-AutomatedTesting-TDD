public class TriangleClassify {
    public static String triangle(double side1, double side2, double side3 ) {
        String result="";
        double  perimeter=side1+side2+side2;
        double[] side={side1, side2, side3};
        double maxSide=TriangleClassify.findMax(side);
        boolean isOneSideEqualsOrLessThan0 = side1 <= 0 || side2 <= 0 || side3 <= 0;
        if (isOneSideEqualsOrLessThan0) {
            result="không phải là tam giác";
        } else {
            boolean isThreeSideEquals = side1 == side2 && side1 == side3;
            if (isThreeSideEquals) {
                result = "tam giác đều";
            } else {
                boolean isTwoSideEquals = side1 == side2 || side1 == side3 || side2 == side3;
                if (isTwoSideEquals) {
                    return result="tam giác cân";
                }
                else {
                    boolean isThreeSideDifference = maxSide < perimeter / 2;
                    if (isThreeSideDifference) {
                        result="tam giác thường";
                    } else {
                        result="không phải là tam giác";
                    }
                }
            }
        }
        return result;
    }
    public static double findMax(double[] side) {
        double max=side[0];
        for (int i=1;i<side.length;i++) {
            if (max<side[i])
                max=side[i];
        }
        return max;
    }
}
