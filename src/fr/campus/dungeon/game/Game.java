package fr.campus.dungeon.game;

import fr.campus.dungeon.menu.Menu;

import java.util.ArrayList;

public class Game {

    Menu para;

    public Game (Menu para){ //constructeur
        this.para = para;
        jouerGame();
    }
    public void jouerGame() { //Methode

        int jouer_un_tour = 4;
        int positionJoueur = 0;
        int dice = 1;

        ArrayList<Case> list = new ArrayList();
        list.add(new MouveCase());
        list.add(new PotionCase());
        list.add(new ArmeCase());
        list.add(new EnnemiCase());
        System.out.println("");

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));


        for (int i = 0; i < list.size(); i++) {
            //System.out.print("Votre"+ para.getMonGuerrier() +" est a la position: "+positionJoueur+" ");
            System.out.println("Votre "+ para.getPersoPrincipale()+ ".");
            System.out.print("est a la position: "+positionJoueur+ " il avance est trouve un(e) " + list.get(i) + ".");
            System.out.println("");
            positionJoueur += dice;
            jouer_un_tour -= dice;

        }


    }

}
