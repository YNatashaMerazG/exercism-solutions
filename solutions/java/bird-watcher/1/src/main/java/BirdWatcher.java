
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int [] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {

        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {

       birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    int suma = 0;
    public int getCountForFirstDays(int numberOfDays) {
        suma = 0;
        if(birdsPerDay.length < numberOfDays ){
            numberOfDays = birdsPerDay.length;

            for(int i = 0; i < numberOfDays; i++){
                suma += birdsPerDay[i];
            }
        } else {
            for(int i = 0; i < numberOfDays; i++){
                suma += birdsPerDay[i];
            }
        }
        return suma;
    }

    int cantdad = 0;
    public int getBusyDays() {
        for(int i = 0 ; i< birdsPerDay.length - 1; i++){
            if(birdsPerDay[i] >= 5){
                cantdad++;
            }
        }
        return cantdad;
    }
}
