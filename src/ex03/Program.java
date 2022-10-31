package ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input;
        int     week = 0;
        long    ratings = 0;

        for (int i = 1; i < 19; i++) {
            if (scan.hasNextLine()) {
                input = scan.next();
                if (!input.equals("Week")) {
                    if (input.equals("42")) {
                        break;
                    }
                    endError();
                } else if (scan.hasNextInt()) {
                    week = scan.nextInt();
                    if (week == i) {
                        ratings = ratings + findMin(week, scan);
                    } else {
                        endError();
                    }
                } else {
                    endError();
                }
            } else {
                endError();
            }
        }
        printResult(ratings, week);
        scan.close();
        System.exit(0);

    }
    private static void endError() {
        System.err.println("IllegalArgument");
        System.exit(-1);
    }

    private static long findMin(int week, Scanner scan) {
        long    buf;
        long    minScore = 10;

        for (int i = 0; i < 5; i++) {
            if (scan.hasNextInt()) {
                buf = scan.nextInt();
                if (buf > 0 && buf < 10) {
                    if (minScore > buf) {
                        minScore = buf;
                    }
                } else {
                    endError();
                }
            } else {
                endError();
            }
        }
        for (int i = 0; i < week -  1; i++) {
            minScore *= 10;
        }
        return minScore;
    }

    private static void printResult(long raitings, int week) {
        for (int i = 1; i <= week; i++) {
            System.out.print("Week " + i + " ");
            for (int j = 0; j < raitings % 10; j++) {
                System.out.print("=");
            }
            System.out.println(">");
            raitings /= 10;
        }
    }
}
