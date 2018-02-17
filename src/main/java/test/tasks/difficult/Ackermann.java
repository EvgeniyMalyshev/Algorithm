package test.tasks.difficult;

public class Ackermann {
    //function Ackermann using recursion-method.

    public static int ackFunc(int n, int m) {


        if (n==0) {
            return m + 1;
        } else if (m== 0) {
            return ackFunc(n - 1, 1);
        } else
            return ackFunc(n - 1, ackFunc(n, m-1));
    }
}
