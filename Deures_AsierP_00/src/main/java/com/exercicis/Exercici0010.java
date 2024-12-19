package com.exercicis;

import java.util.ArrayList;
import java.util.Random;

public class Exercici0010 {

    public static ArrayList<Integer> generarNumerosAleatoris(int quantitat, int min, int max) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (Integer i = 0; i < quantitat; i=i+1){
            numeros.add(random.nextInt(max-min+1)+min);
        }
        return numeros;
    }

    public static ArrayList<Integer> multiplicarPerDos(ArrayList<Integer> llista) {
        ArrayList<Integer> multiplicar = new ArrayList<>();
        for (Integer num: llista){
            multiplicar.add(num*2);
        }
        return multiplicar;
    }

    public static ArrayList<Integer> filtrarImparells(ArrayList<Integer> llista) {
        ArrayList<Integer> imparells = new ArrayList<>();
        for (int num: llista){
            if (num%2 != 0){
                imparells.add(num);
            }
        }
        return imparells;
    }

    public static ArrayList<Double> dividirPerDos(ArrayList<Integer> llista) {
        ArrayList<Double> dividir = new ArrayList<>();
        for (double num: llista){
            dividir.add(num/2.0);
        }
        return dividir;
    }

    public static void main(String[] args) {
        ArrayList <Integer> llistaAleatoria = generarNumerosAleatoris(10, 0, 99);
        System.out.println("Llista inicial: "+ llistaAleatoria);

        ArrayList<Integer> llistaMultiplicada = multiplicarPerDos(llistaAleatoria);
        System.out.println("Llista multiplicada per 2:"+llistaMultiplicada);

        ArrayList<Integer> llistaImparells = filtrarImparells(llistaAleatoria);
        System.out.println("Llista només amb números imparells: "+llistaImparells);

        ArrayList<Double> llistaDividir = dividirPerDos(llistaAleatoria);
        System.out.println("Llista imparells dividirs per 2: "+llistaDividir);

    }
}
