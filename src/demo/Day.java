package demo;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY;

    @Override
    public String toString() {
        return "Today is " + name();
    }

    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.TUESDAY;
        day1.compareTo(day2);
        System.out.println(day1);
        int i = 12;
        Integer j = 12; //autoboxing


    }
}
