package control_statments;

import java.util.Scanner;

public class accpet_utlin_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter numbers  0 to stop");

        do {
            n = scanner.nextInt();
            if (n!= 0) {
                System.out.println("entered:" + n);
            }
        } while (n != 0);
        System.out.println("Program ended.");
        scanner.close();
    }
}
