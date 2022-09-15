package ru.vsu.cs.mvi;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус малой окружности");
        double radiusSmall = scanner.nextDouble();
        System.out.println("Введите радиус большой окружности");
        double radiusLarge = scanner.nextDouble();
        double squareSmallCircle = Math.pow(radiusSmall, 2) * Math.PI;
        double squareLargeCircle = Math.pow(radiusLarge, 2) * Math.PI;
        double squareResult = ((squareLargeCircle - squareSmallCircle) / 4) * 3 + Math.pow(radiusLarge, 2);
        System.out.println(squareResult);
    }
}