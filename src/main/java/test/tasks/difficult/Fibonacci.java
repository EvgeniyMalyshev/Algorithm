package test.tasks.difficult;

import java.math.BigInteger;

public class Fibonacci {
    //counting function Fibonacci using BigInteger-lib

    public static BigInteger fibFunc(int inI)throws IllegalArgumentException {
        BigInteger f1 = new BigInteger("1");
        BigInteger f2 = new BigInteger("1");
        BigInteger fSumm = new BigInteger("0");//res. summ

        //check for correct number
        if (inI == 1 || inI == 2){
            return BigInteger.valueOf(1);
        }else if (inI == 0){
            return BigInteger.valueOf(0);
        }else if (inI < 0 ){
            throw new IllegalArgumentException("Fibonacci function cannot be a negative number");

        }

        int i = 2;
        while (i < inI){
            fSumm = f1.add(f2);
            f1 = f2;
            f2 = fSumm;
            i++;
        }
        return fSumm;
    }
}
