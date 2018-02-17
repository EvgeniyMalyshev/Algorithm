package test.tasks.simple;

import java.util.Scanner;

public class ChangingCoin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int i, j, k, count = 0;
        for (i = 0; i <= sum; i+=3)
            for (j = i; j <= sum; j+=5)
                for (k = j; k <= sum; k+=7)
                    if (k == sum){
                        System.out.printf("%d * 3 + %d * 5 + %d * 7\n", i/3, (j-i)/5, (k-j)/7);
                        count++;
                    }
        System.out.println("Число вариантов равно " + count);


    }
}
