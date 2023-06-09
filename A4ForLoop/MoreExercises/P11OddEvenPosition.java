package A4ForLoop.MoreExercises;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n ; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax ) {
                    oddMax = num;
                }
            } else {
                evenSum += num;
                if (num < evenMin ) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (n >= 1) {
        System.out.printf("OddMin=%.2f,%n", oddMin);
        System.out.printf("OddMax=%.2f,%n",oddMax);
        } else {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (n > 1) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n",evenMax);
        } else {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}
