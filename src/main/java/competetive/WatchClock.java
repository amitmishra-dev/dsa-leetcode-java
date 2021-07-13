package competetive;

public class WatchClock {
    public static void main(String[] args) {
        angleClock(12,30);
    }
    public static double angleClock(int hour, int minutes) {

        double perHour= 30;
        double permin = 6;
        System.out.println((Double.valueOf(hour)%12) + ((Double.valueOf(minutes)/60)*perHour)+"::"+(Double.valueOf(minutes)%60 * permin));
        double res = Math.abs((Double.valueOf(hour)%12 + Double.valueOf(minutes)/60)*perHour - Double.valueOf(minutes)%60 * permin);
        return Math.min(res,360-res);
    }
}
