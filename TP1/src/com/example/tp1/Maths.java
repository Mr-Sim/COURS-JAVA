package com.example.TP1;

import java.util.Scanner;

public class Maths {    // Lit deux entiers en input, renvoie les additions, soustractions, multiplications et divisions de ces entiers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ecrivez un entier :");
        int entier1 = sc.nextInt();
        System.out.println("Ecrivez un autre entier :");
        int entier2 = sc.nextInt();
        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;
        float quotient = entier1 / entier2;
        System.out.println(entier1+" + "+entier2+" = "+somme);
        System.out.println(entier1+" - "+entier2+" = "+difference);
        System.out.println(entier1+" x "+entier2+" = "+produit);
        System.out.println(entier1+" / "+entier2+" = "+quotient);
    }
}
