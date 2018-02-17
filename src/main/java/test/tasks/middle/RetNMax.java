package test.tasks.middle;

public class RetNMax {
    public int retInt(int[] args, int n) {

        //bubble sort
        for (int i = 0; i < args.length; i++) {
            int num = args[i];

            for (int j = i - 1; j >= 0; j--) {
                int leftNumb = args[j];

                if (num < leftNumb) {
                    args[j + 1] = leftNumb;
                    args[j] = num;
                } else {
                    break;
                }
            }
        }

        if (n == 1) {
            return args[args.length-1]; //return 1nd max value

        } else {
            int res = 0;
            for (int i = 0; i < args.length - 1; i++) {
                if (args[i] == args[i + 1]) {
                    res++;      //the number of duplicate values to create a dynamic array
                }
            }

            //create a array without duplicate values
            int[] finalArr = new int[args.length - (res)];
            res = 0;
            for (int i = 1; i < args.length; i++) {
                if (args[i - 1] != args[i]) {
                    finalArr[i - res] = args[i - 1];
                } else {
                    res++;
                }
            }
            return finalArr[finalArr.length - (n-1)];

        }

    }
}
