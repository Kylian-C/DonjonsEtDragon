package fr.campus.dungeon.game;

import fr.campus.dungeon.Mouvements.Avant.CaseApres;

public class MouveCase implements Case{

    CaseApres apres;

    public MouveCase(){
        affichage();
    }

    @Override
    public void affichage() {
        this.apres = new CaseApres();
    }

    @Override
    public String toString() {
        return "VideCase{" +
                "apres=" + apres +
                '}';
    }
}
