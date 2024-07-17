package OOP.ADVANCE;

class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    static double avgDate(Holiday h[]) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] != null) {
                sum += h[i].day;
                count++;

            }
        }
        return (double) sum / count;
    }

    boolean isSameMonth(Holiday h1) {
        if (month.equalsIgnoreCase(h1.month)) {
            return true;
        }
        return false;
    }
}

public class HolidayInfo {
    public static void main(String[] args) {
        Holiday[] h = new Holiday[6];
        h[0] = new Holiday("Makarsankrati", 14, "JAN");
        h[1] = new Holiday("Prajasakdin", 26, "JAN");
        h[2] = new Holiday("BirthdayNikhil", 7, "AUG");
        h[3] = new Holiday("BirthDay Dhruvin", 9, "AUG");
        h[4] = new Holiday("NATAL", 25, "DEC");
        System.out.println(h[0].isSameMonth(h[1]));
        System.out.println(h[0].isSameMonth(h[4]));
        System.out.println(Holiday.avgDate(h));
    }
}
