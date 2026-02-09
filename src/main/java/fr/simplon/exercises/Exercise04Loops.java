package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {
    
    /**
     * Calcule la somme des nombres de 1 à n
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i;
        }

        return somme;
    }
    
    /**
     * Inverse un nombre (ex: 123 -> 321)
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }
    
    /**
     * Calcule la factorielle d'un nombre (n!)
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int facteur = 1;
        int i = 1;

        while (i <= n) {
            facteur = facteur * i;
            i++;
        }

        return facteur;
    }
    
    /**
     * Compte le nombre de chiffres dans un nombre
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int compteur = 0;

        while (number != 0) {
            number /= 10;
            compteur++;
        }

        return compteur;
    }

    // On divise le nombre par 10 jusqu'à ce qu'il devienne 0, en comptant les itérations
    
    /**
     * Vérifie si un nombre est premier
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
