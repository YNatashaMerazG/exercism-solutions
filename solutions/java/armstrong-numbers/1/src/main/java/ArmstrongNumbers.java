class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String num = Integer.toString(numberToCheck);
        int len = num.length();

        double res = 0;
        for(int i=0; i < len; i++){
           char pos_num = num.charAt(i);
           int real = Character.getNumericValue(pos_num);
           double pot = Math.pow(real, len);

            res += pot;
        }
        return (numberToCheck == res) ? true : false;
    }

}
