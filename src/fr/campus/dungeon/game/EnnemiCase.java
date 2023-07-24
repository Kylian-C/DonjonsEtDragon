package fr.campus.dungeon.game;

import fr.campus.dungeon.characters.Ennemi.Mathieucolax;
import fr.campus.dungeon.characters.Ennemi.Ugospectre;
import fr.campus.dungeon.characters.Ennemi.Zakarion;

public class EnnemiCase implements Case{

    //Mathieucolax ennemii;
    Ugospectre ennemi;
    //Zakarion ennemiii;

    public EnnemiCase(){
        affichage();
    }

    @Override
    public void affichage() {
        //this.ennemi = new Mathieucolax("Zakarions");
        this.ennemi = new Ugospectre("Ugospectre");
        //this.ennemiii = new Zakarion("Zakarion");
    }


    @Override
    public String toString() {
        return "EnnemiCase{" +
                //"ennemi=" + ennemi +
                ", ennemii=" + ennemi +
                //", ennemiii=" + ennemiii +
                '}';
    }
}