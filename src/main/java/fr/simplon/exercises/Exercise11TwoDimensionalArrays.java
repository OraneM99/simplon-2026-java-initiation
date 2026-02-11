package fr.simplon.exercises;

import java.util.stream.IntStream;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    /**
     * Crée une matrice remplie de zéros
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {
        return new int[rows][cols];
    }
    
    /**
     * Calcule la somme de tous les éléments d'une matrice
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {
        int somme = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                somme += matrix[i][j];
            }
        }

        return somme;
    }
    
    /**
     * Trouve le maximum dans une matrice
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {
       int max = matrix[0][0];
       
       for (int[] row : matrix) {
        for (int value : row) {
            if (value > max) {
                max = value;
                }
            }
       }

       return max;
    }
    
    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
        int[][] temp = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[j][i] = matrix[i][j];
            }
        }

        return temp;
    }
    
    /**
     * Retourne la diagonale principale d'une matrice carrée
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {
        int n = matrix.length;
        int[] diagonal = new int[n];
    
        for (int i = 0; i < n; i++) {
            diagonal[i] = matrix[i][i];
        }
    
        return diagonal;
    }   
}
