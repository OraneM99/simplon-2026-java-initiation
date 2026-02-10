package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un tableau
 */
public class Exercise07ArraysSumAverage {
    
    /**
     * Calcule la somme de tous les éléments d'un tableau
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {
        int somme = 0;

        for (int i = 0; i < array.length; i++) {
            somme += array[i];
        }

        return somme;

    }
    
    /**
     * Calcule la moyenne des éléments d'un tableau
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        double somme = 0;  // Double pour stocker des valeurs beaucoup plus grandes qu'un int

        for (int i = 0; i < array.length; i++) {
            somme += array[i];
        }

        return somme / array.length;
    
    }
    
    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
        int somme = 0;

        for (int i = 0; i < array.length; i++) {
            somme += array[i];
        }

        double average = somme / array.length;

        int compteur = 0;

        for (int j = 0;  j < array.length; j++) {
            if (array[j] > average) {
                compteur++;
            }
        }

        return compteur;
    }

    
    /**
     * Calcule la somme des nombres pairs dans un tableau
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
        int sumEven = 0;
    
        for (int i : array) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
    
        return sumEven;
    }    
    
    /**
     * Calcule le produit de tous les éléments d'un tableau
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {
        int produit = 1;

        for (int i : array) {
            produit *= i;
        }

        return produit;
    }
}
