package fr.campus.dungeon.characters.type;

import fr.campus.dungeon.characters.Personnage;
import fr.campus.dungeon.equipements.DetailDEF.Bouclier;
import fr.campus.dungeon.equipements.DetailOF.Arme;

public class Guerriers extends Personnage {

    public Guerriers(String nom) {
        super(nom);
        setVie(10);
        setAttaque(10);
        setEquipementDef(new Bouclier());
        setEquipementOf(new Arme());
    }

    @Override
    public String toString() {
        return "Guerriers{"
                +super.toString()+"}";
    }
}
