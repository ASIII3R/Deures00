package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0003 {
    public static double calcularPreuFinal(double preuBase, double iva, double descompte) {
        double preuAmbIva = preuBase + (preuBase * iva / 100);
        return preuAmbIva - (preuAmbIva * descompte / 100);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Introdueix el preu base: ");
        String preubaseST = scanner.nextLine();
        Double preubase = Double.parseDouble(preubaseST.replace(',','.'));

        System.out.print("Introdueix l'IVA (%): ");
        String IVAST = scanner.nextLine();
        Double IVA = Double.parseDouble(IVAST.replace(',','.'));

        System.out.print("Introdueix el descompte (%): ");
        String descompteST = scanner.nextLine();
        Double descompte = Double.parseDouble(descompteST.replace(',','.'));

        double preuFinal = calcularPreuFinal(preubase, IVA, descompte);
        System.out.printf(localeUS, "El preu final és: %.2f\n", preuFinal);
        
        scanner.close();
    }
}
