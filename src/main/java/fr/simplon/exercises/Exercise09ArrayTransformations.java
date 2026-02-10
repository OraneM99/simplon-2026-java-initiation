package fr.simplon.exercises;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux existants
 */
public class Exercise09ArrayTransformations {
    
    /**
     * Double tous les éléments d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
       int[] doubled = new int[array.length];

       for (int i = 0; i < array.length; i++) {
            doubled[i] = array[i] * 2;
       }

       return doubled;

    }
    
    /**
     * Filtre les nombres pairs d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int compteur = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                compteur++;
            }
        }
    
        int[] filArray = new int[compteur];
        int j = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                filArray[j] = array[i];
                j++;
            }
        }
    
        return filArray;
    }
    
    /**
     * Copie un tableau dans l'ordre inverse
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {

        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }
    
    /**
     * Concatène deux tableaux
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int len = array1.length + array2.length;
        int[] resultat = new int[len];

        int position = 0;

        for (int i : array1) {
            resultat[position] = i;
            position++;
        }

        for (int i : array2) {
            resultat[position] = i;
            position++;
        }

        return resultat;
    }
    
    /**
     * Extrait une sous-partie d'un tableau
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int[] newTable = new int[end - start]; 

        for (int i = start; i < end; i++) {
            newTable[i - start] = array[i];
        }

        return newTable;
    }
}
