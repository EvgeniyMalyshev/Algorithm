package test.tasks.difficult;

public class Factorial {
    //counting function factorial without using BigInteger-lib

    static long[] table = new long[21];//the maximum number of long-type 20
    static {
        table[0]=1;
    }

    static int last = 0;//the number of the last computed factorial.

    public static long factFunc(int inI) throws IllegalArgumentException {
        //process exceptions
        if (inI>=table.length)
            throw new IllegalArgumentException("The overflow variable");
        if (inI<0)
            throw new IllegalArgumentException("Factorial cannot be a negative number");
        //calculated factorial
        while(last < inI) {
            table[last + 1] = table[last] * (last + 1);
            last++;
        }
        return table[inI];
    }

}
