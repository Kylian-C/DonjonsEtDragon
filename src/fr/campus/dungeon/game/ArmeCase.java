package fr.campus.dungeon.game;

import fr.campus.dungeon.equipements.DetailDEF.Bouclier;
import fr.campus.dungeon.equipements.DetailOF.Arme;

public class ArmeCase implements Case{
    Arme arme;
    public ArmeCase (){
        affichage();
    }

    @Override
    public void affichage() {
        this.arme = new Arme();
    }

    @Override
    public String toString() {
        return "ArmeCase{" +
                "arme=" + arme +
                '}';
    }
}
