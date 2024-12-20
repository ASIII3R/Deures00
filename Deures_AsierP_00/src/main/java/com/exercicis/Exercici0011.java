package com.exercicis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercici0011 {

    public static ArrayList<String> escullNomsAleatoris(ArrayList<String> noms, int quantitat) {
        if (quantitat > noms.size()) {
            throw new IllegalArgumentException("La quantitat no pot ser més gran que " + noms.size() + ".");
        }
        ArrayList<String> seleccionats = new ArrayList<>();
        Random random = new Random();

        ArrayList<String> copia = new ArrayList<>(noms);

        for (Integer i = 0; i<quantitat; i++){
            int index = random.nextInt(copia.size());
            seleccionats.add(copia.remove(index));
        }
        return seleccionats;
    }
   
    public static ArrayList<String> nomsAcabenVocal(ArrayList<String> noms) {
        ArrayList<String> resultat = new ArrayList<>();

        for (String nom: noms){
            char ultima = nom.toLowerCase().charAt(nom.length()-1);
            if ("aeiou".indexOf(ultima)>=0){
                resultat.add(nom);
            }
        }

        return resultat;
    }

    public static ArrayList<String> nomsCompostos(ArrayList<String> noms) {
        ArrayList<String> resultat = new ArrayList<>();
        for (String nom : noms){
            if (nom.contains(" ")){
                resultat.add(nom);
            }
        }
        return resultat;
    }

    public static void main(String[] args) {

        ArrayList<String> noms = new ArrayList<>(Arrays.asList(
            "Mario", "Princess Peach", "Wario", "Luigi", "Iggy Koopa", "Toad", "Yoshi", "Donkey Kong", "Birdo"
        ));
        ArrayList<String> nomsAleatoris = escullNomsAleatoris(noms, 5);
        System.out.println("Noms escollits a l'atzar: " + nomsAleatoris);     
           
        try{
            ArrayList<String> Errors = escullNomsAleatoris(noms, 25);
            System.out.println("Noms escollits: "+ Errors);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        ArrayList<String> vocals = nomsAcabenVocal(noms);
        System.out.println("Noms que acaben amb vocal: "+vocals);

        ArrayList<String> compostos = nomsCompostos(noms);
        System.out.println("Noms compostos: "+compostos);
    }
}
