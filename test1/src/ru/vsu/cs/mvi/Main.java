package ru.vsu.cs.mvi;

import java.util.Scanner;

public class Main {

    public static int LeonardoNumbersInRange(int a, int b) {
        int tempValue;
        int previousValue = 1;
        int nextValue = 1;
        int count = 1;
        while(previousValue <= b){
            tempValue = nextValue;
            nextValue = previousValue + nextValue + 1;
            previousValue = tempValue;
            System.out.println(nextValue);
            if(nextValue >= a){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();

        System.out.println("RESULT: " + LeonardoNumbersInRange(a, b));
    }
}

