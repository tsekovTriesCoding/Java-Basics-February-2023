package A5WhileLoop.Lab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name  = scanner.nextLine();
        String pass = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(pass)) {

            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", name);

    }
}
