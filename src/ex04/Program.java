package ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input = "";
        int [] base = new int[65536];

        if (scan.hasNextLine()) {
            input = scan.next();
        }
        char[] inputChars = input.toCharArray();

        for (int i = 0; i < inputChars.length; i++) {
            for (int j = 0; j < base.length; j++) {
                if ((int)inputChars[i] == j) {
                    base[j]++;
                }
            }
        }
        for (int i = 0; i < base.length; i++) {
            if (base[i] != 0)
                System.out.println(base[i]);
        }
    }
    private static void endError() {
        System.err.println("IllegalArgument");
        System.exit(-1);
    }
}
