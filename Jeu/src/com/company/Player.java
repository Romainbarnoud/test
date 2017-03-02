package com.company;

/**
 * Created by Romain on 02/03/2017.
 */
public class Player {
    private String Pseudo;
    private int healthPoints = 50;

public Player(String Pseudo){ //constructeur
    System.out.println("Création d'un joueur");
    this.Pseudo=Pseudo;
}
public String getPseudo(){
    return Pseudo;
    }
public void setPseudo(String Pseudo){
        this.Pseudo = Pseudo;
    }
public int getHealthPoints(){
    return healthPoints;
}
public void hit(){
    this.healthPoints= this.healthPoints - 10;
}
public void heal(){
    this.healthPoints=this.healthPoints + 7;
}

}
