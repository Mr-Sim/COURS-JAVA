package com.example.TP1;

import java.util.Scanner;

//Lit un numéro de département en Input, vérifie sa validité puis affiche si oui ou non le département est en Île-De-France
public class Départements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numDep = 0;

        while(1>0){ //Boucle infinie se répétant tant que le numéro n'est pas valide

            System.out.println("Indiquez votre numéro de département :");
            int depInput = sc.nextInt();

            if(depInput>0 && depInput<100){
                System.out.println("Département valide");
                numDep = depInput;
                break;
            }

            else
                System.out.println("Numéro de département invalide. Entrez un numéro comprit entre 1 et 99");
        }

        if(numDep==75 || numDep==77 || numDep==78 || numDep==91 || numDep==92 || numDep==93 || numDep==94)
            System.out.println("Vous habitez en Île-De-France.");

        else
            System.out.println("Vous n'habitez pas en Île-De-France.");
    }
}
