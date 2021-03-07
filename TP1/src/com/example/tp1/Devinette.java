package com.example.TP1;

import java.util.Scanner;
import java.util.Random;

public class Devinette {
    public static void main(String[] args) {


        int nbEssai = 0;
        int randInt = 0;
        Scanner sc = new Scanner(System.in);

        while(1>0){
            nbEssai += 1;
            randInt = (int) (Math.random() * 10 + 1);
            System.out.println("Essai N°" + nbEssai);
            System.out.println("Tentez de deviner un nombre aléatoire entre 1 et 10 :");
            int essai = sc.nextInt();

            if (essai == randInt) {
                System.out.println("Vous avez trouvé le bon nombre aléatoire.");
                break;
            }

            System.out.println("Le bon numéro était " + randInt + ". Essayez encore.");
            System.out.println("#Réinitialisation#");
            System.out.println("#                #");
        }
    }
}
