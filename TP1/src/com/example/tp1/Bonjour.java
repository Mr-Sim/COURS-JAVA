package com.example.TP1;

import java.util.Scanner;

public class Bonjour { //Demande le prénom de l'utilisateur, puis affiche "Bonjour" suivi de son prénom
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String nom = sc.next();
        System.out.println("Bonjour "+nom+"!");
    }
}
