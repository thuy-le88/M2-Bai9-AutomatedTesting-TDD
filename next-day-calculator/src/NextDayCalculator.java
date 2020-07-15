import java.time.Year;

public class NextDayCalculator {
    private int day,month,year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public NextDayCalculator(){
        
    }
    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String nextDay() {

        String result="";
        boolean leapYear=NextDayCalculator.isLeapYear(year);
        if (day<1||month<1||year<1||month>12) {
            throw new UnsupportedOperationException();
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day>31)
                    throw new UnsupportedOperationException();
                else if (day==31)
                    result= 1+"-"+(month+1)+"-"+year;
                else result= day+1 +"-"+month+"-"+year;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day>30)
                    throw new UnsupportedOperationException();
                else if (day==30)
                    result= 1+"-"+(month+1)+"-"+year;
                else result= day+1 +"-"+month+"-"+year;
                break;
            case 12:
                if (day>31)
                    throw new UnsupportedOperationException();
                else if (day==31)
                    result= 1+"-"+1+"-"+(year+1);
                else result= day+1 +"-"+month+"-"+year;
                break;
            case 2:
                if (leapYear) {
                    if (day>29)
                        throw new UnsupportedOperationException();
                    else if (day==29)
                        result=1 +"-"+3+"-"+year;
                    else result=day+1 +"-"+month+"-"+year;
                } else {
                    if (day>28)
                        throw new UnsupportedOperationException();
                    else if (day==28)
                        result=1 +"-"+3+"-"+year;
                    else result=day+1 +"-"+month+"-"+year;
                }
                break;
        }
        return result;
    }
    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }
}
