package com.example.TP2;

import java.util.Scanner;

public class Mot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un mot : ");
        String mot = sc.next();

        int longueur = mot.length();
        String prefixe = mot.substring(0,1);
        String suffixe = mot.substring(longueur-1);
        System.out.println("Longueur du mot : "+longueur+". Mot commence par "+prefixe+". Mot termine par "+suffixe+".");
    }

}
