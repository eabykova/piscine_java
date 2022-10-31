package ex00;

public class Program {
    public static void main(String[] args) {
        int value = 479598;
        int result = 0;
        int buf;

        while (value % 10 > 1) {
            buf = value % 10;
            value = value / 10;
            result += buf;
        }
        System.out.println(result);
    }
}
