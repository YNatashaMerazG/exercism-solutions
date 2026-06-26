class Leap {
    // 1 divisible entre 4
    // 2. 00 = se divide entre 400?
    boolean isLeapYear(int year) {
        boolean res_4 = (year % 4 == 0);
        boolean res_1 = (year % 100 == 0);
        boolean res_400 = (year % 400 == 0);
        if(res_4 && !res_1 || res_400) {
            return true;
        } else {
            return false;
        }
    }

}
