package com.example.TP1;

import java.util.Scanner;
//lit en input un nombre d'articles puis affiche la facture et les réductions en fonction du nombre d'articles.
public class Tarification_dégressive {
    public static void main(String[] args) {
        int prixArticle = 150;
        int facture = 0;
        String reduc = "sans réduction.";
        Scanner sc = new Scanner(System.in);

        System.out.println("Prix de l'article : 150€.");
        System.out.println("Le prix de l'article peux descendre en fonction du nombre d'articles achetés.");
        System.out.println("Réduction de 10% pour plus de 10 acticles achetés.");
        System.out.println("Réduction de 26.67% pour plus de 49 articles achetés.");
        System.out.println("Entrez un nombre entier :");

        int nbArticle = sc.nextInt();
        if (nbArticle > 10) {
            if (nbArticle > 49) {
                prixArticle = 110;
                reduc = "avec 26.67% de réduction.";
            } else {
                prixArticle = 135;
                reduc = "avec 10% de réduction.";
            }
        }
        facture = nbArticle * prixArticle;
        System.out.println("La facture s'élève à " + facture + "€ pour " + nbArticle + " articles " + reduc);
    }
}
