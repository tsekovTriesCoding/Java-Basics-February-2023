package A4ForLoop.Lab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumEvenPosition = 0;
        int sumOddPosition = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumEvenPosition = sumEvenPosition + currentNum;
            } else {
                sumOddPosition = sumOddPosition + currentNum;
            }
        }

        if (sumEvenPosition == sumOddPosition) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEvenPosition);
        } else {
            int diff = Math.abs(sumEvenPosition - sumOddPosition);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);

        }
    }
}
