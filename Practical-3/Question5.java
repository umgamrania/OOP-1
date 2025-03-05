class Time {
    int hour;
    int minute;

    void setTime(int h, int m) {
        hour = h;
        minute = m;
    }

    public void sum(Time t1, Time t2) {
        this.minute = (t1.minute + t2.minute) % 60;
        this.hour = t1.hour + t2.hour + ((t1.minute + t2.minute) / 60);
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.setTime(2, 30);

        Time t2 = new Time();
        t2.setTime(5, 40);

        Time t3 = new Time();
        t3.sum(t1, t2);

        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
    }
}
