package test.tasks.simple;

public class Ret2ndMax {

//the algorithm without using arraylist

        public int retInt(int[] args) {

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
                    //   System.out.println(finalArr[i - res]);
                } else {
                    res++;
                }
            }
            return finalArr[finalArr.length -1];



        }



    }


