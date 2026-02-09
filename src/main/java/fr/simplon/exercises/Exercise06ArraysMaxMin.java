package fr.simplon.exercises;

/**
 * Exercice 6: Tableaux - Recherche du maximum et minimum
 * 
 * Objectif: Apprendre à trouver le plus grand et le plus petit élément d'un tableau
 */
public class Exercise06ArraysMaxMin {
    
    /**
     * Trouve le maximum dans un tableau
     * @param array le tableau
     * @return la valeur maximale
     */
    public int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
    
    /**
     * Trouve le minimum dans un tableau
     * @param array le tableau
     * @return la valeur minimale
     */
    public int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    
    /**
     * Trouve l'index du maximum dans un tableau
     * @param array le tableau
     * @return l'index de la valeur maximale (le premier si plusieurs)
     */
    public int findMaxIndex(int[] array) {
        int maxIndex = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
    
    /**
     * Trouve l'index du minimum dans un tableau
     * @param array le tableau
     * @return l'index de la valeur minimale (le premier si plusieurs)
     */
    public int findMinIndex(int[] array) {
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            minIndex = array[i] < array[minIndex] ? i : minIndex;
        }

        return minIndex;
    }
    
    /**
     * Calcule la différence entre le max et le min
     * @param array le tableau
     * @return la différence max - min
     */
    public int range(int[] array) {
      
      int min = array[0];
      int max = array[0];

      for (int i : array) {
        if (i < min) {
            min = i;
        }

        if (i > max) {
            max = i;
        }
      }
      return max - min;
    }
}
