public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //221 * 1hr
        int cars = 221;
        double exit = 0;
        if(speed == 10){
            int prod = cars * speed;
            exit = prod * 0.77;
        } else if (speed == 9){
            int prod = cars * speed;
            exit = prod * 0.8;
        } else if (speed >= 5 && speed <= 8){
            int prod = cars * speed;
            exit = prod * 0.9;
        } else if (speed >= 1 && speed <= 4){
            int prod = cars * speed;
            exit = prod;
        }

        return exit;
    }

    public int workingItemsPerMinute(int speed) {
        //221 / 60 = 3,6
        // 3,6 * 6 = 21,6
        // 21,6 * 0,9 = 19,44

         // 1193,4
        int result = (int) productionRatePerHour(speed) / 60;
        return result;
    }
}
