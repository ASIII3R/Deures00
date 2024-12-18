package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Escriu el valor en Euros: ");
        String valoreuros = scanner.nextLine();
        double X = Double.parseDouble(valoreuros.replace(',','.'));

        System.out.print("Escriu la tasa de conversió (ex: 1.25) ");
        String tasa = scanner.nextLine();
        double tasafinal = Double.parseDouble(tasa.replace(',','.'));


        double Y = X*tasafinal;

        System.out.printf(localeUS, "El valor de %.2f€ són %.2f$%n", X, Y);

        scanner.close();
    }
}
