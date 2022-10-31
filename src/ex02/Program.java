package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        int sumOfDigits;
        int coffeeCounter = 0;

        while (true) {
            value = scan.nextInt();
            sumOfDigits = digitSum(value);
            if (value == 42) {
                break ;
            }
            if (isSimple(sumOfDigits)) {
                coffeeCounter++;
            }
        }
        System.out.println("Count of coffee-request - " + coffeeCounter);
    }

    private static int digitSum(int value){
        int result = 0;
        int buf;

        while (value % 10 > 1) {
            buf = value % 10;
            value = value / 10;
            result += buf;
        }
        return (result);
    }

    private static boolean isSimple(int value) {
        for (int i = 2; (i * i) <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
