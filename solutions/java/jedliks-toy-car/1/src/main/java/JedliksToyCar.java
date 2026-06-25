public class JedliksToyCar {
    // 20 = -1%
    private int batteryDisplay = 100;
    private int distanceDisplay = 0;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        if(distanceDisplay <= 2000){
            return "Driven " + distanceDisplay + " meters";
        } else {
            return "Driven 2000 meters";
        }
    }

    public String batteryDisplay() {
        if(batteryDisplay > 0){
            return "Battery at " + batteryDisplay+ "%";
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        distanceDisplay = distanceDisplay + 20;
        batteryDisplay = batteryDisplay - 1;

    }
}
