package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union, intersection, différence)
 */
public class Exercise10SetOperations {
    
    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        
        for (int n : array) {
            if (n == value) {
                return true;
            }
        }

        return false;
    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {
        int[] temp = new int[array1.length + array2.length];
        int k = 0;
    
        // Parcours du premier tableau
        for (int v : array1) {
            boolean found = false;
    
            for (int i = 0; i < k; i++) {
                if (temp[i] == v) {
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                temp[k++] = v;
            }
        }
    
        // Parcours du second tableau
        for (int v : array2) {
            boolean found = false;
    
            for (int i = 0; i < k; i++) {
                if (temp[i] == v) {
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                temp[k++] = v;
            }
        }
    
        // Création du tableau final de la bonne taille
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
    
        return result;
    }    
    
    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {

        int[] temp = new int[array1.length];
        int k = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    temp[k++] = array1[i];
                }
            }
        }

        int[] result = new int[k];
        
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    
    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
        int compteur = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean present = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    present = true;
                }
            }

            if (!present) {
                compteur++;
            } 
        }

        int[] result = new int[compteur];
        int index = 0;

        for (int elem : array1) {
            boolean present = false;
            for (int val : array2) {
                if (elem == val) {
                    present = true;
                }
            }

            if(!present) {
                result[index++] = elem;
            }
        }

        return result;

    }
    
    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        int[] tableauUnion = union(array1, array2);
        int[] intersection = intersection(array1, array2);
        
        int[] temp = new int[tableauUnion.length];
        int k = 0;

        for (int value : tableauUnion) {
            if (!contains(intersection, value)) {
                temp[k++] = value;
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
    
    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {

        for (int a : array1) {

            boolean found = false;

            for (int b : array2) {
                if (a == b) {
                    found = true;
                    break; // On casse la boucle si la réponse est directement vraie
                }
            }

            if (!found) return false;

        }

        return true;
    }
    
    /**
     * Supprime les doublons d'un tableau
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        int end = array.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (array[i] == array[j]) {
                    int left = j;
                    for (int k = j + 1; k < end; k++, left++) {
                        array[left] = array[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] list = new int[end];

        for (int i = 0; i < end; i++) {
            list[i] = array[i];
        }

        return list;
    }
    
    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
        if (array == null || array.length == 0) return 0;

        Arrays.sort(array);

        int compteur = 1;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                compteur++;
            }
        }

        return compteur;
    }
}
