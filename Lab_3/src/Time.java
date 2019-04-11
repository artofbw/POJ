// Exercise 03_05
// praca w parach: Łukasz Cwikliński s19334, Damian Brzoskowski s18499

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        this.second += 1;
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        return this;
    }

    public static void main(String[] args) {
        Time time = new Time(22, 10,45);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        time.setHour(11);
        time.setMinute(11);
        time.setSecond(11);

        System.out.println(time);

        time.setTime(10, 10, 10);

        System.out.println(time);

        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
    }
}