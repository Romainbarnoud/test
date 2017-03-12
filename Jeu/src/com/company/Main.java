package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList();

        System.out.println("Bienvenue dans ce magnifique jeu");
        System.out.println("Combien y-a-t-il de joueur ?");
        int nombreplayer = scanner.nextInt();
        int d=1;
        do
        {
            System.out.println("Quel est le pseudo du jouer n°"+d+"?");
            String pseudo = scanner.nextLine();
            players.add(new Player(pseudo,d));
            System.out.println("Le joueur n°"+d+" s'appelle "+pseudo);
            d++;
        }while (d!=nombreplayer+1); // Quand on lance le code, pourquoi je ne peux pas rentrer le pseudo du 1er joueur ? J'ai essayé avec d'autres syntaxes et ça faisait pareil

        int longueur= players.size();


        System.out.println("La partie commence. Le joueur n°1 commence");

        boolean Gagner=false;
        while(Gagner!=true){
           while (longueur!=1) {
               for(Player player : players){
                  if (player.getHealthPoints()>0) {
                      hitheal(players, player);
                  }
                  else  {
                    System.out.println("Ce joueur n'a plus de points de vie. Il ne joue donc pas.");
                  }
              }
           }
           System.out.println("Il n'y a plus qu'un joueur en vie! La partie est finie.");
           Gagner=true;
        }
    }


        public static void hitheal(ArrayList<Player> players, Player player){
            Random r = new Random();
            Scanner scanner = new Scanner(System.in);
            //int longueur = players.size(); //longueur de l'arraylist
            int i = players.indexOf(player);
            int o = i+1;
            int c;
            System.out.println("Le joueur n°" + o + " joue. Tu as "+players.get(i).getHealthPoints()+" points de vie.");
            do {
                System.out.println("Appuyez sur 0 pour taper ou sur 1 pour vous soigner!");
                c = scanner.nextInt();
            }
            while (!((c==0) || (c==1)));
            
            if (c == 0) {
                System.out.println("Le joueur n°" + o + " décide de frapper.");
                int dommage = 0 + r.nextInt(11 - 0);
                System.out.println("Quel joueur décidez-vous de frapper ? (indiquez le numéro du joueur à taper)");
                int g = scanner.nextInt();
                System.out.println("Le jouer n°" + o + " inflige " + dommage + " points de vie au joueur n°" + g + ".");
                players.get(g - 1).hit(dommage);
                if (players.get(g - 1).getHealthPoints() <= 0) {
                    System.out.println("Le joueur n°" + g + " est éliminé car le joueur n'a plus de point de vie.");
                    players.remove(players.get(g - 1));    // problème quand c'est le joueur n°1 qui est éliminé
                    System.out.println("Il faut prendre en compte que le joueur n°" + g + " a été éliminé donc le numéro des joueurs changent!");
                } else {
                }
            }
            if (c == 1) {
                System.out.println("Le joueur n°" + o + " décide de se soigner");
                int soin = 0 + r.nextInt(8 - 0);
                System.out.println("Le jouer n°" + o + " récupère " + soin + " points de vie");
                players.get(i).heal(soin);
            }

            }


        }
    
