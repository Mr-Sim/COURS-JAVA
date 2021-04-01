package com.example.TP3;

import java.util.Random;

public class PairImpair {
    public static void main(String[] args) {
        Random rand = new Random();
        int nbTours = 0;
        int valide = 0;
        int nb1 = 0;
        int nb2 = 0;
        int nb3 = 0;
        System.out.println("Début");

        while(valide == 0){
            nb1 = rand.nextInt(1000)+1;
            nb2 = rand.nextInt(1000)+1;
            nb3 = rand.nextInt(1000)+1;
            nbTours += 1;
            valide = validation(nb1, nb2, nb3, valide);
        }
        System.out.println(nb1 +", "+ nb2 +", "+ nb3 +" Sont une suite de nombre entre 1 et 1000. Le premier nombre est pair, les autres impaires.");
        System.out.println(nbTours + " tirages aléatoires ont été necessaires pour arriver à ce résultat.");
    }
    public static int validation(int nb1, int nb2, int nb3, int valide){
        if(nb1%2==0 && nb2%2==1 && nb3%2==1)
            valide = 1;
            return valide;
    }
}
