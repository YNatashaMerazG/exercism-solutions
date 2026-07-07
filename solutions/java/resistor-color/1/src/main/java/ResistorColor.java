import java.util.Locale;

class ResistorColor {
    //black: 0
    //brown: 1
    //red: 2
    //orange: 3
    //yellow: 4
    //green: 5
    //blue: 6
    //violet: 7
    //grey: 8
    //white: 9
    int colorCode(String color) {
        switch (color.toLowerCase(Locale.ROOT)){
            case "black":
                return 0;

            case "brown":
                return 1;

            case "red":
                return 2;

            case "orange":
                return 3;

            case "yellow":
                return 4;

            case "green":
                return 5;

            case "blue":
                return 6;

            case "violet":
                return 7;

            case "grey":
                return 8;

            case "white":
                return 9;

            default:
                break;
        }

        return 00;
    }

    String[] colors() {
        String [] matriz = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return matriz;
    }
}
