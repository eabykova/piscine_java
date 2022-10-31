package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        if (value < 2) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        } else {
            int i;
            for (i = 2; (i * i) <= value; i++) {
                if (value % i == 0) {
                    System.out.println("false " + (i - 1));
                    return;
                }
            }
            System.out.println("true " + (i - 1));
        }
    }
}
