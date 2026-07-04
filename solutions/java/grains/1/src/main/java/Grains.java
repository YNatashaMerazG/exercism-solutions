import java.math.BigInteger;

class Grains {
    //64 casillas
    // C1 = 1 || C2 = 2 || C3 = 4 || C5 = 8
    BigInteger grainsOnSquare(final int square) {
        //numero de granos en un cuadrado (square)
        double result = 0;

        if(square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return BigInteger.valueOf(2).pow(square -1);
    }

    BigInteger grainsOnBoard() {

        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }

}
