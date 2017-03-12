package com.company;

import java.util.ArrayList;

/**
 * Created by Romain on 02/03/2017.
 */

public class Player {
    private int numero;
    private String Pseudo;
    private int healthPoints = 5;

public Player(String Pseudo, int numero){ //constructeur
    this.Pseudo=Pseudo;
}
public int getNumero(){
    return numero+1;
}
public void setNumero(){
    this.numero=numero;
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
public void hit(int dommage){

    this.healthPoints= this.healthPoints - dommage;
}
public void heal(int soin){
    this.healthPoints=this.healthPoints + soin;
}


}
