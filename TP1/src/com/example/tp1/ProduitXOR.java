package com.example.TP1;

import java.util.Scanner;

//Lit deux entiers en input, puis affiche le signe du produit des deux entiers sans réaliser la multiplication.
public class ProduitXOR {
    public static void main(String[] args) {
        int int1 = 0;
        int int2 = 0;
        String signe = "positif";

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier positif ou négatif");
        int input1 = sc.nextInt();
        System.out.println("Entrez un autre entier positif ou négatif");
        int input2 = sc.nextInt();

        if (input1 < 0)
            int1 = 1;
        if (input2 < 0)
            int2 = 1;
        int result = int1 ^ int2; //Utilisation de l'opérateur XOR pour déterminer le signe du produit. Si le résultat = 1 alors le produit est négatif.
        if (result == 1)
            signe = "négatif";

        System.out.println("Le produit de "+input1+" et de "+input2+" est "+signe+".");
    }
}