package com.exercicis;


public class Exercici0005 {

    public static boolean isPalindrom(String text) {
        text = normalize(text);

        Integer ultimalletra = text.length()-1;
        String invertit = "";
        for (Integer contador = ultimalletra; contador >= 0; contador = contador-1){
            String lletra = String.valueOf(text.charAt(contador));
            invertit = invertit + lletra;
        }
        return text.equals(invertit);
    }

    public static String normalize(String text) {
        String textminus = text.toLowerCase();
        String accents[] = {"à","á","è","é","í","ì","ò","ó","ù","ú"," ","'", "!", "\\.", ",", "·"};
        String noaccents[] = {"a","a","e","e","i","i","o","o","u","u", "", "", "", "", "", ""};
        
        for (int contador=0; contador<accents.length;contador = contador+1){
            textminus = textminus.replace(accents[contador],noaccents[contador]);
        }

        return textminus;
    }
   
    public static void main(String[] args) {
       String[] exemples = {
        "Anul·la la lluna",
        "Atrapa la lluna",
        "Atrapa'l o l'aparta",
        "Aparta'l o atrapa'l",
        "No sap pas on",
        "On sap aps qui",
        "Tramaran anar a Mart",
        "A Mart trobaràn art",
        "Un pop nu",
        "Nu pop un"
       };
       for (String text: exemples){
        boolean esPalindrom = isPalindrom(text);
        System.out.println(text + " (" + (esPalindrom ? "Si" : "No") + ")");
    }
    }
}
