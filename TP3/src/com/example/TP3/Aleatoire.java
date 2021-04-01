package com.example.TP3;
import java.util.Scanner;
import java.util.Random;

public class Aleatoire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int nb = 0;
        int nbr = 0;
        int nbTours = 0;
        while(1>0){
            System.out.println("Entrez un nombre entre 1 et 100 : ");
            nb = sc.nextInt();
            if(nb >= 1 && nb <= 100){
                break;
            }
            System.out.println("Entré1e invalide");
        }
        while(nb != nbr){
            nbr = rand.nextInt(100)+1;
            System.out.println(" ; "+nbr);
            nbTours += 1;
        }
        System.out.println(nbTours+" Tirages aléatoires ont été nécessaires pour trouver le nombre entré.");

    }
}

