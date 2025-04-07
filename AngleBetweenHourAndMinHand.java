public class AngleBetweenHourAndMinHand {
    public static void main(String[] args) {
        int hours = 9;
        int mins = 30;

        int hourAngle = (hours*30)+(mins*30/60);
        int minAngle = mins*6;

        double diff = Math.abs(hourAngle-minAngle);

        if(diff > 180){
            diff = 360-diff;

        }

        System.out.println(diff);
    }
}
