package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Romain");
        Player player2 = new Player("Adrien");
        boolean Gagner=false;
        while (Gagner!=true) {
            System.out.println("Le premier joueur joue. Voulez-vous taper ou se soigner?");
            int b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Le premier joueur décide de frapper");
                player2.hit();
                if (player2.getHealthPoints() <=0){
                    Gagner=true;
                    System.out.println("Le joueur 1 a gagné car le joueur 2 n'a plus de point de vie");
                    break;
                }else{
                    Gagner=false;
                }
            } else if (b==1) {
                System.out.println("Le premier joueur décide de se soigner");
                player1.heal();
            }else {
                System.out.println("Rentrer 0 pour frapper ou 1 pour se soigner");
            }

            System.out.println("Le deuxième joueur joue. Voulez-vous taper ou se soigner?");
            int c = scanner.nextInt();
            if (c == 0) {
                System.out.println("Le deuxième joueur décide de frapper");
                player1.hit();
                if (player1.getHealthPoints() <=0){
                    Gagner=true;
                    System.out.println("Le joueur 2 a gagné car le joueur 1 n'a plus de point de vie");
                    break;
                }else{
                    Gagner=false;
                }
            } else if (c==1){
                System.out.println("Le deuxième joueur décide de se soigner");
                player2.heal();
            }else {
                System.out.println("Rentrer 0 pour frapper ou 1 pour se soigner");
            }

        }

    }}

    //extension du jeu:
        // attaque/soin critique (attaquer et soigner d'un nombre aléatoire
        // alléger le code (faire une fonction)
        // choisir le nombre de joueur entre 1 et n
        // 