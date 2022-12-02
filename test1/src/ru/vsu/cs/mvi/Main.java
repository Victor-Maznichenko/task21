import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void tests() {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            int [] arr = new int[10];
            for (int j = 0; j < arr.length; j++) {
                int randomNum = random.nextInt((15 + 15) + 1) - 15;
                arr[j] = randomNum;
            }
            System.out.println((i + 1) + ") " + solution(arr));
        }
    }

    public static String solution(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        //Проверка на идентичность элементов в массиве
        int countDublicateEl = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                countDublicateEl++;
            }
            if (countDublicateEl == arr.length-1) {
                return "Массив: " + Arrays.toString(arr) + "\nВсе элементы массива равны друг другу\n";
            }
        }

        //Нахождение минимального элемента в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }

        //Нахождение второго по величине элемента в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min2 && min1 < arr[i]) {
                min2 = arr[i];
            }
        }
        return "Массив: " + Arrays.toString(arr) + "\nВторой по величине элемент в массиве: " + min2 + "\n";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1-9 тесты со случайными числами
        tests();

        //10-ый тест на одинаковость
        int a[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("10) " + solution(a));



        //Произвольный массив
        System.out.println("Введите длину массива: ");
        int lengthArrCustom = scanner.nextInt();
        int [] arrCustom = new int[lengthArrCustom];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < lengthArrCustom; i++) {
            arrCustom[i] = scanner.nextInt();
        }
        System.out.println(arrCustom[19]);
        System.out.println(solution(arrCustom));

    }
}
