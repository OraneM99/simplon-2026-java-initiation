package fr.simplon.exercises;

import java.util.stream.Collectors;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {
    
    /**
     * Inverse une chaîne de caractères
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {

        String stringInverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            stringInverse += str.charAt(i);
        }

        return stringInverse;
    }
    
    /**
     * Vérifie si une chaîne est un palindrome
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    
    /**
     * Compte le nombre de voyelles dans une chaîne
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        int nbrVoyelle = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char caractere = str.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                nbrVoyelle++;
            }
        }

        return nbrVoyelle;
    }
    
    /**
     * Compte le nombre de mots dans une chaîne
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {

        int nbrMots = str.split("\\s+").length;
        return nbrMots;
    }
    
    /**
     * Met la première lettre de chaque mot en majuscule
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public static String capitalizeWords(String str) {

        String resultat = "";
        String[] words = str.split(" ");

        for (String word : words) {
            resultat += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ";
        }

        return resultat.trim();
    }    
}
