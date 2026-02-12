package fr.simplon.exercises;

/**
 * Exercice 12: Comparaison et échange d'éléments
 * 
 * Objectif: Apprendre les opérations de base nécessaires pour le tri
 */
public class Exercise12SwappingElements {
    
    /**
     * Échange deux éléments dans un tableau
     * @param array le tableau
     * @param i premier index
     * @param j second index
     */
    public int[] swap(int[] array, int i, int j) {
        int temp = array[i];

        array[i] = array[j];
        array[j] = temp;

        return array;

    }
    
    /**
     * Décale un élément vers la gauche
     * @param array le tableau
     * @param fromIndex position source (plus grande)
     * @param toIndex position destination (plus petite)
     * @return le tableau modifié
     */
    public int[] shiftLeft(int[] array, int fromIndex, int toIndex) {
        int targetValue = array[fromIndex];

        for (int i = fromIndex; i > toIndex; i--) {
            array[i] = array[i - 1];
        }

        array[toIndex] = targetValue;
        return array;
    }
    
    /**
     * Décale un élément vers la droite
     * @param array le tableau
     * @param fromIndex position source (plus petite)
     * @param toIndex position destination (plus grande)
     * @return le tableau modifié
     */
    public int[] shiftRight(int[] array, int fromIndex, int toIndex) {
        int targetValue = array[fromIndex];

        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = array[i + 1];
        }

        array[toIndex] = targetValue;
        return array;
    }
    
    /**
     * Place le plus petit élément au début du tableau
     * @param array le tableau
     * @return le tableau modifié
     */
    public int[] moveSmallestToFront(int[] array) {
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        int minValue = array[minIndex];

        for (int j = minIndex; j > 0; j--) {
            array[j] = array[j - 1];
        }

        array[0] = minValue;

        return array;
    }
    
    /**
     * Place le plus grand élément à la fin du tableau
     * @param array le tableau
     * @return le tableau modifié
     */
    public int[] moveLargestToEnd(int[] array) {
        int maxIndex = 0;
    
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
    
        int maxValue = array[maxIndex];
    
        for (int i = maxIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    
        array[array.length - 1] = maxValue;
        return array;
    }
    
    
    /**
     * Vérifie si deux éléments adjacents sont dans le bon ordre
     * @param array le tableau
     * @param i l'index du premier élément
     * @return true si array[i] <= array[i+1], false sinon
     */
    public boolean isInOrder(int[] array, int i) {
        return array[i] <= array[i + 1];
    }
    
    /**
     * Échange tous les éléments adjacents qui ne sont pas dans le bon ordre
     * (une seule passe)
     * @param array le tableau
     * @return le tableau après une passe
     */
    public int[] bubblePass(int[] array) {
        boolean nextPass = true;

        for (int i = 0; i < array.length - 1; i++) {
                
            for (int j = array.length - 1; j > i; j--) {
                int temp = 0;

                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[i];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
    
    /**
     * Compte le nombre de paires d'éléments adjacents mal ordonnées
     * @param array le tableau
     * @return le nombre de paires où array[i] > array[i+1]
     */
    public int countInversions(int[] array) {
        throw new UnsupportedOperationException();

    }
}
