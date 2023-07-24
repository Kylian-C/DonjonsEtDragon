package fr.campus.dungeon.game;

import fr.campus.dungeon.equipements.Potion.GrandePotion;
import fr.campus.dungeon.equipements.Potion.PotionStandard;

public class PotionCase implements Case{

    PotionStandard potion;

    public PotionCase (){
        affichage();
    }

    @Override
    public void affichage() {
        this.potion = new PotionStandard();
    }

    @Override
    public String toString() {
        return "PotionCase{" +
                "potion=" + potion +
                '}';
    }
}
