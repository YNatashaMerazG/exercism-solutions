class Darts {
    // fuera 0
    // circulo exterior 1 || 10 unidades
    //circulo de enmedio 5 || 5 unidades
    // circulo interior 10 || 1 unidad
    // centrados en (0,0)

    int score(double xOfDart, double yOfDart) {
        int cext = 1;
        int cenm = 5;
        int cint = 10;

        double operx = xOfDart * xOfDart; //0
        System.out.println("x: " + operx);
        double opery = yOfDart * yOfDart; //10 - 100
        System.out.println("y: " + opery);
        double sum = operx + opery; //100
        System.out.println("sum: " + sum);
        double oper = Math.sqrt(sum); //10
        System.out.println("result: " + oper);

        if(oper <= 1){
            return 10;
        } else if (oper <= 5) {
            return 5;
        } else if (oper <= 10){
            return 1;
        }
        return 0;
    }


}
