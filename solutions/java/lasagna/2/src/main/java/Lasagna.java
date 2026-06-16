public class Lasagna {
    public int expectedMinutesInOven(){
        int min = 40;
        return min;
    }

    public int remainingMinutesInOven(int time){
        int time_over = expectedMinutesInOven() - time;
        return time_over;
    }

    public int preparationTimeInMinutes(int layers){
        int min_layers = 2*layers;
        return min_layers;
    }

    public int totalTimeInMinutes(int layers, int min_over){
        int total_layers = 2*layers;
        int add = total_layers + min_over;
        return add;
    }
}
