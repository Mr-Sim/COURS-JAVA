package com.example.TP2;

import java.util.Scanner;

public class Longueur {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez une phrase et vous connaitrez sa longueur : ");
    String phrase = sc.next();

    int nbChar = phrase.length();
    System.out.println("Votre phrase contient "+ nbChar +" Caractères.");
    }
}
