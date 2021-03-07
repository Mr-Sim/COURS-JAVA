package com.example.TP1;

import java.util.Scanner;

//Lit l'âge de l'utilisateur en input et applique une réduction si l'utilisateur à moins de 26 ans ou plus de 65 ans.
public class Tarif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indiquez votre âge :");
        int age = sc.nextInt();
        if(age>=26 && age<=65) {
            System.out.println("Pleins tarifs");
        }
        else {
            System.out.println("Tarifs réduits");
        }
    }
}
