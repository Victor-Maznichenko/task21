package ru.vsu.cs.mvi;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static double calculations(double radiusSmall, double radiusLarge){
        double squareSmallCircle = Math.round(Math.pow(radiusSmall, 2) * Math.PI);   //Находим площадь маленького круга
        double squareLargeCircle = Math.round(Math.pow(radiusLarge, 2) * Math.PI);   //Находим площадь большого круга
        double squareArc = (squareLargeCircle - squareSmallCircle) / 4;   // Находим площадь дуги
        double squareQuadrature = Math.pow(radiusLarge, 2);   // Находим площадь квадрата

        return(Math.round((squareQuadrature - squareArc) + squareArc * 3));
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the small circle");
        double radiusSmall = scanner.nextDouble();

        System.out.println("Enter the radius of the great circle");
        double radiusLarge = scanner.nextDouble();

        double result = calculations(radiusSmall, radiusLarge);
        System.out.println(result);
    }
}
