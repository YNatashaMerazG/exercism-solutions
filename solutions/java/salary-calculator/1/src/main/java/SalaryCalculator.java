public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double res =  (daysSkipped < 5) ? 1.0 : 0.85;
        return res;
    }
    // 10 unidades monetarias x 1 producto vendido si vende 20 o mas son 13 unidades monetarias
    public int bonusMultiplier(int productsSold) {
        int res = (productsSold < 20) ? 10 : 13;
        return res;
    }

    public double bonusForProductsSold(int productsSold) {
       return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salario = 1000.00;
       double sal_fin = (salario * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);

       if(sal_fin < 2000.00){
           return sal_fin;
       }else {
           return 2000.00;
       }
    }
}
