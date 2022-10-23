import java.util.Scanner;

public class Main {
    public static void printStarTriangle(int s) {
        int halfS = s / 2;

        for (int i = 0; i < halfS; i++) {
            for(int j = 0; j < halfS; ++j) {
                System.out.print(' ');
            }
            for (double j = 0; j < (halfS - i); j++) {
                double countJ = halfS - i;
                if ((countJ == halfS) || (Math.ceil(countJ / 2) < 2) || (j == 0) || (j == countJ - 1)){
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

        for(double i = 1; i <= halfS; ++i) {
            for(int g = 1; g <= (halfS - i); ++g) {
                System.out.print(' ');
            }
            for(int j = 1; j <= i; ++j) {
                if ((i == halfS) || (Math.ceil(i / 2) < 2) || (j == 1) || (j == i)){
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите четное число s:");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        printStarTriangle(s);
    }
}
