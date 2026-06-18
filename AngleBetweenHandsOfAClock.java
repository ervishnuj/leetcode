public class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        double h=(double)(hour*30)+((double)minutes/2.0);
        double m=minutes*6;
        System.out.println("Hour : "+h+" Mins: "+m);
        return Math.abs(h-m)>180?360.00-Math.abs(h-m):Math.abs(h-m);
    }
}
