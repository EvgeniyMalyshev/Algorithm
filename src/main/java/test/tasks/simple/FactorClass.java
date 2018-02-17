package test.tasks.simple;

public class FactorClass {
    public  String factorFunc(String args) {

        long n = Long.parseLong(args);
        long  factor = 2;

        String finalStr = "Простые множители числа "+ n +": ";

        while ( factor *  factor <= n && n > 1 ) {
            while (n %  factor == 0) {
                finalStr += factor + ", ";
                n /=  factor;
            }

            ++factor;
        }
        if (n > 1) {
            finalStr += n;
        }
        return finalStr;
    }
}
