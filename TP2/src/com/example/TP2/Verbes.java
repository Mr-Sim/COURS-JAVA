package com.example.TP2;

import java.util.Scanner;
import java.lang.Object;

public class Verbes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbChar = 2;
        System.out.println("Ecrivez un verbe à l'infinitif :");
        String intVerb = sc.next();

        String groupe = " n'est pas un verbe";


        if(intVerb.endsWith("er"))
            groupe = " est un verbe de premier groupe.";

        else if(intVerb.endsWith("ir")) {
            groupe = " est un verbe de deuxième groupe.";
            if(intVerb.endsWith("oir"))
                groupe = " est un verbe de troisième groupe";
        }
        else if(intVerb.endsWith("oire")) {
            groupe = " est un verbe de troisième groupe.";
        }
        System.out.println(intVerb+groupe);
    }
}

