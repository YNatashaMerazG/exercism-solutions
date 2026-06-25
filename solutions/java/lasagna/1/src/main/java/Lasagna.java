public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int min = 40;
        return min;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time){
        int time_over = expectedMinutesInOven() - time;
        return time_over;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int min_layers = 2*layers;
        return min_layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int min_over){
        int total_layers = 2*layers;
        int add = total_layers + min_over;
        return add;
    }
}
