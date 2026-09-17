package demo;

public enum Hour {
    HR5 (5, 30, 18, 30);

    private final int starthr;
    private final int startmin;
    private final int endhr;
    private final int endmin;

    //private constructor for JVM
    Hour(int starthr, int startmin, int endhr, int endmin) {
        this.starthr = starthr;
        this.startmin = startmin;
        this.endhr = endhr;
        this.endmin = endmin;
    }
    @Override
    public String toString() {
        return starthr + ":" + startmin; //......
    }
}
