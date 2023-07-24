package fr.campus.dungeon.characters.type;

import fr.campus.dungeon.characters.Personnage;
import fr.campus.dungeon.equipements.DetailDEF.Philtre;
import fr.campus.dungeon.equipements.DetailOF.Sort;

public class Magiciens extends Personnage{
    public Magiciens(String nom) {
        super(nom);
        setVie(6);
        setAttaque(15);
        setEquipementDef(new Philtre());
        setEquipementOf(new Sort());
    }

    @Override
    public String toString() {
        return "Magiciens{"
                +super.toString()+"}";
    }
}
