package A6NestedLoops.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P03SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
