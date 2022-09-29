package ru.vsu.cs.mvi;

import java.util.Scanner;

public class Main {

    public static int LeonardoNumbersInRange(int a, int b) {
        int tempValue;
        int previousValue = 1;
        int nextValue = 1;
        int count = a == 1 ? 1 : 0;

        while(nextValue <= b){
            tempValue = nextValue;
            nextValue = previousValue + nextValue + 1;
            previousValue = tempValue;
            System.out.println(previousValue + "    " + nextValue);
            if(previousValue >= a){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        System.out.println("Enter b number:");
        int b = scanner.nextInt();

        System.out.println("RESULT: " + LeonardoNumbersInRange(a, b));
    }
}

