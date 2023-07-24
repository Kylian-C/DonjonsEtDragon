package fr.campus.dungeon.characters.Ennemi;

import fr.campus.dungeon.characters.Personnage;
import fr.campus.dungeon.equipements.DetailDEF.Armure;
import fr.campus.dungeon.equipements.DetailOF.Arc;

public class Ugospectre extends Personnage {
    public Ugospectre (String nom) {
        super(nom);
        setVie(15);
        setAttaque(15);
        setEquipementDef(new Armure());
        setEquipementOf(new Arc());
    }

    @Override
    public String toString() {
        return "Ugospectre{"
                +super.toString()+"}";
    }
}
