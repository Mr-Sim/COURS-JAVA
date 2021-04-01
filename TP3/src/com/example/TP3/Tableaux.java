package com.example.TP3;

import java.util.Scanner;
import java.util.Random;

public class Tableaux {
    public static void main(String[] args) {
    int tab[];
    tabInit(tab[]);
    }
    public static void tabInit(int tab[]){
        Random rand = new Random();
        for(int i=0; i<10; i++){
            tab[i]= rand.nextInt(100)+1;
        }
    }
}
